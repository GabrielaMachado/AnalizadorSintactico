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

    /**
     * Tipo de retorno.
     */
    private Lexema ident3;

    public Instancia() {
    }

    public Instancia(Lexema ident1, Lexema ident2, Lexema ident3) {
        this.ident1 = ident1;
        this.ident2 = ident2;
        this.ident3 = ident3;
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
//        hijos = new ArrayList<>();
//        hijos.add(new SentenciaToken(tipoDato));
//        hijos.add(new SentenciaToken(ident));
//        if (inicializacion != null) {
//            hijos.add(new SentenciaToken(inicializacion));
//        }
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
