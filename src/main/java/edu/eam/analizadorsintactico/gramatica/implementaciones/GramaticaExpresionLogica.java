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
import edu.eam.analizadorsintactico.sentencias.implementaciones.Expresion;
import edu.eam.analizadorsintactico.sentencias.implementaciones.ExpresionLogica;
import edu.eam.analizadorsintactico.sentencias.implementaciones.OpLogico;
import java.util.ArrayList;

/**
 *
 * @author dani0
 */
public class GramaticaExpresionLogica implements Gramatica {

    @Override
    public Sentencia analizar(ArrayList<Lexema> arrayLexemas) {
//Sentencia a retornar....
        OpLogico operadorLogico;
        Expresion expresion;
        GramaticaExpresion gramaticaExpresion = new GramaticaExpresion();
        GramaticaOpLogico gramaticaOpLogico = new GramaticaOpLogico();
        ExpresionLogica expresionLogica = new ExpresionLogica();
        //  flujoTokens.guardarPosicion();
        int posI = posicion;
        int posA = posicion;
        //primer token de la gramatica.
        Lexema lexema = arrayLexemas.get(posA);
        boolean continuar = true;
        do {

            expresion = (Expresion) gramaticaExpresion.analizar(arrayLexemas);

            if (expresion != null) {
                expresionLogica.getExpresiones().add(expresion);
                posicion++;
                posA = posicion;

                operadorLogico = (OpLogico) gramaticaOpLogico.analizar(arrayLexemas);
                if (operadorLogico != null) {
                    expresionLogica.getOperadores().add(operadorLogico);
                    posicion++;
                    posA = posicion;

                    if (lexema == null) {
                        System.out.println("rayos");
                    }
                    continue;
                }
            }
            continuar = false;
        } while (continuar);
        //tipo de dato.....

        return null;
    }

}
