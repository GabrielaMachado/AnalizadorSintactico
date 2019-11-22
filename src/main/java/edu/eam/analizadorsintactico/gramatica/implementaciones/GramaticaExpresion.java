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
import edu.eam.analizadorsintactico.sentencias.implementaciones.ExpresionAritmetica;
import edu.eam.analizadorsintactico.sentencias.implementaciones.ExpresionLogica;
import java.util.ArrayList;

/**
 *
 * @author dani0
 */
public class GramaticaExpresion implements Gramatica {

    @Override
    public Sentencia analizar(ArrayList<Lexema> arrayLexemas) {
//Sentencia a retornar....
        Expresion expresion = new Expresion();
        ExpresionAritmetica expresionAritmetica;
        ExpresionLogica expresionLogica;

        GramaticaExpresionLogica gramaticaExpresionLogica = new GramaticaExpresionLogica();
        GramaticaExpresionAritmetica gramaticaExpresionAritmetica = new GramaticaExpresionAritmetica();
        //  flujoTokens.guardarPosicion();
        int posI = posicion;
        int posA = posicion;
        //primer token de la gramatica.
        Lexema lexema = arrayLexemas.get(posA);

        if (lexema.getTipo() == TipoLexemaEnum.IDENT) {
            expresion.setIdent(lexema);
            posA++;
            posicion = posA;
            return expresion;
        }

        expresionAritmetica = (ExpresionAritmetica) gramaticaExpresionAritmetica.analizar(arrayLexemas);

        if (expresionAritmetica != null) {
            expresion.setExpresionAritmetica(expresionAritmetica);
            posicion = posA;
            return expresion;
        }

        expresionLogica = (ExpresionLogica) gramaticaExpresionLogica.analizar(arrayLexemas);

        if (expresionLogica != null) {
            expresion.setExpresionLogica(expresionLogica);
            posicion = posA;
            return expresion;
        }

        return null;
    }

}
