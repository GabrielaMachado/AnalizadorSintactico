/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eam.analizadorsintactico.sentencias.implementaciones;

import edu.eam.analizadorlexicos.Lexema;
import edu.eam.analizadorsintactico.sentencias.definicion.Sentencia;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dani0
 */
public class Expresion extends Sentencia {

    private ExpresionAritmetica expresionAritmetica;

    private ExpresionLogica expresionLogica;

    private Lexema ident;

    private Lexema llamadoFuncion;

    public Expresion() {
    }

    public Expresion(ExpresionAritmetica expresionAritmetica, ExpresionLogica expresionLogica, Lexema ident, Lexema llamadoFuncion) {
        this.expresionAritmetica = expresionAritmetica;
        this.ident = ident;
        this.llamadoFuncion = llamadoFuncion;
        this.expresionLogica = expresionLogica;
    }

    public ExpresionLogica getExpresionLogica() {
        return expresionLogica;
    }

    public void setExpresionLogica(ExpresionLogica expresionLogica) {
        this.expresionLogica = expresionLogica;
    }

    public ExpresionAritmetica getExpresionAritmetica() {
        return expresionAritmetica;
    }

    public void setExpresionAritmetica(ExpresionAritmetica expresionAritmetica) {
        this.expresionAritmetica = expresionAritmetica;
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
        hijos = new ArrayList<>();

        if (expresionAritmetica != null) {

            hijos.add(expresionAritmetica);
        }
        if (expresionLogica != null) {

            hijos.add(expresionLogica);
        }
        if (ident != null) {

            hijos.add(new SentenciaLexema(ident));
        }

        return hijos;
    }

    @Override
    public String toString() {
        return "Expresion logica:";
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
