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
public class SentenciaMain extends Sentencia{
    
    private Lexema main;
    
    private Lexema openKey;
    
    private Lexema cuerpo;

    private Lexema closeKey;

    public SentenciaMain() {
    }

    public SentenciaMain(Lexema main, Lexema openKey, Lexema cuerpo, Lexema closeKey) {
        this.main = main;
        this.openKey = openKey;
        this.cuerpo = cuerpo;
        this.closeKey = closeKey;
    }

    public Lexema getMain() {
        return main;
    }

    public void setMain(Lexema main) {
        this.main = main;
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
        return "Main: " + main.getToken() + " " + openKey.getToken() + " " + cuerpo.getToken() + 
                " " + closeKey.getToken();
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
