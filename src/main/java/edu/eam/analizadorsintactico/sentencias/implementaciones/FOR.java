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
public class FOR extends Sentencia{
    private Lexema FOR;
    private TipoDatoNumerico tipoDatoNumerico;
    private Lexema ident1;
    private Lexema ident2;
    private Lexema ident3;
    private OpLogico operadorLogico;
    private Lexema ident4;
    private Lexema ident5;
    private Cuerpo cuerpo;

    public FOR() {
    }

    public FOR(Lexema FOR, TipoDatoNumerico tipoDatoNumerico, Lexema ident1, Lexema ident2, Lexema ident3, OpLogico operadorLogico, Lexema ident4, Lexema ident5, Cuerpo cuerpo) {
        this.FOR = FOR;
        this.tipoDatoNumerico = tipoDatoNumerico;
        this.ident1 = ident1;
        this.ident2 = ident2;
        this.ident3 = ident3;
        this.operadorLogico = operadorLogico;
        this.ident4 = ident4;
        this.ident5 = ident5;
        this.cuerpo = cuerpo;
    }

    public Lexema getFOR() {
        return FOR;
    }

    public void setFOR(Lexema FOR) {
        this.FOR = FOR;
    }

    public TipoDatoNumerico getTipoDatoNumerico() {
        return tipoDatoNumerico;
    }

    public void setTipoDatoNumerico(TipoDatoNumerico tipoDatoNumerico) {
        this.tipoDatoNumerico = tipoDatoNumerico;
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

    public OpLogico getOperadorLogico() {
        return operadorLogico;
    }

    public void setOperadorLogico(OpLogico operadorLogico) {
        this.operadorLogico = operadorLogico;
    }

    public Lexema getIdent4() {
        return ident4;
    }

    public void setIdent4(Lexema ident4) {
        this.ident4 = ident4;
    }

    public Lexema getIdent5() {
        return ident5;
    }

    public void setIdent5(Lexema ident5) {
        this.ident5 = ident5;
    }

    public Cuerpo getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(Cuerpo cuerpo) {
        this.cuerpo = cuerpo;
    }

    @Override
    public List<Sentencia> llenarHijos() {
        hijos = new ArrayList<>();
        if (FOR != null) {
            hijos.add(new SentenciaLexema(FOR));
        }
        if (tipoDatoNumerico != null){
            hijos.add(tipoDatoNumerico);
        }
        if (ident1 != null){
            hijos.add(new SentenciaLexema(ident1));
        }
        if (ident2 != null){
            hijos.add(new SentenciaLexema(ident2));
        }
        if (ident3 != null){
            hijos.add(new SentenciaLexema(ident3));
        }
        if (operadorLogico != null){
            hijos.add(operadorLogico);
        }
        if (ident4 != null){
            hijos.add(new SentenciaLexema(ident4));
        }
        if (ident5 != null){
            hijos.add(new SentenciaLexema(ident5));
        }
        if (cuerpo != null){
            hijos.add(cuerpo);
        }
        return hijos;
    }

    @Override
    public String toString() {
        return "for:" + FOR.getToken() + " " + tipoDatoNumerico.getTipoDatoNumerico()
                + " " + ident1.getToken() + " " + ident2.getToken()+ " " + ident3.getToken()
                + " " + ident4.getToken() + " " + ident5.getToken()
                + " " + cuerpo.getMiembros();
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
