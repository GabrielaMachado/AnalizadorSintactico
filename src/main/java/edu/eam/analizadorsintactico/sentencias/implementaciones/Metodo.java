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
 * @author user
 */
public class Metodo extends Sentencia{
    
    /**
     * Modificador de acceso del metodo.
     */
    private TipoDato tipoDato;
    private Lexema ident;
    private Parametro parametro;
    private Cuerpo cuerpo;

    public Metodo() {
    }

    public Metodo(TipoDato tipoDato, Lexema ident, Parametro parametro, Cuerpo cuerpo) {
        this.tipoDato = tipoDato;
        this.ident = ident;
        this.parametro = parametro;
        this.cuerpo = cuerpo;
    }

    @Override
    public List<Sentencia> llenarHijos() {
        hijos = new ArrayList<>();

        if (tipoDato != null) {
            hijos.add(new SentenciaLexema(ident));
        }
        if (ident != null) {
            hijos.add(new SentenciaLexema(ident));
        }
        if (parametro != null) {
            hijos.add(parametro);
        }
        if (cuerpo != null) {
            hijos.add(cuerpo);
        }
        for (int i = 0; i < hijos.size(); i++) {
            System.out.println("hijo " + i + "  " + hijos.get(i));
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

    public Parametro getParametro() {
        return parametro;
    }

    public void setParametro(Parametro parametro) {
        this.parametro = parametro;
    }

    public Cuerpo getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(Cuerpo cuerpo) {
        this.cuerpo = cuerpo;
    }

    @Override
    public String toString() {
        return "Metodo :" + ident.getToken();
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
