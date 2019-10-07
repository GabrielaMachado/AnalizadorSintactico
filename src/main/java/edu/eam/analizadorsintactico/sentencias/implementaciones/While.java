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
 * @author dani0
 */
public class While extends Sentencia{
    
    private Lexema isWhile;
    private Lexema openP;    
    private Lexema literalBooleana;    
    private Lexema expresionComparacion;    
    private Lexema closeP;    
    private Lexema openKey;    
    private Lexema cuerpo1;
    private Lexema closeKey;
    private Lexema semicolon;
    private Lexema cuerpo2;

    public While() {
    }

    public While(Lexema isWhile, Lexema openP, Lexema literalBooleana, Lexema expresionComparacion, Lexema closeP, Lexema openKey, Lexema cuerpo1, Lexema closeKey, Lexema semicolon, Lexema cuerpo2) {
        this.isWhile = isWhile;
        this.openP = openP;
        this.literalBooleana = literalBooleana;
        this.expresionComparacion = expresionComparacion;
        this.closeP = closeP;
        this.openKey = openKey;
        this.cuerpo1 = cuerpo1;
        this.closeKey = closeKey;
        this.semicolon = semicolon;
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

    public Lexema getSemicolon() {
        return semicolon;
    }

    public void setSemicolon(Lexema semicolon) {
        this.semicolon = semicolon;
    }

    public Lexema getCuerpo2() {
        return cuerpo2;
    }

    public void setCuerpo2(Lexema cuerpo2) {
        this.cuerpo2 = cuerpo2;
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
        return "while:" + isWhile.getToken() + " " + openP.getToken() + " " + literalBooleana.getToken()
                + " " + expresionComparacion.getToken() + " " + closeP.getToken() + " " + openKey.getToken()
                + " " + cuerpo1.getToken() + " " + closeKey.getToken()+ " " + semicolon.getToken()+ " " + cuerpo2.getToken();
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
