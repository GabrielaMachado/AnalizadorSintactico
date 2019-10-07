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
public class FOR extends Sentencia{
    private Lexema isFor;
    private Lexema openP;    
    private Lexema tipoDatoNumerico;    
    private Lexema ident1;    
    private Lexema equals;    
    private Lexema numero1;    
    private Lexema ident2;
    private Lexema semicolon;
    private Lexema numero2;
    private Lexema ident3;
    private Lexema operadorRelacional;
    private Lexema numero3;
    private Lexema ident4;
    private Lexema semicolon2;
    private Lexema ident5;
    private Lexema plusPlus;
    private Lexema munisMinus;
    private Lexema operadorAritmetico;
    private Lexema numero4;
    private Lexema closeP;
    private Lexema openKey;
    private Lexema cuerpo;
    private Lexema closeKey;
    

    public FOR() {
    }

    public FOR(Lexema isFor, Lexema openP, Lexema tipoDatoNumerico, Lexema ident1, Lexema equals, Lexema numero1, Lexema ident2, Lexema semicolon, Lexema numero2, Lexema ident3, Lexema operadorRelacional, Lexema numero3, Lexema ident4, Lexema semicolon2, Lexema ident5, Lexema plusPlus, Lexema munisMinus, Lexema operadorAritmetico, Lexema numero4, Lexema closeP, Lexema openKey, Lexema cuerpo, Lexema closeKey) {
        this.isFor = isFor;
        this.openP = openP;
        this.tipoDatoNumerico = tipoDatoNumerico;
        this.ident1 = ident1;
        this.equals = equals;
        this.numero1 = numero1;
        this.ident2 = ident2;
        this.semicolon = semicolon;
        this.numero2 = numero2;
        this.ident3 = ident3;
        this.operadorRelacional = operadorRelacional;
        this.numero3 = numero3;
        this.ident4 = ident4;
        this.semicolon2 = semicolon2;
        this.ident5 = ident5;
        this.plusPlus = plusPlus;
        this.munisMinus = munisMinus;
        this.operadorAritmetico = operadorAritmetico;
        this.numero4 = numero4;
        this.closeP = closeP;
        this.openKey = openKey;
        this.cuerpo = cuerpo;
        this.closeKey = closeKey;
    }

    public Lexema getIsFor() {
        return isFor;
    }

    public void setIsFor(Lexema isFor) {
        this.isFor = isFor;
    }

    public Lexema getOpenP() {
        return openP;
    }

    public void setOpenP(Lexema openP) {
        this.openP = openP;
    }

    public Lexema getTipoDatoNumerico() {
        return tipoDatoNumerico;
    }

    public void setTipoDatoNumerico(Lexema tipoDatoNumerico) {
        this.tipoDatoNumerico = tipoDatoNumerico;
    }

    public Lexema getIdent1() {
        return ident1;
    }

    public void setIdent1(Lexema ident1) {
        this.ident1 = ident1;
    }

    public Lexema getEquals() {
        return equals;
    }

    public void setEquals(Lexema equals) {
        this.equals = equals;
    }

    public Lexema getNumero1() {
        return numero1;
    }

    public void setNumero1(Lexema numero1) {
        this.numero1 = numero1;
    }

    public Lexema getIdent2() {
        return ident2;
    }

    public void setIdent2(Lexema ident2) {
        this.ident2 = ident2;
    }

    public Lexema getSemicolon() {
        return semicolon;
    }

    public void setSemicolon(Lexema semicolon) {
        this.semicolon = semicolon;
    }

    public Lexema getNumero2() {
        return numero2;
    }

    public void setNumero2(Lexema numero2) {
        this.numero2 = numero2;
    }

    public Lexema getIdent3() {
        return ident3;
    }

    public void setIdent3(Lexema ident3) {
        this.ident3 = ident3;
    }

    public Lexema getOperadorRelacional() {
        return operadorRelacional;
    }

    public void setOperadorRelacional(Lexema operadorRelacional) {
        this.operadorRelacional = operadorRelacional;
    }

    public Lexema getNumero3() {
        return numero3;
    }

    public void setNumero3(Lexema numero3) {
        this.numero3 = numero3;
    }

    public Lexema getIdent4() {
        return ident4;
    }

    public void setIdent4(Lexema ident4) {
        this.ident4 = ident4;
    }

    public Lexema getSemicolon2() {
        return semicolon2;
    }

    public void setSemicolon2(Lexema semicolon2) {
        this.semicolon2 = semicolon2;
    }

    public Lexema getIdent5() {
        return ident5;
    }

    public void setIdent5(Lexema ident5) {
        this.ident5 = ident5;
    }

    public Lexema getPlusPlus() {
        return plusPlus;
    }

    public void setPlusPlus(Lexema plusPlus) {
        this.plusPlus = plusPlus;
    }

    public Lexema getMunisMinus() {
        return munisMinus;
    }

    public void setMunisMinus(Lexema munisMinus) {
        this.munisMinus = munisMinus;
    }

    public Lexema getOperadorAritmetico() {
        return operadorAritmetico;
    }

    public void setOperadorAritmetico(Lexema operadorAritmetico) {
        this.operadorAritmetico = operadorAritmetico;
    }

    public Lexema getNumero4() {
        return numero4;
    }

    public void setNumero4(Lexema numero4) {
        this.numero4 = numero4;
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

    public Lexema getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(Lexema cuerpo) {
        this.cuerpo = cuerpo;
    }

    public Lexema getCloseKey() {
        return closeKey;
    }

    public void setCloseKey(Lexema closeKey) {
        this.closeKey = closeKey;
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
        return "for:" + isFor.getToken() + " " + openP.getToken() + " " + tipoDatoNumerico.getToken()
                + " " + ident1.getToken() + " " + equals.getToken() + " " + numero1.getToken()
                + " " + ident2.getToken() + " " + semicolon.getToken()+ " " + numero2.getToken()+ " " + ident3.getToken()
                + " " + operadorRelacional.getToken()+ " " + numero3.getToken()+ " " + ident4.getToken()+ " " + semicolon2.getToken()
                + " " + ident5.getToken()+ " " + plusPlus.getToken()+ " " + munisMinus.getToken()
                + " " + operadorAritmetico.getToken() + " " + numero4.getToken() + " " + closeP.getToken()
                + " " + openKey.getToken()+ " " + cuerpo.getToken()+ " " + closeKey.getToken();
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
