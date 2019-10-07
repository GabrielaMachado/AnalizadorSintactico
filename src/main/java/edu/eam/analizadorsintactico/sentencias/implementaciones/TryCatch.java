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
public class TryCatch extends Sentencia{
    
    private Lexema isTry;
    private Lexema openKey;    
    private Lexema cuerpo1;    
    private Lexema closeKey;    
    private Lexema isCatch;    
    private Lexema openP;
    private Lexema ident1;    
    private Lexema ident2;
    private Lexema closeP;
    private Lexema openKey2;
    private Lexema cuerpo2;
    private Lexema closeKey2;

    public TryCatch() {
    }

    public TryCatch(Lexema isTry, Lexema openKey, Lexema cuerpo1, Lexema closeKey, Lexema isCatch, Lexema openP, Lexema ident1, Lexema ident2, Lexema closeP, Lexema openKey2, Lexema cuerpo2, Lexema closeKey2) {
        this.isTry = isTry;
        this.openKey = openKey;
        this.cuerpo1 = cuerpo1;
        this.closeKey = closeKey;
        this.isCatch = isCatch;
        this.openP = openP;
        this.ident1 = ident1;
        this.ident2 = ident2;
        this.closeP = closeP;
        this.openKey2 = openKey2;
        this.cuerpo2 = cuerpo2;
        this.closeKey2 = closeKey2;
    }

    public Lexema getIsTry() {
        return isTry;
    }

    public void setIsTry(Lexema isTry) {
        this.isTry = isTry;
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

    public Lexema getIsCatch() {
        return isCatch;
    }

    public void setIsCatch(Lexema isCatch) {
        this.isCatch = isCatch;
    }

    public Lexema getOpenP() {
        return openP;
    }

    public void setOpenP(Lexema openP) {
        this.openP = openP;
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

    public Lexema getCloseP() {
        return closeP;
    }

    public void setCloseP(Lexema closeP) {
        this.closeP = closeP;
    }

    public Lexema getOpenKey2() {
        return openKey2;
    }

    public void setOpenKey2(Lexema openKey2) {
        this.openKey2 = openKey2;
    }

    public Lexema getCuerpo2() {
        return cuerpo2;
    }

    public void setCuerpo2(Lexema cuerpo2) {
        this.cuerpo2 = cuerpo2;
    }

    public Lexema getCloseKey2() {
        return closeKey2;
    }

    public void setCloseKey2(Lexema closeKey2) {
        this.closeKey2 = closeKey2;
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
        return "tryCatch:" + isTry.getToken() + " " + openKey.getToken() + " " + cuerpo1.getToken()
                + " " + closeKey.getToken() + " " + isCatch.getToken() + " " + openP.getToken()
                + " " + ident1.getToken() + " " + ident2.getToken()+ " " + closeP.getToken()
                + " " + openKey2.getToken()+ " " + cuerpo2.getToken()+ " " + closeKey2.getToken();
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
