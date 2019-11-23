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
import edu.eam.analizadorsintactico.sentencias.implementaciones.Metodo;
import edu.eam.analizadorsintactico.sentencias.implementaciones.Parametro;
import edu.eam.analizadorsintactico.sentencias.implementaciones.TipoDato;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class GramaticaMetodo implements Gramatica {

    @Override
    public Sentencia analizar(ArrayList<Lexema> arrayLexemas) {
        Metodo metodo = new Metodo();
        TipoDato tipoDato;
        Parametro parametro;
        Cuerpo cuerpo;
        Gramatica gramaticaTipoDato = new GramaticaTipoDato();
        Gramatica gramaticaParametro = new GramaticaParametro();
        Gramatica gramaticaCuerpo = new GramaticaCuerpo();

        int posI = posicion;
        int posA = posicion;
        //primer token de la gramatica.
        Lexema lexema = arrayLexemas.get(posA);

        tipoDato = (TipoDato) gramaticaTipoDato.analizar(arrayLexemas);
        //tipo de dato.....
        if (tipoDato != null) {
            metodo.setTipoDato(tipoDato);
            posA++;
            lexema = arrayLexemas.get(posA);
        }
        if (lexema.getTipo() == TipoLexemaEnum.IDENT) {
            metodo.setIdent(lexema);
            posA++;
            lexema = arrayLexemas.get(posA);

            if (lexema.getTipo() == TipoLexemaEnum.AGR_OPENP) {
                posA++;
                lexema = arrayLexemas.get(posA);
                posicion = posA;
                parametro = (Parametro) gramaticaParametro.analizar(arrayLexemas);

                if (parametro != null) {
                    metodo.setParametro(parametro);
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
                                metodo.setCuerpo(cuerpo);
                                posA++;
                                lexema = arrayLexemas.get(posA);

                                if (lexema.getTipo() == TipoLexemaEnum.AGR_CLOSEKEY) {
                                    posA++;
                                    lexema = arrayLexemas.get(posA);

                                    if (lexema.getTipo() == TipoLexemaEnum.DELIMITADOR) {
                                        posicion = posA;
                                        return metodo;
                                    } else {
                                        posA = posI;
                                        return null;
                                    }
                                } else {
                                    posA = posI;
                                    return null;
                                }
                            } else {
                                posA = posI;
                                return null;
                            }
                        } else {
                            posA = posI;
                            return null;
                        }
                    } else {
                        posA = posI;
                        return null;
                    }
                } else {
                    posA = posI;
                    return null;
                }
            } else {
                posA = posI;
                return null;
            }
        }
        return null; //se retorna null para que se pruebe con otra regal..
    }

}
