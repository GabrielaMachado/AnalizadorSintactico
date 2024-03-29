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
public class TipoDatoNumerico extends Sentencia{
     /**
     * Modificador de acceso del metodo.
     */
    private Lexema tipoDatoNumerico;

    public TipoDatoNumerico() {
    }

    public TipoDatoNumerico(Lexema tipoDatoNumerico) {
        this.tipoDatoNumerico = tipoDatoNumerico;
    }

    @Override
    public List<Sentencia> llenarHijos() {
        hijos = new ArrayList<>();
        hijos.add(new SentenciaLexema(tipoDatoNumerico));
        return hijos;
    }

    public Lexema getTipoDatoNumerico() {
        return tipoDatoNumerico;
    }

    public void setTipoDatoNumerico(Lexema tipoDatoNumerico) {
        this.tipoDatoNumerico = tipoDatoNumerico;
    }

    @Override
    public String toString() {
        return "Atributo:" + tipoDatoNumerico.getToken();
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
