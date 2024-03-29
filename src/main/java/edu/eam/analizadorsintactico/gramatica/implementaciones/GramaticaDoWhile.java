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
import edu.eam.analizadorsintactico.sentencias.definicion.Sentencia;
import edu.eam.analizadorsintactico.sentencias.implementaciones.DoWhile;
import java.util.ArrayList;

/**
 *
 * @author dani0
 */
public class GramaticaDoWhile implements Gramatica {

    @Override
    public Sentencia analizar(ArrayList<Lexema> arrayLexemas) {
//Sentencia a retornar....
        DoWhile isDoWhile = new DoWhile();
        //  flujoTokens.guardarPosicion();
        int posI = posicion;
        int posA = posicion;
        //primer token de la gramatica.
        Lexema lexema = arrayLexemas.get(posA);

        //tipo de dato.....
        if (lexema.getTipo() == TipoLexemaEnum.EST_CON_DO) {
            isDoWhile.setIsDo(lexema);
            posA++;
            lexema = arrayLexemas.get(posA);

            //nombre del atributo....
            if (lexema.getTipo() == TipoLexemaEnum.AGR_OPENKEY) {
                isDoWhile.setOpenKey(lexema);
                posA++;
                lexema = arrayLexemas.get(posA);

                if (lexema.getTipo() == TipoLexemaEnum.LITERAL_BOLEANA/*cuerpo1*/) {
                    isDoWhile.setCuerpo1(lexema);
                    posA++;
                    lexema = arrayLexemas.get(posA);

                    if (lexema.getTipo() == TipoLexemaEnum.AGR_CLOSEKEY) {
                        isDoWhile.setCloseKey(lexema);
                        posA++;
                        lexema = arrayLexemas.get(posA);

                        if (lexema.getTipo() == TipoLexemaEnum.AGR_CLOSEP/*cuerpo2*/) {
                            isDoWhile.setCuerpo2(lexema);
                            posA++;
                            lexema = arrayLexemas.get(posA);

                            if (lexema.getTipo() == TipoLexemaEnum.EST_CON_WHILE) {
                                isDoWhile.setIsWhile(lexema);
                                posA++;
                                lexema = arrayLexemas.get(posA);

                                if (lexema.getTipo() == TipoLexemaEnum.AGR_OPENP) {
                                    isDoWhile.setOpenP(lexema);
                                    posA++;
                                    lexema = arrayLexemas.get(posA);
                                    if (lexema.getTipo() == TipoLexemaEnum.LITERAL_BOLEANA) {
                                        isDoWhile.setLiteralBooleana(lexema);
                                        posA++;
                                        lexema = arrayLexemas.get(posA);
                                        if (lexema.getTipo() == TipoLexemaEnum.OP_LOG_OR || lexema.getTipo() == TipoLexemaEnum.OP_LOG_AND) {
                                            isDoWhile.setOperadorLogico(lexema);
                                            posA++;
                                            lexema = arrayLexemas.get(posA);
                                                if (lexema.getToken().equals("expreion comparcion")) {
                                                    isDoWhile.setExpresionComparacion(lexema);
                                                    posA++;
                                                    lexema = arrayLexemas.get(posA);
                                                    if (lexema.getTipo() == TipoLexemaEnum.AGR_CLOSEP) {
                                                        //derivar...
                                                        posicion = posA;
                                                        return isDoWhile;
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
