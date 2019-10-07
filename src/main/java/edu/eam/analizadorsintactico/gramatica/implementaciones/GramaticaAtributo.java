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
import java.util.ArrayList;

/**
 *
 * @author dani0
 */
public class GramaticaAtributo implements Gramatica {

    @Override
    public Sentencia analizar(ArrayList<Lexema> arrayLexemas) {
//Sentencia a retornar....
        Atributo atributo = new Atributo();
        //  flujoTokens.guardarPosicion();
        int posI = posicion;
        int posA = posicion;
        //primer token de la gramatica.
        Lexema lexema = arrayLexemas.get(posA);

        //tipo de dato.....
        if (lexema.getTipo() == TipoLexemaEnum.TD_BOOLEAN ||
                lexema.getTipo() == TipoLexemaEnum.TD_CHAR ||
                lexema.getTipo() == TipoLexemaEnum.TD_COLOR ||
                lexema.getTipo() == TipoLexemaEnum.TD_DOUBLE ||
                lexema.getTipo() == TipoLexemaEnum.TD_FIGURE ||
                lexema.getTipo() == TipoLexemaEnum.TD_INTEGER ||
                lexema.getTipo() == TipoLexemaEnum.TD_STRING ||
                lexema.getTipo() == TipoLexemaEnum.TD_STYLE) {
            atributo.setTipoDato(lexema);
            posA++;
            lexema = arrayLexemas.get(posA);

            //nombre del atributo....
            if (lexema.getTipo() == TipoLexemaEnum.IDENT) {
                atributo.setIdent(lexema);
                posA++;
                lexema = arrayLexemas.get(posA);

                if (lexema.getTipo() == TipoLexemaEnum.ASIGNACION) {
                    atributo.setEquals(lexema);
                    posA++;
                    lexema = arrayLexemas.get(posA);

                    if (lexema.getToken().equals("inicializacion")) {
                        atributo.setInicializacion(lexema);
                        posA++;
                        lexema = arrayLexemas.get(posA);

                        if (lexema.getTipo() == TipoLexemaEnum.DELIMITADOR) {
                            //derivar...
                            posicion = posA;
                            return atributo;
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
