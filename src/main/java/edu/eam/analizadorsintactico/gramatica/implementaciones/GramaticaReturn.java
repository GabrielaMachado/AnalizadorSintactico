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
import edu.eam.analizadorsintactico.sentencias.implementaciones.Return;
import edu.eam.analizadorsintactico.sentencias.implementaciones.SwitchCase;
import java.util.ArrayList;

/**
 *
 * @author dani0
 */
public class GramaticaReturn implements Gramatica{
    
    @Override
    public Sentencia analizar(ArrayList<Lexema> arrayLexemas) {
//Sentencia a retornar....
        Return isReturn = new Return();
        //  flujoTokens.guardarPosicion();
        int posI = posicionInicial;
        int posA = posicionInicial;
        //primer token de la gramatica.
        Lexema lexema = arrayLexemas.get(posA);

        //tipo de dato.....
        if (lexema.getTipo() == TipoLexemaEnum.SD_MESSAGE || lexema.getTipo() == TipoLexemaEnum.LITERAL_BOLEANA
                || lexema.getTipo() == TipoLexemaEnum.IDENT || lexema.getTipo() == TipoLexemaEnum.ED_NULL
                || lexema.getTipo() == TipoLexemaEnum.SD_MESSAGE/*funcion*/ || lexema.getTipo() == TipoLexemaEnum.SD_MESSAGE/*expresion*/) {
            isReturn.setMensaje(lexema);
            posA++;
            lexema = arrayLexemas.get(posA);

//            //nombre del atributo....
//            if (lexema.getTipo() == TipoLexemaEnum.AGR_OPENP) {
//                switchCase.setOpenP(lexema);
//                posA++;
//                lexema = arrayLexemas.get(posA);
//
//                if (lexema.getTipo() == TipoLexemaEnum.IDENT) {
//                    switchCase.setIdent(lexema);
//                    posA++;
//                    lexema = arrayLexemas.get(posA);
//
//                    if (lexema.getTipo() == TipoLexemaEnum.AGR_CLOSEP) {
//                        switchCase.setCloseP(lexema);
//                        posA++;
//                        lexema = arrayLexemas.get(posA);
//
//                        if (lexema.getTipo() == TipoLexemaEnum.AGR_OPENKEY) {
//                            switchCase.setOpenKey(lexema);
//                            posA++;
//                            lexema = arrayLexemas.get(posA);
//
//                            if (lexema.getTipo() == TipoLexemaEnum.EST_CON_CASE) {
//                                switchCase.setIsCase(lexema);
//                                posA++;
//                                lexema = arrayLexemas.get(posA);

                                if (lexema.getTipo() == TipoLexemaEnum.DELIMITADOR) {
                                    //derivar...
                                    return isReturn;
                                } else {
                                    //si no es identificador, no es atributo, se retorna el flujo a 
                                    //la posicion inicial
                                    posA = posI;
                                    return null; //se retorna null para que se pruebe con otra regal..
                                }
//                            } else {
//                                posA = posI;
//                                return null; //
//                            }
//
//                        } else {
//                            posA = posI;
//                            return null; //
//                        }
//                    } else {
//                        posA = posI;
//                        return null; //
//                    }
//                } else {
//                    posA = posI;
//                    return null; //s
//                }
//            } else {
//                //si no es identificador, no es atributo, se retorna el flujo a 
//                //la posicion inicial
//                posA = posI;
//                return null; //se retorna null para que se pruebe con otra regal..
//            }

        }
        return null;
    }

}
