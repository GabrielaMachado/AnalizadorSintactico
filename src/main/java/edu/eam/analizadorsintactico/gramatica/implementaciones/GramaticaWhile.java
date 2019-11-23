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
import edu.eam.analizadorsintactico.sentencias.implementaciones.ExpresionLogica;
import edu.eam.analizadorsintactico.sentencias.implementaciones.LiteralBooleana;
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
        LiteralBooleana literalBooleana;
        ExpresionLogica expresionLogica;
        Cuerpo cuerpo1;
        Cuerpo cuerpo2;
        Gramatica gramaticaLiteralBooleana = new GramaticaLiteralBooleana();
        Gramatica gramaticaExpresionLogica = new GramaticaExpresionLogica();
        Gramatica gramaticaCuerpo1 = new GramaticaCuerpo();
        Gramatica gramaticaCuerpo2 = new GramaticaCuerpo();

        //  flujoTokens.guardarPosicion();
        int posI = posicion;
        int posA = posicion;
        //primer token de la gramatica.
        Lexema lexema = arrayLexemas.get(posA);

        //tipo de dato.....
        if (lexema.getTipo() == TipoLexemaEnum.EST_CON_WHILE) {
            isWhile.setIsWhile(lexema);
            posA++;
            lexema = arrayLexemas.get(posA);

            //nombre del atributo....
            if (lexema.getTipo() == TipoLexemaEnum.AGR_OPENP) {
                posA++;
                lexema = arrayLexemas.get(posA);
                posicion = posA;
                literalBooleana = (LiteralBooleana) gramaticaLiteralBooleana.analizar(arrayLexemas);

                if (literalBooleana != null) {
                    isWhile.setLiteralBooleana(literalBooleana);
                    posA++;
                    lexema = arrayLexemas.get(posA);
                    posicion = posA;
                    expresionLogica = (ExpresionLogica) gramaticaExpresionLogica.analizar(arrayLexemas);

                    if (expresionLogica != null) {
                        isWhile.setExpresionLogica(expresionLogica);
                        posA++;
                        lexema = arrayLexemas.get(posA);

                        if (lexema.getTipo() == TipoLexemaEnum.AGR_CLOSEP) {
                            posA++;
                            lexema = arrayLexemas.get(posA);

                            if (lexema.getTipo() == TipoLexemaEnum.AGR_OPENKEY) {
                                posA++;
                                lexema = arrayLexemas.get(posA);
                                posicion = posA;
                                cuerpo1 = (Cuerpo) gramaticaCuerpo1.analizar(arrayLexemas);

                                if (cuerpo1 != null) {
                                    isWhile.setCuerpo1(cuerpo1);
                                    posA++;
                                    lexema = arrayLexemas.get(posA);

                                    if (lexema.getTipo() == TipoLexemaEnum.AGR_CLOSEKEY) {
                                        posA++;
                                        lexema = arrayLexemas.get(posA);

                                        if (lexema.getTipo() == TipoLexemaEnum.DELIMITADOR) {
                                            posA++;
                                            lexema = arrayLexemas.get(posA);
                                            posicion = posA;
                                            cuerpo2 = (Cuerpo) gramaticaCuerpo2.analizar(arrayLexemas);

                                            if (cuerpo2 != null) {
                                                //derivar...
                                                posicion = posA;
                                                return isWhile;
                                            } else {
                                                //si no es identificador, no es atributo, se retorna el flujo a 
                                                //la posicion inicial
                                                posicion = posA;
                                                return isWhile; //se retorna null para que se pruebe con otra regal..
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

        } else {
            posA = posI;

            return null;
        }

    }
}
