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
public class Atributo extends Sentencia {

    /**
     * Modificador de acceso del metodo.
     */
    private Lexema tipoDato;
    /**
     * Nombre del metodo
     */
    private Lexema ident;

    /**
     * Tipo de retorno.
     */
    private Lexema inicializacion;

    public Atributo() {
    }

    public Atributo(Lexema tipoDato, Lexema ident, Lexema inicializacion) {
        this.tipoDato = tipoDato;
        this.ident = ident;
        this.inicializacion = inicializacion;
    }

    @Override
    public List<Sentencia> llenarHijos() {
//        hijos = new ArrayList<>();
//        hijos.add(new SentenciaToken(tipoDato));
//        hijos.add(new SentenciaToken(ident));
//        if (inicializacion != null) {
//            hijos.add(new SentenciaToken(inicializacion));
//        }
        return hijos;
    }

    public Lexema getTipoDato() {
        return tipoDato;
    }

    public void setTipoDato(Lexema tipoDato) {
        this.tipoDato = tipoDato;
    }

    public Lexema getIdent() {
        return ident;
    }

    public void setIdent(Lexema ident) {
        this.ident = ident;
    }

    public Lexema getInicializacion() {
        return inicializacion;
    }

    public void setInicializacion(Lexema inicializacion) {
        this.inicializacion = inicializacion;
    }

    @Override
    public String toString() {
        return "Atributo:" + tipoDato.getToken() + " " + ident.getToken();
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
