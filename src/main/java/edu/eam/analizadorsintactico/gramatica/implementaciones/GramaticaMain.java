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
import edu.eam.analizadorsintactico.sentencias.implementaciones.Atributo;
import edu.eam.analizadorsintactico.sentencias.implementaciones.Cuerpo;
import edu.eam.analizadorsintactico.sentencias.implementaciones.IF;
import edu.eam.analizadorsintactico.sentencias.implementaciones.Instancia;
import edu.eam.analizadorsintactico.sentencias.implementaciones.LlamadoFuncion;
import edu.eam.analizadorsintactico.sentencias.implementaciones.SentenciaMain;
import edu.eam.analizadorsintactico.sentencias.implementaciones.While;
import java.util.ArrayList;

/**
 *
 * @author dani0
 */
public class GramaticaMain implements Gramatica {

    @Override
    public Sentencia analizar(ArrayList<Lexema> arrayLexemas) {
//Sentencia a retornar....
        SentenciaMain sentenciaMain = new SentenciaMain();
        IF isIf;
        //     While isWhile;

        Cuerpo cuerpo;
        Instancia instancia;
        Atributo atributo;
        LlamadoFuncion llamadoFuncion;
        GramaticaCuerpo gramaticaCuerpo = new GramaticaCuerpo();
        GramaticaIF gramaticaIF = new GramaticaIF();
        GramaticaAtributo gramaticaAtributo = new GramaticaAtributo();
        GramaticaInstancia gramaticaInstancia = new GramaticaInstancia();
        GramaticaLlamadoFuncion gramaticaLlamadoFuncion = new GramaticaLlamadoFuncion();
        //   GramaticaWhile gramaticaWhile = new GramaticaWhile();
        //  flujoTokens.guardarPosicion();
        int posI = posicion;
        int posA = posicion;
        //primer token de la gramatica.
        Lexema lexema = arrayLexemas.get(posA);

        //tipo de dato.....
        if ("main".equals(lexema.getToken())) {
            sentenciaMain.setMain(lexema);
            posA++;
            lexema = arrayLexemas.get(posA);

            //nombre del atributo....
            if (lexema.getTipo() == TipoLexemaEnum.AGR_OPENKEY) {
                sentenciaMain.setOpenKey(lexema);
                posA++;
                posicion = posA;

                boolean continuar = true;

                do {

                    isIf = (IF) gramaticaIF.analizar(arrayLexemas);

                    if (isIf != null) {
                        sentenciaMain.getListaSentencia().add(isIf);

                        posicion++;
                        posA = posicion;
                        continue;
                    }

                    atributo = (Atributo) gramaticaAtributo.analizar(arrayLexemas);

                    if (atributo != null) {
                        sentenciaMain.getListaSentencia().add(atributo);
                        posicion++;
                        posA = posicion;
                        continue;

                    }

                    instancia = (Instancia) gramaticaInstancia.analizar(arrayLexemas);

                    if (instancia != null) {
                        sentenciaMain.getListaSentencia().add(instancia);
                        posicion++;
                        posA = posicion;
                        continue;

                    }

                    llamadoFuncion = (LlamadoFuncion) gramaticaLlamadoFuncion.analizar(arrayLexemas);

                    if (llamadoFuncion != null) {
                        sentenciaMain.getListaSentencia().add(llamadoFuncion);
                        posicion++;
                        posA = posicion;
                        continue;
                    }

                    continuar = false;
                } while (continuar);
//                cuerpo = (Cuerpo) gramaticaCuerpo.analizar(arrayLexemas);
//                if (cuerpo != null){
//                    sentenciaMain.setCuerpo(cuerpo);
////                    posicion ++;
//                    posA = posicion;

//                posicion = posA;
//                isIf = (IF) gramaticaIF.analizar(arrayLexemas);
//
//                if (isIf != null) {
//                    sentenciaMain.setCondicion(isIf);
//                    posicion++;
//                    posA = posicion;
//
//                    atributo = (Atributo) gramaticaAtributo.analizar(arrayLexemas);
//
//                    if (atributo != null) {
//                        sentenciaMain.setAtributo(atributo);
//                        posicion++;
//                        posA = posicion;
//
//                        instancia = (Instancia) gramaticaInstancia.analizar(arrayLexemas);
//
//                        if (instancia != null) {
//                            sentenciaMain.setInstancia(instancia);
//                            posicion++;
//                            posA = posicion;
//
//                            llamadoFuncion = (LlamadoFuncion) gramaticaLlamadoFuncion.analizar(arrayLexemas);
//
//                            if (llamadoFuncion != null) {
//                                sentenciaMain.setLlamadoFuncion(llamadoFuncion);
//                                posicion++;
//                                posA = posicion;
//
                lexema = arrayLexemas.get(posA);
                if (lexema.getTipo() == TipoLexemaEnum.AGR_CLOSEKEY) {
                    sentenciaMain.setCloseKey(lexema);
                    posA++;
                    lexema = arrayLexemas.get(posA);

                    if (lexema.getToken().equals(";")) {
                        posicion = posA;
                        return sentenciaMain;
                    } else {
                        posA = posI;
                        return null;
                    }

//                        } 
//                        else {
//                            posA = posI;
//                            return null; //
//                        }
//                                } else {
//                                    posA = posI;
//                                    return null; //s
//                                }
//                            } else {
//                                posA = posI;
//                                return null; //s
//                            }
//                        } else {
//                            posA = posI;
//                            return null; //s
//                        }
//                } else {
//                    posA = posI;
//                    return null; //s
//                }
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
