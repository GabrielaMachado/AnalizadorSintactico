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
import edu.eam.analizadorsintactico.sentencias.implementaciones.TipoDatoNumerico;
import java.util.ArrayList;

/**
 *
 * @author dani0
 */
public class GramaticaTipoDatoNumerico implements Gramatica{
    
    @Override
    public Sentencia analizar(ArrayList<Lexema> arrayLexemas) {
//Sentencia a retornar....
        TipoDatoNumerico tipoDatoNumerico = new TipoDatoNumerico();
        int posI = posicion;
        int posA = posicion;
        //primer token de la gramatica.
        Lexema lexema = arrayLexemas.get(posA);

        //tipo de dato.....
        if (lexema.getTipo() == TipoLexemaEnum.TD_INTEGER || lexema.getTipo() == TipoLexemaEnum.TD_DOUBLE) {
            tipoDatoNumerico.setTipoDatoNumerico(lexema);
            posA++;
            posicion = posA;
            return tipoDatoNumerico;
        } else {
            posA = posI;
            return null;
        }
    }

}
