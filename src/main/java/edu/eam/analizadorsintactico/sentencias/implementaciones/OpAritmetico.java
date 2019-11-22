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
public class OpAritmetico extends Sentencia{
     /**
     * Modificador de acceso del metodo.
     */
    private Lexema opAritmetico;

    public OpAritmetico() {
    }

    public OpAritmetico(Lexema opAritmetico) {
        this.opAritmetico = opAritmetico;
    }

    @Override
    public List<Sentencia> llenarHijos() {
        hijos = new ArrayList<>();
        hijos.add(new SentenciaLexema(opAritmetico));
        return hijos;
    }

    public Lexema getOpAritmetico() {
        return opAritmetico;
    }

    public void setOpAritmetico(Lexema opAritmetico) {
        this.opAritmetico = opAritmetico;
    }


    @Override
    public String toString() {
        return "Atributo:" + opAritmetico.getToken();
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
