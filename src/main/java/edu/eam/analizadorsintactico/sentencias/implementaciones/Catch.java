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
public class Catch extends Sentencia {

    private Lexema isCatch;
    private Lexema openP;
    private Lexema ident1;
    private Lexema ident2;
    private Lexema closeP;
    private Lexema openKey;
    private Lexema cuerpo;
    private Lexema closeKey;
    private ListaMiembros<Miembro> listaMiembros;

    public Catch() {
    }

    public Catch(Lexema isCatch, Lexema openP, Lexema ident1, Lexema ident2, Lexema closeP, Lexema openKey, Lexema cuerpo, Lexema closeKey, ListaMiembros<Miembro> listaMiembros) {
        this.isCatch = isCatch;
        this.openP = openP;
        this.ident1 = ident1;
        this.ident2 = ident2;
        this.closeP = closeP;
        this.openKey = openKey;
        this.cuerpo = cuerpo;
        this.closeKey = closeKey;
        this.listaMiembros = listaMiembros;
    }

    public Lexema getIsCatch() {
        return isCatch;
    }

    public void setIsCatch(Lexema isCatch) {
        this.isCatch = isCatch;
    }

    public Lexema getOpenKey() {
        return openKey;
    }

    public void setOpenKey(Lexema openKey) {
        this.openKey = openKey;
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

    public Lexema getCloseKey() {
        return closeKey;
    }

    public void setCloseKey(Lexema closeKey) {
        this.closeKey = closeKey;
    }

    public Lexema getCloseP() {
        return closeP;
    }

    public void setCloseP(Lexema closeP) {
        this.closeP = closeP;
    }

    public ListaMiembros<Miembro> getListaMiembros() {
        return listaMiembros;
    }

    public void setListaMiembros(ListaMiembros<Miembro> listaMiembros) {
        this.listaMiembros = listaMiembros;
    }

    @Override
    public List<Sentencia> llenarHijos() {
//        hijos = new ArrayList<>();
//        hijos.add(new SentenciaToken(tipoDato));
//        hijos.add(new SentenciaToken(ident));
//        if (inicializacion != null) {
//            hijos.add(new SentenciaToken(inicializacion));
//        }
        return hijos;
    }

    @Override
    public String toString() {
        return "catch:" + isCatch.getToken() + " " + openP.getToken() + " " + ident1.getToken()
                + " " + ident2.getToken() + " " + closeP.getToken() + " " + openKey.getToken()
                + " " + cuerpo.getToken() + " " + closeKey.getToken();
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
