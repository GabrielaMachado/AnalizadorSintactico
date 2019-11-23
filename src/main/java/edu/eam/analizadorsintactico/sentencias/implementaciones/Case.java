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
public class Case extends Sentencia {

    private Lexema isCase;
    private Lexema ident;
    private OpAritmetico opAritmetico;
    private Cuerpo cuerpo;
    private Lexema isBreak;
    
    public Case() {
    }

    public Case(Lexema isCase, Lexema ident, OpAritmetico opAritmetico, Cuerpo cuerpo, Lexema isBreak) {
        this.isCase = isCase;
        this.ident = ident;
        this.opAritmetico = opAritmetico;
        this.cuerpo = cuerpo;
        this.isBreak = isBreak;
    }

    public Lexema getIsCase() {
        return isCase;
    }

    public void setIsCase(Lexema isCase) {
        this.isCase = isCase;
    }

    public Lexema getIdent() {
        return ident;
    }

    public void setIdent(Lexema ident) {
        this.ident = ident;
    }

    public OpAritmetico getOpAritmetico() {
        return opAritmetico;
    }

    public void setOpAritmetico(OpAritmetico opAritmetico) {
        this.opAritmetico = opAritmetico;
    }

    public Cuerpo getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(Cuerpo cuerpo) {
        this.cuerpo = cuerpo;
    }

    public Lexema getIsBreak() {
        return isBreak;
    }

    public void setIsBreak(Lexema isBreak) {
        this.isBreak = isBreak;
    }
    
    @Override
    public List<Sentencia> llenarHijos() {
        hijos = new ArrayList<>();
        if (isCase != null) {
            hijos.add(new SentenciaLexema(isCase));
        }
        if (ident != null) {
            hijos.add(new SentenciaLexema(ident));
        }
        if (opAritmetico != null) {
            hijos.add(opAritmetico);
        }
        if (cuerpo != null) {
            hijos.add(cuerpo);
        }
        if (isBreak != null) {
            hijos.add(new SentenciaLexema(isBreak));
        }
        return hijos;
    }

    @Override
    public String toString() {

        return "case:" + isCase.getToken();

    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
