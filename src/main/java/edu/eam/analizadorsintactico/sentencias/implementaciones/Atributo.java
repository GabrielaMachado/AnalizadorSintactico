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
    private TipoDato tipoDato;
    /**
     * Nombre del metodo
     */
    private Lexema ident;
    private Lexema equals;

    /**
     * Tipo de retorno.
     */
    private Inicializacion inicializacion;

    public Atributo() {
    }

    public Atributo(TipoDato tipoDato, Lexema ident, Lexema equals, Inicializacion inicializacion) {
        this.tipoDato = tipoDato;
        this.ident = ident;
        this.equals = equals;
        this.inicializacion = inicializacion;
    }

    @Override
    public List<Sentencia> llenarHijos() {
        hijos = new ArrayList<>();
        if (tipoDato != null) {
            hijos.add(tipoDato);
        }
        hijos.add(new SentenciaLexema(ident));
        if (inicializacion != null) {
            hijos.add(inicializacion);
        }
        return hijos;
    }

    public TipoDato getTipoDato() {
        return tipoDato;
    }

    public void setTipoDato(TipoDato tipoDato) {
        this.tipoDato = tipoDato;
    }

    public Lexema getIdent() {
        return ident;
    }

    public void setIdent(Lexema ident) {
        this.ident = ident;
    }

    public Lexema getEquals() {
        return equals;
    }

    public void setEquals(Lexema equals) {
        this.equals = equals;
    }

    public Inicializacion getInicializacion() {
        return inicializacion;
    }

    public void setInicializacion(Inicializacion inicializacion) {
        this.inicializacion = inicializacion;
    }

    @Override
    public String toString() {
        return "Atributo:" + tipoDato.getTipoDato() + " " + ident.getToken();
    }

    @Override
    public String parse() {
        StringBuilder str = new StringBuilder();

        str.append(tipoDato.parse());
        str.append(ident.getToken()).append(" ");
        str.append(equals.getToken()).append(" ");
        str.append(inicializacion.parse()).append("\n");
        
        return str.toString();
    }

}
