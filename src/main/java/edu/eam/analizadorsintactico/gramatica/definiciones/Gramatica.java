/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eam.analizadorsintactico.gramatica.definiciones;

import edu.eam.analizadorlexicos.Lexema;
import edu.eam.analizadorsintactico.sentencias.definicion.Sentencia;
import java.util.ArrayList;

/**
 * Clase que define la interface que deben implementar todas las gramaticas en
 * el analisis Lexico.
 *
 * @author dani0
 */
public interface Gramatica {

    /**
     * Metodo que permite determinar si desde la posicion inicial del flujo de
     * tokens se encuentra una derivacion de la gramatica que representa esta
     * clase.
     *
     * @param flujoTokens
     * @return null si no representa la derivacion esta gramatica o un objeto de
     * la gramatica en cuestion.
     */
    public static int posicionInicial = 0;

    Sentencia analizar(Sentencia padre, ArrayList<Lexema> arrayLexemas);

}
