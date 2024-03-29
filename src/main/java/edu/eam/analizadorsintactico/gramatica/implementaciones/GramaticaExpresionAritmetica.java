/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eam.analizadorsintactico.gramatica.implementaciones;

import edu.eam.analizadorlexicos.Lexema;
import edu.eam.analizadorlexicos.TipoLexemaEnum;
import static edu.eam.analizadorsintactico.controlador.AnalizadorSintactico.posicion;
import edu.eam.analizadorsintactico.gramatica.definiciones.Gramatica;
import static edu.eam.analizadorsintactico.gramatica.definiciones.Gramatica.posicionInicial;
import edu.eam.analizadorsintactico.sentencias.definicion.Sentencia;
import edu.eam.analizadorsintactico.sentencias.implementaciones.Expresion;
import edu.eam.analizadorsintactico.sentencias.implementaciones.ExpresionAritmetica;
import edu.eam.analizadorsintactico.sentencias.implementaciones.OpAritmetico;
import java.util.ArrayList;

/**
 *
 * @author dani0
 */
public class GramaticaExpresionAritmetica implements Gramatica{
    
    @Override
    public Sentencia analizar(ArrayList<Lexema> arrayLexemas) {
        OpAritmetico operadorAritmetico;
        GramaticaOpAritmetico gramaticaOpAritmetico = new GramaticaOpAritmetico();
        ExpresionAritmetica expresionAritmetico = new ExpresionAritmetica();
        //  flujoTokens.guardarPosicion();
        int posI = posicion;
        int posA = posicion;
        //primer token de la gramatica.
        Lexema lexema = arrayLexemas.get(posA);

        //tipo de dato.....
        if (lexema.getTipo() == TipoLexemaEnum.IDENT/*numero1*/) {
            expresionAritmetico.setNumero1(lexema);
            posA++;
            posicion = posA;
            lexema = arrayLexemas.get(posA);

            operadorAritmetico = (OpAritmetico) gramaticaOpAritmetico.analizar(arrayLexemas);
            //tipo de dato.....
            if (operadorAritmetico != null) {
                expresionAritmetico.setOperadorAritmeticos(operadorAritmetico);
                posA++;
                posicion = posA;
                lexema = arrayLexemas.get(posA);

                if (lexema.getTipo() == TipoLexemaEnum.IDENT/*numero2*/) {
                    expresionAritmetico.setNumero2(lexema);
                    posA++;
                    lexema = arrayLexemas.get(posA);

                    if (lexema.getToken().equals(";")) {
                        posicion = posA;
                        return expresionAritmetico;
                    } else {
                        //si no es identificador, no es atributo, se retorna el flujo a 
                        //la posicion inicial
                        return expresionAritmetico; //se retorna null para que se pruebe con otra regal..
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
