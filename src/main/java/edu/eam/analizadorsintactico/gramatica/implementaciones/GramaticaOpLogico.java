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
import edu.eam.analizadorsintactico.sentencias.implementaciones.OpLogico;
import java.util.ArrayList;

/**
 *
 * @author dani0
 */
public class GramaticaOpLogico implements Gramatica{
    
    @Override
    public Sentencia analizar(ArrayList<Lexema> arrayLexemas) {
//Sentencia a retornar....
        OpLogico opLogico = new OpLogico();
        int posI = posicion;
        int posA = posicion;
        //primer token de la gramatica.
        Lexema lexema = arrayLexemas.get(posA);

        //tipo de dato.....
        if (lexema.getTipo() == TipoLexemaEnum.OP_LOG_AND || lexema.getTipo() == TipoLexemaEnum.OP_LOG_OR
                || lexema.getTipo() == TipoLexemaEnum.OP_LOG_LTHAN || lexema.getTipo() == TipoLexemaEnum.OP_LOG_GTHAN
                || lexema.getTipo() == TipoLexemaEnum.OP_LOG_ISEQUALS || lexema.getTipo() == TipoLexemaEnum.OPERADOR_LOGICO) {
            opLogico.setOpLogico(lexema);
            posA++;
            posicion = posA;
            return opLogico;
        } else {
            posA = posI;
            return null;
        }
    }

}
