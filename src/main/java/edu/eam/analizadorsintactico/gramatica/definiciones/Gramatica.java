/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eam.analizadorsintactico.gramatica.definiciones;

/**
 *Clase que define la interface que deben implementar todas las
 * gramaticas en el analisis Lexico.
 * @author dani0
 */
public interface Gramatica {
    
    /**
     * Metodo que permite determinar si desde la posicion inicial del 
     * flujo de tokens se encuentra una derivacion de la gramatica que 
     * representa esta clase.
     * @param flujoTokens
     * @return null si no representa la derivacion esta gramatica o 
     * un objeto de la gramatica en cuestion.
     */
    //Sentencia analizar(Sentencia padre,FlujoTokens flujoTokens);
    
}
