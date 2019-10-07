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
public class SentenciaMain extends Sentencia {

    private Lexema main;

    private Lexema openKey;

    private IF condicion;
    
    private While isWhile;
    
    private Atributo atributo;

    private Lexema closeKey;

    public SentenciaMain() {
    }

        public SentenciaMain(Lexema main, Lexema openKey, IF condicion, Lexema closeKey, Atributo atributo) {
        this.main = main;
        this.openKey = openKey;
        this.condicion = condicion;
        this.closeKey = closeKey;
        this.atributo = atributo;
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

    public IF getCondicion() {
        return condicion;
    }

    public void setCondicion(IF condicion) {
        this.condicion = condicion;
    }

    public Lexema getCloseKey() {
        return closeKey;
    }

    public void setCloseKey(Lexema closeKey) {
        this.closeKey = closeKey;
    }

    public While getIsWhile() {
        return isWhile;
    }

    public void setIsWhile(While isWhile) {
        this.isWhile = isWhile;
    }

    public Atributo getAtributo() {
        return atributo;
    }

    public void setAtributo(Atributo atributo) {
        this.atributo = atributo;
    }
    
    

    @Override
    public List<Sentencia> llenarHijos() {
        hijos = new ArrayList<>();

         if (main != null) {
            hijos.add(new SentenciaLexema(main));
        }
         if (condicion != null) {
            hijos.add(condicion);
        }
         
         if (atributo != null) {
            hijos.add(atributo);
        }

         
         for (int i = 0; i < hijos.size(); i++) {
             System.out.println("hijo "+i+ "  "+ hijos.get(i));
        }
        return (ArrayList<Sentencia>) hijos;
    }

    @Override
    public String toString() {
        return "Main: " + main.getToken() + " " + openKey.getToken() + " " + condicion.getIdent1()
                + " " + closeKey.getToken();
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
