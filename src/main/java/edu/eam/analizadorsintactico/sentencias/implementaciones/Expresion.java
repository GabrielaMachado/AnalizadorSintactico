/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eam.analizadorsintactico.sentencias.implementaciones;

import edu.eam.analizadorlexicos.Lexema;
import edu.eam.analizadorsintactico.sentencias.definicion.Sentencia;
import java.util.List;

/**
 *
 * @author dani0
 */
public class Expresion extends Sentencia{
    
    private Lexema expresionLogica;

    private Lexema ident;
    
    private Lexema llamadoFuncion;
    
    
    public Expresion() {
    }

    public Expresion(Lexema expresionLogica, Lexema ident, Lexema llamadoFuncion) {
        this.expresionLogica = expresionLogica;
        this.ident = ident;
        this.llamadoFuncion = llamadoFuncion;
    }

    public Lexema getExpresionLogica() {
        return expresionLogica;
    }

    public void setExpresionLogica(Lexema expresionLogica) {
        this.expresionLogica = expresionLogica;
    }

    public Lexema getIdent() {
        return ident;
    }

    public void setIdent(Lexema ident) {
        this.ident = ident;
    }

    public Lexema getLlamadoFuncion() {
        return llamadoFuncion;
    }

    public void setLlamadoFuncion(Lexema llamadoFuncion) {
        this.llamadoFuncion = llamadoFuncion;
    }

    @Override
    public List<Sentencia> llenarHijos() {
//        hijos = new ArrayList<>();
//        hijos.add(new SentenciaToken(tipoDato));
//        hijos.add(new SentenciaToken(ident));
//        if (inicializacion != null) {
//            hijos.add(new SentenciaToken(inicializacion));
//        }
        return hijos;    }

    @Override
    public String toString() {
        return "Expresion logica:" + expresionLogica.getToken() + " " + ident.getToken() + " " + llamadoFuncion.getToken();
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
