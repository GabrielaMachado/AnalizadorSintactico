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
import edu.eam.analizadorsintactico.sentencias.implementaciones.Case;
import java.util.ArrayList;

/**
 *
 * @author dani0
 */
public class GramaticaCase implements Gramatica {

    @Override
    public Sentencia analizar(ArrayList<Lexema> arrayLexemas) {
//Sentencia a retornar....
        Case isCase = new Case();
        //  flujoTokens.guardarPosicion();
        int posI = posicionInicial;
        int posA = posicionInicial;
        //primer token de la gramatica.
        Lexema lexema = arrayLexemas.get(posA);

        //tipo de dato.....
        if (lexema.getTipo() == TipoLexemaEnum.EST_CON_CASE) {
            isCase.setIsCase(lexema);
            posA++;
            lexema = arrayLexemas.get(posA);

            //nombre del atributo....
            if (lexema.getTipo() == TipoLexemaEnum.QUOTES) {
                isCase.setComillas1(lexema);
                posA++;
                lexema = arrayLexemas.get(posA);

                if (lexema.getTipo() == TipoLexemaEnum.AGR_OPENP/*letras*/) {
                    isCase.setLetras(lexema);
                    posA++;
                    lexema = arrayLexemas.get(posA);

                    if (lexema.getTipo() == TipoLexemaEnum.OPERADORARITMETICO) {
                        isCase.setOperadoresAritmeticos(lexema);
                        posA++;
                        lexema = arrayLexemas.get(posA);

                        if (lexema.getTipo() == TipoLexemaEnum.QUOTES) {
                            isCase.setComillas2(lexema);
                            posA++;
                            lexema = arrayLexemas.get(posA);

                            if (lexema.getTipo() == TipoLexemaEnum.ASIGNACION) {
                                isCase.setEquals(lexema);
                                posA++;
                                lexema = arrayLexemas.get(posA);

                                if (lexema.getTipo() == TipoLexemaEnum.AGR_CLOSEP/*cuerpo*/) {
                                    isCase.setCuerpo(lexema);
                                    posA++;
                                    lexema = arrayLexemas.get(posA);

                                    if (lexema.getTipo() == TipoLexemaEnum.DELIMITADOR) {
                                        isCase.setSemicolon1(lexema);
                                        posA++;
                                        lexema = arrayLexemas.get(posA);

                                        if (lexema.getTipo() == TipoLexemaEnum.EST_CON_BREAK) {
                                            isCase.setIsBreak(lexema);
                                            posA++;
                                            lexema = arrayLexemas.get(posA);
                                            if (lexema.getTipo() == TipoLexemaEnum.DELIMITADOR) {
                                                //derivar...
                                                return isCase;
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
