/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eam.analizadorsintactico.gramatica.implementaciones;

import edu.eam.analizadorlexicos.FlujoTokens;
import edu.eam.analizadorlexicos.Lexema;
import edu.eam.analizadorlexicos.TipoLexemaEnum;
import static edu.eam.analizadorsintactico.controlador.AnalizadorSintactico.posicion;
import edu.eam.analizadorsintactico.gramatica.definiciones.Gramatica;
import edu.eam.analizadorsintactico.sentencias.definicion.Sentencia;
import edu.eam.analizadorsintactico.sentencias.implementaciones.SentenciaMain;
import java.util.ArrayList;

/**
 *
 * @author dani0
 */
public class GramaticaMain implements Gramatica {

    @Override

    public Sentencia analizar(FlujoTokens flujoTokens) {
//Sentencia a retornar....
        SentenciaMain sentenciaMain = new SentenciaMain();
        flujoTokens.guardarPosicion();
        Lexema lexema = flujoTokens.getTokenActual();


        //tipo de dato.....
        if (lexema.getTipo() == TipoLexemaEnum.IDENT) {
            sentenciaMain.setMain(lexema);
            lexema = flujoTokens.avanzar();

            //nombre del atributo....
            if (lexema.getTipo() == TipoLexemaEnum.AGR_OPENKEY) {
                sentenciaMain.setOpenKey(lexema);
                lexema = flujoTokens.avanzar();

                if (lexema.getToken().equals("cuerpo")) {
                    sentenciaMain.setCuerpo(lexema);
                    lexema = flujoTokens.avanzar();

                    if (lexema.getTipo() == TipoLexemaEnum.AGR_CLOSEKEY) {
                        sentenciaMain.setCloseKey(lexema);
                        lexema = flujoTokens.avanzar();

                        if (lexema.getToken().equals(";")) {
                            System.out.println("Lexema: "+ lexema.getToken()+ "   entró al if");
                            flujoTokens.avanzar();                            
                            return sentenciaMain;
                        } else {
                            System.out.println("Lexema: "+ lexema.getToken()+ "   entró al else");
                            flujoTokens.backTrack();
                            return null;
                        }


                    } else {
                        flujoTokens.backTrack();
                        return null; //
                    }
                } else {
                    flujoTokens.backTrack();
                    return null; //s
                }
            } else {
                //si no es identificador, no es atributo, se retorna el flujo a 
                //la posicion inicial
                flujoTokens.backTrack();
                return null; //se retorna null para que se pruebe con otra regal..
            }

        }
        return null;
    }

}
