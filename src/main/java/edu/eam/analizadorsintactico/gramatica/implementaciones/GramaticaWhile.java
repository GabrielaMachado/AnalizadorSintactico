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
import edu.eam.analizadorsintactico.sentencias.implementaciones.Mensaje;
import edu.eam.analizadorsintactico.sentencias.implementaciones.While;
import java.util.ArrayList;

/**
 *
 * @author dani0
 */
public class GramaticaWhile implements Gramatica {

    @Override
    public Sentencia analizar(ArrayList<Lexema> arrayLexemas) {
//Sentencia a retornar....
        While isWhile = new While();
        //  flujoTokens.guardarPosicion();
        int posI = posicionInicial;
        int posA = posicionInicial;
        //primer token de la gramatica.
        Lexema lexema = arrayLexemas.get(posA);

        //tipo de dato.....
        if (lexema.getTipo() == TipoLexemaEnum.EST_CON_WHILE) {
            isWhile.setIsWhile(lexema);
            posA++;
            lexema = arrayLexemas.get(posA);

            //nombre del atributo....
            if (lexema.getTipo() == TipoLexemaEnum.AGR_OPENP) {
                isWhile.setOpenP(lexema);
                posA++;
                lexema = arrayLexemas.get(posA);

                if (lexema.getTipo() == TipoLexemaEnum.LITERAL_BOLEANA) {
                    isWhile.setLiteralBooleana(lexema);
                    posA++;
                    lexema = arrayLexemas.get(posA);

                    if (lexema.getTipo() == TipoLexemaEnum.QUOTES/*expresion comparacion*/) {
                        isWhile.setExpresionComparacion(lexema);
                        posA++;
                        lexema = arrayLexemas.get(posA);

                        if (lexema.getTipo() == TipoLexemaEnum.AGR_CLOSEP) {
                            isWhile.setCloseP(lexema);
                            posA++;
                            lexema = arrayLexemas.get(posA);

                            if (lexema.getTipo() == TipoLexemaEnum.AGR_OPENKEY) {
                                isWhile.setOpenKey(lexema);
                                posA++;
                                lexema = arrayLexemas.get(posA);

                                if (lexema.getTipo() == TipoLexemaEnum.AGR_CLOSEP/*cuerpo*/) {
                                    isWhile.setCuerpo1(lexema);
                                    posA++;
                                    lexema = arrayLexemas.get(posA);
                                    if (lexema.getTipo() == TipoLexemaEnum.AGR_CLOSEKEY) {
                                        isWhile.setCloseKey(lexema);
                                        posA++;
                                        lexema = arrayLexemas.get(posA);
                                        if (lexema.getTipo() == TipoLexemaEnum.DELIMITADOR) {
                                            isWhile.setSemicolon(lexema);
                                            posA++;
                                            lexema = arrayLexemas.get(posA);
                                            if (lexema.getTipo() == TipoLexemaEnum.DELIMITADOR/*cuerpo2*/) {
                                                //derivar...
                                                return isWhile;
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
                                        posA = posI;
                                        return null; //
                                    }
                                } else {
                                    posA = posI;
                                    return null; //
                                }
                            } else {
                                posA = posI;
                                return null; //
                            }
                        } else {
                            posA = posI;
                            return null; //
                        }
                    } else {
                        posA = posI;
                        return null; //
                    }
                } else {
                    posA = posI;
                    return null; //s
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
