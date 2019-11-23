/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eam.analizadorsintactico.gramatica.implementaciones;

import edu.eam.analizadorlexicos.Lexema;
import edu.eam.analizadorlexicos.TipoLexemaEnum;
import static edu.eam.analizadorsintactico.controlador.AnalizadorSintactico.posicion;
import edu.eam.analizadorsintactico.excepciones.SintacticException;
import edu.eam.analizadorsintactico.gramatica.definiciones.Gramatica;
import edu.eam.analizadorsintactico.sentencias.definicion.Sentencia;
import edu.eam.analizadorsintactico.sentencias.implementaciones.Atributo;
import edu.eam.analizadorsintactico.sentencias.implementaciones.Condicion;
import edu.eam.analizadorsintactico.sentencias.implementaciones.Cuerpo;
import edu.eam.analizadorsintactico.sentencias.implementaciones.IF;
import edu.eam.analizadorsintactico.sentencias.implementaciones.Instancia;
import edu.eam.analizadorsintactico.sentencias.implementaciones.LlamadoFuncion;
import java.util.ArrayList;

public class GramaticaIF implements Gramatica {

    @Override
    public Sentencia analizar(ArrayList<Lexema> arrayLexemas) {
        IF isIf = new IF();
        Condicion condicion;
        Gramatica gramaticaCondicion = new GramaticaCondicion();
        Instancia instancia;
        Atributo atributo;
        LlamadoFuncion llamadoFuncion;
        GramaticaExpresionLogica gramaticaExpresionLogica = new GramaticaExpresionLogica();
        GramaticaCuerpo gramaticaCuerpo = new GramaticaCuerpo();
        GramaticaIF gramaticaIF = new GramaticaIF();
        GramaticaAtributo gramaticaAtributo = new GramaticaAtributo();
        GramaticaInstancia gramaticaInstancia = new GramaticaInstancia();
        GramaticaLlamadoFuncion gramaticaLlamadoFuncion = new GramaticaLlamadoFuncion();

        int posI = posicion;
        int posA = posicion;
        //primer token de la gramatica.
        Lexema lexema = arrayLexemas.get(posA);

        if (lexema.getTipo() == TipoLexemaEnum.EST_CON_IF) {
            isIf.setIF(lexema);
            posA++;
            lexema = arrayLexemas.get(posA);

            if (lexema.getTipo() == TipoLexemaEnum.AGR_OPENP) {
                posA++;
                lexema = arrayLexemas.get(posA);
                posicion = posA;
                condicion = (Condicion) gramaticaCondicion.analizar(arrayLexemas);

                if (condicion != null) {
                    isIf.setCondicion(condicion);
                    posA++;
                    lexema = arrayLexemas.get(posA);

                    if (lexema.getTipo() == TipoLexemaEnum.AGR_CLOSEP) {
                        posA++;
                        lexema = arrayLexemas.get(posA);

                        if (lexema.getTipo() == TipoLexemaEnum.AGR_OPENKEY) {
                            posA++;
                            lexema = arrayLexemas.get(posA);
                            posicion = posA;

                            boolean continuar = true;

                            do {

                                isIf = (IF) gramaticaIF.analizar(arrayLexemas);

                                if (isIf != null) {
                                    isIf.getlistaSentencias().add(isIf);

                                    posicion++;
                                    posA = posicion;
                                    continue;
                                }

                                atributo = (Atributo) gramaticaAtributo.analizar(arrayLexemas);

                                if (atributo != null) {
                                    isIf.getlistaSentencias().add(atributo);
                                    posicion++;
                                    posA = posicion;
                                    continue;

                                }

                                instancia = (Instancia) gramaticaInstancia.analizar(arrayLexemas);

                                if (instancia != null) {
                                    isIf.getlistaSentencias().add(instancia);
                                    posicion++;
                                    posA = posicion;
                                    continue;

                                }

                                llamadoFuncion = (LlamadoFuncion) gramaticaLlamadoFuncion.analizar(arrayLexemas);

                                if (llamadoFuncion != null) {
                                    isIf.getlistaSentencias().add(llamadoFuncion);
                                    posicion++;
                                    posA = posicion;
                                    continue;
                                }

                                continuar = false;
                            } while (continuar);

                            if (lexema.getTipo() == TipoLexemaEnum.AGR_CLOSEKEY) {
                                posA++;
                                lexema = arrayLexemas.get(posA);

                                if (lexema.getTipo() == TipoLexemaEnum.DELIMITADOR) {
                                    posicion = posA;
                                    return isIf;
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
