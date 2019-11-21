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
import edu.eam.analizadorsintactico.sentencias.implementaciones.TipoDato;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class GramaticaTipoDato implements Gramatica {

    @Override
    public Sentencia analizar(ArrayList<Lexema> arrayLexemas) {
//Sentencia a retornar....
        TipoDato tipoDato = new TipoDato();
        //   GramaticaWhile gramaticaWhile = new GramaticaWhile();
        //  flujoTokens.guardarPosicion();
        int posI = posicion;
        int posA = posicion;
        //primer token de la gramatica.
        Lexema lexema = arrayLexemas.get(posA);

        //tipo de dato.....
        if (lexema.getTipo() == TipoLexemaEnum.TD_STYLE || lexema.getTipo() == TipoLexemaEnum.TD_STRING
                || lexema.getTipo() == TipoLexemaEnum.TD_INTEGER || lexema.getTipo() == TipoLexemaEnum.TD_FIGURE
                || lexema.getTipo() == TipoLexemaEnum.TD_DOUBLE || lexema.getTipo() == TipoLexemaEnum.TD_COLOR
                || lexema.getTipo() == TipoLexemaEnum.TD_CHAR || lexema.getTipo() == TipoLexemaEnum.TD_BOOLEAN
                || lexema.getTipo() == TipoLexemaEnum.TIPO_DATO) {
            tipoDato.setTipoDato(lexema);
            posA++;
            posicion = posA;
            return tipoDato;
        } else {
            posA = posI;
            return null;
        }
    }

}
