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
import edu.eam.analizadorsintactico.sentencias.implementaciones.FOR;
import edu.eam.analizadorsintactico.sentencias.implementaciones.SwitchCase;
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
        //  flujoTokens.guardarPosicion();
        int posI = posicionInicial;
        int posA = posicionInicial;
        //primer token de la gramatica.
        Lexema lexema = arrayLexemas.get(posA);

        //tipo de dato.....
        if (lexema.getTipo() == TipoLexemaEnum.EST_CON_FOR) {
            isFor.setIsFor(lexema);
            posA++;
            lexema = arrayLexemas.get(posA);

            //nombre del atributo....
            if (lexema.getTipo() == TipoLexemaEnum.AGR_OPENP) {
                isFor.setOpenP(lexema);
                posA++;
                lexema = arrayLexemas.get(posA);

                if (lexema.getTipo() == TipoLexemaEnum.TD_INTEGER/*tipoDatoNumerico*/) {
                    isFor.setTipoDatoNumerico(lexema);
                    posA++;
                    lexema = arrayLexemas.get(posA);

                    if (lexema.getTipo() == TipoLexemaEnum.IDENT) {
                        isFor.setIdent1(lexema);
                        posA++;
                        lexema = arrayLexemas.get(posA);

                        if (lexema.getTipo() == TipoLexemaEnum.ASIGNACION) {
                            isFor.setEquals(lexema);
                            posA++;
                            lexema = arrayLexemas.get(posA);

                            if (lexema.getTipo() == TipoLexemaEnum.NUMERO || lexema.getTipo() == TipoLexemaEnum.IDENT) {
                                isFor.setNumero1(lexema);
                                posA++;
                                lexema = arrayLexemas.get(posA);

                                if (lexema.getTipo() == TipoLexemaEnum.DELIMITADOR) {
                                    isFor.setSemicolon(lexema);
                                    posA++;
                                    lexema = arrayLexemas.get(posA);

                                    if (lexema.getTipo() == TipoLexemaEnum.NUMERO || lexema.getTipo() == TipoLexemaEnum.IDENT) {
                                        isFor.setNumero2(lexema);
                                        posA++;
                                        lexema = arrayLexemas.get(posA);

                                        if (lexema.getTipo() == TipoLexemaEnum.O_RELACIONAL) {
                                            isFor.setOperadorRelacional(lexema);
                                            posA++;
                                            lexema = arrayLexemas.get(posA);

                                            if (lexema.getTipo() == TipoLexemaEnum.NUMERO || lexema.getTipo() == TipoLexemaEnum.IDENT) {
                                                isFor.setNumero3(lexema);
                                                posA++;
                                                lexema = arrayLexemas.get(posA);

                                                if (lexema.getTipo() == TipoLexemaEnum.DELIMITADOR) {
                                                    isFor.setSemicolon2(lexema);
                                                    posA++;
                                                    lexema = arrayLexemas.get(posA);

                                                    if (lexema.getTipo() == TipoLexemaEnum.IDENT) {
                                                        isFor.setIdent5(lexema);
                                                        posA++;
                                                        lexema = arrayLexemas.get(posA);
                                                        if (lexema.getTipo() == TipoLexemaEnum.OP_ART_PLUS || lexema.getTipo() == TipoLexemaEnum.OP_ART_MINUS) {
                                                            isFor.setPlusPlus(lexema);
                                                            posA++;
                                                            lexema = arrayLexemas.get(posA);

                                                            if (lexema.getTipo() == TipoLexemaEnum.OPERADORARITMETICO) {
                                                                isFor.setOperadorAritmetico(lexema);
                                                                posA++;
                                                                lexema = arrayLexemas.get(posA);

                                                                if (lexema.getTipo() == TipoLexemaEnum.NUMERO) {
                                                                    isFor.setNumero4(lexema);
                                                                    posA++;
                                                                    lexema = arrayLexemas.get(posA);

                                                                    if (lexema.getTipo() == TipoLexemaEnum.AGR_CLOSEP) {
                                                                        isFor.setCloseP(lexema);
                                                                        posA++;
                                                                        lexema = arrayLexemas.get(posA);

                                                                        if (lexema.getTipo() == TipoLexemaEnum.AGR_OPENKEY) {
                                                                            isFor.setOpenKey(lexema);
                                                                            posA++;
                                                                            lexema = arrayLexemas.get(posA);

                                                                            if (lexema.getTipo() == TipoLexemaEnum.NUMERO/*cuerpo*/) {
                                                                                isFor.setNumero1(lexema);
                                                                                posA++;
                                                                                lexema = arrayLexemas.get(posA);

                                                                                if (lexema.getTipo() == TipoLexemaEnum.AGR_CLOSEKEY) {
                                                                                    //derivar...
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
