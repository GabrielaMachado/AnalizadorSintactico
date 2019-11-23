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
import edu.eam.analizadorsintactico.sentencias.implementaciones.Case;
import edu.eam.analizadorsintactico.sentencias.implementaciones.Cuerpo;
import edu.eam.analizadorsintactico.sentencias.implementaciones.OpAritmetico;
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
        OpAritmetico opAritmetico;
        Cuerpo cuerpo;
        Gramatica gramaticaOpAritmetico = new GramaticaOpAritmetico();
        Gramatica gramaticaCuerpo = new GramaticaCuerpo();
        //  flujoTokens.guardarPosicion();
        int posI = posicion;
        int posA = posicion;
        //primer token de la gramatica.
        Lexema lexema = arrayLexemas.get(posA);

        //tipo de dato.....
        if (lexema.getTipo() == TipoLexemaEnum.EST_CON_CASE) {
            isCase.setIsCase(lexema);
            posA++;
            lexema = arrayLexemas.get(posA);

            //nombre del atributo....
            if (lexema.getTipo() == TipoLexemaEnum.QUOTES) {
                posA++;
                lexema = arrayLexemas.get(posA);

                if (lexema.getTipo() == TipoLexemaEnum.IDENT) {
                    isCase.setIdent(lexema);
                    posA++;
                    lexema = arrayLexemas.get(posA);
                    posicion = posA;
                    opAritmetico = (OpAritmetico) gramaticaOpAritmetico.analizar(arrayLexemas);

                    if (opAritmetico != null) {
                        isCase.setOpAritmetico(opAritmetico);
                        posA++;
                        lexema = arrayLexemas.get(posA);

                        if (lexema.getTipo() == TipoLexemaEnum.QUOTES) {
                            posA++;
                            lexema = arrayLexemas.get(posA);

                            if (lexema.getTipo() == TipoLexemaEnum.ASIGNACION) {
                                posA++;
                                lexema = arrayLexemas.get(posA);
                                posicion = posA;
                                cuerpo = (Cuerpo) gramaticaCuerpo.analizar(arrayLexemas);

                                if (cuerpo != null) {
                                    isCase.setCuerpo(cuerpo);
                                    posA++;
                                    lexema = arrayLexemas.get(posA);

                                    if (lexema.getTipo() == TipoLexemaEnum.DELIMITADOR) {
                                        posA++;
                                        lexema = arrayLexemas.get(posA);

                                        if (lexema.getTipo() == TipoLexemaEnum.EST_CON_BREAK) {
                                            isCase.setIsBreak(lexema);
                                            posA++;
                                            lexema = arrayLexemas.get(posA);

                                            if (lexema.getTipo() == TipoLexemaEnum.DELIMITADOR) {
                                                //derivar...
                                                posicion = posA;
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
