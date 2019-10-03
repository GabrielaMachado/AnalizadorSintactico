/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eam.analizadorsintactico.gramatica.implementaciones;

import edu.eam.analizadorlexicos.Lexema;
import edu.eam.analizadorlexicos.TipoLexemaEnum;
import edu.eam.analizadorsintactico.gramatica.definiciones.Gramatica;
import edu.eam.analizadorsintactico.sentencias.definicion.Sentencia;
import edu.eam.analizadorsintactico.sentencias.implementaciones.Atributo;
import java.util.ArrayList;

/**
 *
 * @author dani0
 */
public class GramaticaAtributo implements Gramatica {

    @Override
    public Sentencia analizar(Sentencia padre, ArrayList<Lexema> arrayLexemas) {
//Sentencia a retornar....
        Atributo atributo = new Atributo();
        //  flujoTokens.guardarPosicion();
        int posI = posicionInicial;
        int posA = posicionInicial;
        //primer token de la gramatica.
        Lexema lexema = arrayLexemas.get(posA);


        //tipo de dato.....
        if (lexema.getTipo() == TipoLexemaEnum.IDENT.toString() || lexema.getTipo() == TipoLexemaEnum.TIPO_DATO.toString()) {
            atributo.setTipoDato(lexema);
            posA++;
            lexema = arrayLexemas.get(posA);

            //nombre del atributo....
            if (lexema.getTipo() == TipoLexemaEnum.IDENT.toString()) {
                atributo.setIdent(lexema);
                posA++;
                lexema = arrayLexemas.get(posA);
                
                   //     modificador de acceso del atributo...
     //   esto es opcional, por eso no tiene else
        if (lexema.getTipo() == TipoLexemaEnum.INICIALIZACION.toString()) {
            atributo.setInicializacion(lexema);
            posA++;
                lexema = arrayLexemas.get(posA);
        }
        
        if (lexema.getToken().equals(",")) {
            atributo.setInicializacion(lexema);
            posA++;
                lexema = arrayLexemas.get(posA);
        }
                

                if (lexema.getToken().equals(";") ){
                    //derivar...
                    return atributo;
                } else {
                    //si no es identificador, no es atributo, se retorna el flujo a 
                    //la posicion inicial
                    posA = posI;
                    return null; //se retorna null para que se pruebe con otra regal..
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
