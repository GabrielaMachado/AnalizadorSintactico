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
import edu.eam.analizadorsintactico.sentencias.implementaciones.ContenidoMensaje;
import edu.eam.analizadorsintactico.sentencias.implementaciones.Mensaje;
import java.util.ArrayList;

/**
 *
 * @author dani0
 */
public class GramaticaMensaje implements Gramatica {

    @Override
    public Sentencia analizar(ArrayList<Lexema> arrayLexemas) {
//Sentencia a retornar....
        Mensaje mensaje = new Mensaje();

        ContenidoMensaje contenidoMensaje;
        Gramatica gramaticaContenidoMensaje = new GramaticaContenidoMensaje();
        //  flujoTokens.guardarPosicion();
        int posI = posicion;
        int posA = posicion;
        //primer token de la gramatica.
        Lexema lexema = arrayLexemas.get(posA);

        //tipo de dato.....
        if (lexema.getTipo() == TipoLexemaEnum.SD_MESSAGE) {
            mensaje.setMensaje(lexema);
            posA++;
            lexema = arrayLexemas.get(posA);

            //nombre del atributo....
            if (lexema.getTipo() == TipoLexemaEnum.ASIGNACION) {
                posA++;
                lexema = arrayLexemas.get(posA);

                if (lexema.getTipo() == TipoLexemaEnum.AGR_OPENP) {
                    posA++;
                    lexema = arrayLexemas.get(posA);

                    if (lexema.getTipo() == TipoLexemaEnum.QUOTES) {
                        posA++;
                        lexema = arrayLexemas.get(posA);
                        posicion = posA;
                        contenidoMensaje = (ContenidoMensaje) gramaticaContenidoMensaje.analizar(arrayLexemas);

                        if (contenidoMensaje != null) {
                            mensaje.setContenidoMensaje(contenidoMensaje);
                            posA++;
                            lexema = arrayLexemas.get(posA);

                            if (lexema.getTipo() == TipoLexemaEnum.OP_ART_PLUS) {
                                posA++;
                                lexema = arrayLexemas.get(posA);

                                if (lexema.getTipo() == TipoLexemaEnum.AGR_CLOSEP) {
                                    posA++;
                                    lexema = arrayLexemas.get(posA);

                                    if (lexema.getTipo() == TipoLexemaEnum.DELIMITADOR) {
                                        //derivar...
                                        posicion = posA;
                                        return mensaje;
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
