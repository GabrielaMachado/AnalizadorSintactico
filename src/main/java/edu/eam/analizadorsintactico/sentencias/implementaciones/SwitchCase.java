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
public class SwitchCase extends Sentencia{
    private Lexema isSwitch;

    private Lexema openP;
    
    private Lexema ident;
    
    private Lexema closeP;
    
    private Lexema openKey;
    
    private Lexema isCase;
    
    private Lexema closeKey;

    public SwitchCase() {
    }

    public SwitchCase(Lexema isSwitch, Lexema openP, Lexema ident, Lexema closeP, Lexema openKey, Lexema isCase, Lexema closeKey) {
        this.isSwitch = isSwitch;
        this.openP = openP;
        this.ident = ident;
        this.closeP = closeP;
        this.openKey = openKey;
        this.isCase = isCase;
        this.closeKey = closeKey;
    }

    public Lexema getIsSwitch() {
        return isSwitch;
    }

    public void setIsSwitch(Lexema isSwitch) {
        this.isSwitch = isSwitch;
    }

    public Lexema getOpenP() {
        return openP;
    }

    public void setOpenP(Lexema openP) {
        this.openP = openP;
    }

    public Lexema getIdent() {
        return ident;
    }

    public void setIdent(Lexema ident) {
        this.ident = ident;
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

    public Lexema getIsCase() {
        return isCase;
    }

    public void setIsCase(Lexema isCase) {
        this.isCase = isCase;
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
        return "switchCase:" + isSwitch.getToken() + " " + openP.getToken() + " " + ident.getToken()
                + " " + closeP.getToken() + " " + openKey.getToken() + " " + isCase.getToken()
                + " " + closeKey.getToken();
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
