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
import edu.eam.analizadorsintactico.sentencias.implementaciones.OpAritmetico;
import java.util.ArrayList;

/**
 *
 * @author dani0
 */
public class GramaticaOpAritmetico implements Gramatica{
    
    @Override
    public Sentencia analizar(ArrayList<Lexema> arrayLexemas) {
//Sentencia a retornar....
        OpAritmetico opAritmetico = new OpAritmetico();
        int posI = posicion;
        int posA = posicion;
        //primer token de la gramatica.
        Lexema lexema = arrayLexemas.get(posA);

        //tipo de dato.....
        if (lexema.getTipo() == TipoLexemaEnum.OP_ART_PLUS || lexema.getTipo() == TipoLexemaEnum.OP_ART_MINUS
                || lexema.getTipo() == TipoLexemaEnum.OP_ART_TIME || lexema.getTipo() == TipoLexemaEnum.OP_ART_DIVIDED
                || lexema.getTipo() == TipoLexemaEnum.OPERADORARITMETICO) {
            opAritmetico.setOpAritmetico(lexema);
            posA++;
            posicion = posA;
            return opAritmetico;
        } else {
            posA = posI;
            return null;
        }
    }

}
