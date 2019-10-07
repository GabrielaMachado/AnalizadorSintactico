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
public class DoWhile extends Sentencia{
    
    private Lexema isDo;
    private Lexema openKey;    
    private Lexema cuerpo1;    
    private Lexema closeKey;    
    private Lexema cuerpo2;    
    private Lexema isWhile;    
    private Lexema openP;
    private Lexema literalBooleana;
    private Lexema operadorLogico;
    private Lexema expresionComparacion;
    private Lexema closeP;

    public DoWhile() {
    }

    public DoWhile(Lexema isDo, Lexema openKey, Lexema cuerpo1, Lexema closeKey, Lexema cuerpo2, Lexema isWhile, Lexema openP, Lexema literalBooleana, Lexema operadorLogico, Lexema expresionComparacion, Lexema closeP) {
        this.isDo = isDo;
        this.openKey = openKey;
        this.cuerpo1 = cuerpo1;
        this.closeKey = closeKey;
        this.cuerpo2 = cuerpo2;
        this.isWhile = isWhile;
        this.openP = openP;
        this.literalBooleana = literalBooleana;
        this.expresionComparacion = expresionComparacion;
        this.closeP = closeP;
    }

    public Lexema getIsDo() {
        return isDo;
    }

    public void setIsDo(Lexema isDo) {
        this.isDo = isDo;
    }

    public Lexema getOpenKey() {
        return openKey;
    }

    public void setOpenKey(Lexema openKey) {
        this.openKey = openKey;
    }

    public Lexema getCuerpo1() {
        return cuerpo1;
    }

    public void setCuerpo1(Lexema cuerpo1) {
        this.cuerpo1 = cuerpo1;
    }

    public Lexema getCloseKey() {
        return closeKey;
    }

    public void setCloseKey(Lexema closeKey) {
        this.closeKey = closeKey;
    }

    public Lexema getCuerpo2() {
        return cuerpo2;
    }

    public void setCuerpo2(Lexema cuerpo2) {
        this.cuerpo2 = cuerpo2;
    }

    public Lexema getIsWhile() {
        return isWhile;
    }

    public void setIsWhile(Lexema isWhile) {
        this.isWhile = isWhile;
    }

    public Lexema getOpenP() {
        return openP;
    }

    public void setOpenP(Lexema openP) {
        this.openP = openP;
    }

    public Lexema getLiteralBooleana() {
        return literalBooleana;
    }

    public void setLiteralBooleana(Lexema literalBooleana) {
        this.literalBooleana = literalBooleana;
    }

    public Lexema getOperadorLogico() {
        return operadorLogico;
    }

    public void setOperadorLogico(Lexema operadorLogico) {
        this.operadorLogico = operadorLogico;
    }

    public Lexema getExpresionComparacion() {
        return expresionComparacion;
    }

    public void setExpresionComparacion(Lexema expresionComparacion) {
        this.expresionComparacion = expresionComparacion;
    }

    public Lexema getCloseP() {
        return closeP;
    }

    public void setCloseP(Lexema closeP) {
        this.closeP = closeP;
    }    
    
    @Override
    public List<Sentencia> llenarHijos() {
        hijos = new ArrayList<>();
        hijos.add(new SentenciaLexema(isDo));
        hijos.add(new SentenciaLexema(cuerpo1));
        hijos.add(new SentenciaLexema(cuerpo2));
        hijos.add(new SentenciaLexema(isWhile));
        hijos.add(new SentenciaLexema(literalBooleana));
        hijos.add(new SentenciaLexema(operadorLogico));
        hijos.add(new SentenciaLexema(expresionComparacion));
//        if (inicializacion != null) {
//            hijos.add(new SentenciaToken(inicializacion));
//        }
        return hijos;    }

    @Override
    public String toString() {
        return "dowhile:" + isDo.getToken() + " " + openKey.getToken() + " " + cuerpo1.getToken()
                + " " + closeKey.getToken() + " " + cuerpo2.getToken() + " " + isWhile.getToken()
                + " " + openP.getToken() + " " + literalBooleana.getToken()+ " " + operadorLogico.getToken()
                + " " + expresionComparacion.getToken()+ " " + closeP.getToken();
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
