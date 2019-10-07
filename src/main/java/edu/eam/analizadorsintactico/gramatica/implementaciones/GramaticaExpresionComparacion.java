/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eam.analizadorsintactico.gramatica.implementaciones;

import edu.eam.analizadorlexicos.Lexema;
import edu.eam.analizadorlexicos.TipoLexemaEnum;
import edu.eam.analizadorsintactico.gramatica.definiciones.Gramatica;
import static edu.eam.analizadorsintactico.gramatica.definiciones.Gramatica.posicionInicial;
import edu.eam.analizadorsintactico.sentencias.definicion.Sentencia;
import edu.eam.analizadorsintactico.sentencias.implementaciones.Expresion;
import java.util.ArrayList;

/**
 *
 * @author dani0
 */
public class GramaticaExpresionComparacion implements Gramatica{
    
    @Override
    public Sentencia analizar(ArrayList<Lexema> arrayLexemas) {
//Sentencia a retornar....
        Expresion expresion = new Expresion();
        //  flujoTokens.guardarPosicion();
        int posI = posicionInicial;
        int posA = posicionInicial;
        //primer token de la gramatica.
        Lexema lexema = arrayLexemas.get(posA);

        //tipo de dato.....
        if (lexema.getTipo() == TipoLexemaEnum.IDENT/*expresion logica*/) {
            expresion.setExpresionLogica(lexema);
            posA++;
            lexema = arrayLexemas.get(posA);

            //nombre del atributo....
            if (lexema.getTipo() == TipoLexemaEnum.IDENT) {
                expresion.setIdent(lexema);
                posA++;
                lexema = arrayLexemas.get(posA);

                if (lexema.getTipo() == TipoLexemaEnum.IDENT/*llamado funcion*/) {
                    expresion.setLlamadoFuncion(lexema);
                    posA++;
                    lexema = arrayLexemas.get(posA);

                    if (lexema.getToken().equals(";")) {
                        //derivar...
                        return expresion;
                    } else {
                        //si no es identificador, no es atributo, se retorna el flujo a 
                        //la posicion inicial
                        posA = posI;
                        return null; //se retorna null para que se pruebe con otra regal..
                    }
                } else {
                    posA = posI;
                    return null; //
                }
            } else {
                //si no es identificador, no es atributo, se retorna el flujo a 
                //la posicion inicial
                posA = posI;
                return null; //se retorna null para que se pruebe con otra regal..
            }

        }
        return null;
    }

    
}
