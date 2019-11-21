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
public class Instancia extends Sentencia {

    /**
     * Modificador de acceso del metodo.
     */
    private Lexema ident1;
    /**
     * Nombre del metodo
     */
    private Lexema ident2;
    
    private Lexema equals;
    
    private Lexema isNew;

    /**
     * Tipo de retorno.
     */
    private Lexema ident3;

    public Instancia() {
    }

    public Instancia(Lexema ident1, Lexema ident2, Lexema ident3, Lexema equals, Lexema isNew) {
        this.ident1 = ident1;
        this.ident2 = ident2;
        this.ident3 = ident3;
        this.equals = equals;
        this.isNew = isNew;
    }

    public Lexema getEquals() {
        return equals;
    }

    public void setEquals(Lexema equals) {
        this.equals = equals;
    }

    public Lexema getIsNew() {
        return isNew;
    }

    public void setIsNew(Lexema isNew) {
        this.isNew = isNew;
    }

    
    public Lexema getIdent1() {
        return ident1;
    }

    public void setIdent1(Lexema ident1) {
        this.ident1 = ident1;
    }

    public Lexema getIdent2() {
        return ident2;
    }

    public void setIdent2(Lexema ident2) {
        this.ident2 = ident2;
    }

    public Lexema getIdent3() {
        return ident3;
    }

    public void setIdent3(Lexema ident3) {
        this.ident3 = ident3;
    }

    @Override
    public List<Sentencia> llenarHijos() {
        hijos = new ArrayList<>();
        hijos.add(new SentenciaLexema(ident1));
        hijos.add(new SentenciaLexema(ident2));
        hijos.add(new SentenciaLexema(equals));
        hijos.add(new SentenciaLexema(isNew));
        hijos.add(new SentenciaLexema(ident3));
        return hijos;    }

    @Override
    public String toString() {
        return "Instancia:" + ident1.getToken() + " " + ident2.getToken() + " " + ident3.getToken();
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
