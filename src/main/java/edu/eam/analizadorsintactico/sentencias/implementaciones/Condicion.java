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
public class Condicion extends Sentencia {

    /**
     * Modificador de acceso del metodo.
     */
    private Lexema ident1;
    private OpLogico opLogico;
    private Lexema ident2;


    public Condicion() {
    }

    public Condicion(Lexema ident1, OpLogico opLogico, Lexema ident2) {
        this.ident1 = ident1;
        this.opLogico = opLogico;
        this.ident2 = ident2;
    }

    public Lexema getIdent1() {
        return ident1;
    }

    public void setIdent1(Lexema ident1) {
        this.ident1 = ident1;
    }

    public OpLogico getOpLogico() {
        return opLogico;
    }

    public void setOpLogico(OpLogico opLogico) {
        this.opLogico = opLogico;
    }

    public Lexema getIdent2() {
        return ident2;
    }

    public void setIdent2(Lexema ident2) {
        this.ident2 = ident2;
    }

    @Override
    public List<Sentencia> llenarHijos() {
        hijos = new ArrayList<>();
        if (ident1 != null) {
            hijos.add(new SentenciaLexema(ident1));
        }
        if (opLogico != null) {
            hijos.add(opLogico);
        }
        if (ident2 != null) {
            hijos.add(new SentenciaLexema(ident2));
        }
        return hijos;
    }

    @Override
    public String toString() {
        return "Condicion: " + ident1.getToken();
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
