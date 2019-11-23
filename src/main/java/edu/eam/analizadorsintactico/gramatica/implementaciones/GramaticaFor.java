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
import edu.eam.analizadorsintactico.sentencias.implementaciones.Cuerpo;
import edu.eam.analizadorsintactico.sentencias.implementaciones.FOR;
import edu.eam.analizadorsintactico.sentencias.implementaciones.OpLogico;
import edu.eam.analizadorsintactico.sentencias.implementaciones.TipoDatoNumerico;
import java.util.ArrayList;

/**
 *
 * @author dani0
 */
public class GramaticaFor implements Gramatica {
@Override
    public Sentencia analizar(ArrayList<Lexema> arrayLexemas) {
//Sentencia a retornar....
        FOR isFor = new FOR();
        TipoDatoNumerico tipoDatoNumerico;
        OpLogico opLogico;
        Cuerpo cuerpo;

        Gramatica gramaticaTipoDatoNumerico = new GramaticaTipoDatoNumerico();
        Gramatica gramaticaOpLogico = new GramaticaOpLogico();
        Gramatica gramaticaCuerpo = new GramaticaCuerpo();
        //  flujoTokens.guardarPosicion();
        int posI = posicion;
        int posA = posicion;
        //primer token de la gramatica.
        Lexema lexema = arrayLexemas.get(posA);

        //tipo de dato.....
        if (lexema.getTipo() == TipoLexemaEnum.EST_CON_FOR) {
            isFor.setFOR(lexema);
            posA++;
            lexema = arrayLexemas.get(posA);

            //nombre del atributo....
            if (lexema.getTipo() == TipoLexemaEnum.AGR_OPENP) {
                posA++;
                lexema = arrayLexemas.get(posA);
                posicion = posA;
                tipoDatoNumerico = (TipoDatoNumerico) gramaticaTipoDatoNumerico.analizar(arrayLexemas);

                if (tipoDatoNumerico != null) {
                    isFor.setTipoDatoNumerico(tipoDatoNumerico);
                    posA++;
                    lexema = arrayLexemas.get(posA);

                    if (lexema.getTipo() == TipoLexemaEnum.IDENT) {
                        isFor.setIdent1(lexema);
                        posA++;
                        lexema = arrayLexemas.get(posA);

                        if (lexema.getTipo() == TipoLexemaEnum.ASIGNACION) {
                            posA++;
                            lexema = arrayLexemas.get(posA);

                            if (lexema.getTipo() == TipoLexemaEnum.IDENT) {
                                isFor.setIdent2(lexema);
                                posA++;
                                lexema = arrayLexemas.get(posA);

                                if (lexema.getTipo() == TipoLexemaEnum.DELIMITADOR) {
                                    posA++;
                                    lexema = arrayLexemas.get(posA);

                                    if (lexema.getTipo() == TipoLexemaEnum.IDENT) {
                                        isFor.setIdent3(lexema);
                                        posA++;
                                        lexema = arrayLexemas.get(posA);
                                        posicion = posA;
                                        opLogico = (OpLogico) gramaticaOpLogico.analizar(arrayLexemas);

                                        if (opLogico != null) {
                                            isFor.setOperadorLogico(opLogico);
                                            posA++;
                                            lexema = arrayLexemas.get(posA);

                                            if (lexema.getTipo() == TipoLexemaEnum.IDENT) {
                                                isFor.setIdent4(lexema);
                                                posA++;
                                                lexema = arrayLexemas.get(posA);

                                                if (lexema.getTipo() == TipoLexemaEnum.DELIMITADOR) {
                                                    posA++;
                                                    lexema = arrayLexemas.get(posA);

                                                    if (lexema.getTipo() == TipoLexemaEnum.IDENT) {
                                                        isFor.setIdent5(lexema);
                                                        posA++;
                                                        lexema = arrayLexemas.get(posA);

                                                        if (lexema.getTipo() == TipoLexemaEnum.OP_ART_PLUS || lexema.getTipo() == TipoLexemaEnum.OP_ART_MINUS) {
                                                            posA++;
                                                            lexema = arrayLexemas.get(posA);

                                                            if (lexema.getTipo() == TipoLexemaEnum.AGR_CLOSEP) {
                                                                posA++;
                                                                lexema = arrayLexemas.get(posA);

                                                                if (lexema.getTipo() == TipoLexemaEnum.AGR_OPENKEY) {
                                                                    posA++;
                                                                    lexema = arrayLexemas.get(posA);
                                                                    posicion = posA;
                                                                    cuerpo = (Cuerpo) gramaticaCuerpo.analizar(arrayLexemas);

                                                                    if (cuerpo != null) {
                                                                        isFor.setCuerpo(cuerpo);
                                                                        posA++;
                                                                        lexema = arrayLexemas.get(posA);

                                                                        if (lexema.getTipo() == TipoLexemaEnum.AGR_CLOSEKEY) {
                                                                            posicion = posA;
                                                                            return isFor;
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
