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
public class Funcion extends Sentencia{
    
    private Lexema ident;

    private Lexema openP;
    
    private Lexema parametro;
    
    private Lexema closeP;
    
    private Lexema openKey;
    
    private Lexema cuerpo;
    
    private Lexema closeKey;

    public Funcion() {
    }

    public Funcion(Lexema ident, Lexema openP, Lexema parametro, Lexema closeP, Lexema openKey, Lexema cuerpo, Lexema closeKey) {
        this.ident = ident;
        this.openP = openP;
        this.parametro = parametro;
        this.closeP = closeP;
        this.openKey = openKey;
        this.cuerpo = cuerpo;
        this.closeKey = closeKey;
    }

    public Lexema getIdent() {
        return ident;
    }

    public void setIdent(Lexema ident) {
        this.ident = ident;
    }

    public Lexema getOpenP() {
        return openP;
    }

    public void setOpenP(Lexema openP) {
        this.openP = openP;
    }

    public Lexema getParametro() {
        return parametro;
    }

    public void setParametro(Lexema parametro) {
        this.parametro = parametro;
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
        return "funcion:" + ident.getToken() + " " + openP.getToken() + " " + parametro.getToken()
                + " " + closeP.getToken() + " " + openKey.getToken() + " " + cuerpo.getToken()
                + " " + closeKey.getToken();
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
