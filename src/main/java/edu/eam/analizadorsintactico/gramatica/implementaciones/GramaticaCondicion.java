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
import edu.eam.analizadorsintactico.sentencias.implementaciones.Condicion;
import edu.eam.analizadorsintactico.sentencias.implementaciones.OpLogico;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class GramaticaCondicion implements Gramatica {

    @Override
    public Sentencia analizar(ArrayList<Lexema> arrayLexemas) {
        Condicion condicion = new Condicion();

        OpLogico opLogico;
        Gramatica gramaticaOpLogico = new GramaticaOpLogico();
        //  flujoTokens.guardarPosicion();
        int posI = posicion;
        int posA = posicion;
        //primer token de la gramatica.
        Lexema lexema = arrayLexemas.get(posA);

        //tipo de dato.....
        if (lexema.getTipo() == TipoLexemaEnum.IDENT) {
            condicion.setIdent1(lexema);
            posA++;
            lexema = arrayLexemas.get(posA);
            posicion = posA;
            opLogico = (OpLogico) gramaticaOpLogico.analizar(arrayLexemas);

            //nombre del atributo....
            if (opLogico != null) {
                condicion.setOpLogico(opLogico);
                posA++;
                lexema = arrayLexemas.get(posA);

                if (lexema.getTipo() == TipoLexemaEnum.IDENT) {
                    condicion.setIdent2(lexema);
                    posA++;
                    lexema = arrayLexemas.get(posA);

                    if (lexema.getTipo() == TipoLexemaEnum.DELIMITADOR) {
                        //derivar...
                        posicion = posA;
                        return condicion;
                    } else {
                        //si no es identificador, no es atributo, se retorna el flujo a 
                        //la posicion inicial
                        posA = posI;
                        return null; //se retorna null para que se pruebe con otra regal..
                    }

                } else {
                    posA = posI;
                    return null; //s
                }
            }
            if (lexema.getTipo() == TipoLexemaEnum.DELIMITADOR) {
                //derivar...
                posicion = posA;
                return condicion;
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
