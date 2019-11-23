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
import edu.eam.analizadorsintactico.sentencias.implementaciones.Inicializacion;
import edu.eam.analizadorsintactico.sentencias.implementaciones.TipoDato;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class GramaticaInicializacion implements Gramatica {

    @Override
    public Sentencia analizar(ArrayList<Lexema> arrayLexemas) {
//Sentencia a retornar....
        Inicializacion inicializacion = new Inicializacion();

        //  flujoTokens.guardarPosicion();
        int posI = posicion;
        int posA = posicion;
        //primer token de la gramatica.

        Lexema lexema = arrayLexemas.get(posA);

        //tipo de dato.....
        if (lexema.getTipo() == TipoLexemaEnum.LBOL_FALSE || lexema.getTipo() == TipoLexemaEnum.LBOL_TRUE) {
            inicializacion.setLiteralBooleana(lexema);
            posA++;
            lexema = arrayLexemas.get(posA);
            if (lexema.getTipo() == TipoLexemaEnum.DELIMITADOR) {
                //derivar...
                 posicion = posA;
                return inicializacion;
            } else {
                //si no es identificador, no es atributo, se retorna el flujo a 
                //la posicion inicial
                posA = posI;
                return null; //se retorna null para que se pruebe con otra regal..
            }
        }
        
         if (lexema.getTipo() == TipoLexemaEnum.IDENT) {
            inicializacion.setNumero(lexema);
            posA++;
            lexema = arrayLexemas.get(posA);
            if (lexema.getTipo() == TipoLexemaEnum.DELIMITADOR) {
                //derivar...
                 posicion = posA;
                return inicializacion;
            } else {
                //si no es identificador, no es atributo, se retorna el flujo a 
                //la posicion inicial
                posA = posI;
                return null; //se retorna null para que se pruebe con otra regal..
            }
        }
        //nombre del atributo....
        if (lexema.getTipo() == TipoLexemaEnum.QUOTES) {
            inicializacion.setComillas1(lexema);
            posA++;
            lexema = arrayLexemas.get(posA);

            if (lexema.getTipo() == TipoLexemaEnum.IDENT/*letras*/) {
                inicializacion.setLetras(lexema);
                posA++;
                lexema = arrayLexemas.get(posA);

                if (lexema.getTipo() == TipoLexemaEnum.QUOTES) {
                    inicializacion.setComillas2(lexema);
                    posA++;
                    lexema = arrayLexemas.get(posA);

                    if (lexema.getTipo() == TipoLexemaEnum.DELIMITADOR) {
                        
                        posicion = posA;
                        //derivar...
                        return inicializacion;
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
            //si no es identificador, no es atributo, se retorna el flujo a 
            //la posicion inicial
            posA = posI;
            return null; //se retorna null para que se pruebe con otra regal..
        }
    }
}
