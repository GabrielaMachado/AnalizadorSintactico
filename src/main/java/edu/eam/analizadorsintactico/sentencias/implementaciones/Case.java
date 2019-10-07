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
public class Case extends Sentencia{
    
    private Lexema isCase;

    private Lexema comillas1;
    
    private Lexema letras;
    
    private Lexema operadoresAritmeticos;
    
    private Lexema comillas2;
    
    private Lexema equals;
    
    private Lexema cuerpo;
    
    private Lexema semicolon1;
    
    private Lexema isBreak;
    
    private Lexema semicolon2;

    public Case() {
    }

    public Case(Lexema isCase, Lexema comillas1, Lexema letras, Lexema operadoresAritmeticos,
            Lexema comillas2, Lexema equals, Lexema cuerpo, Lexema semicolon1, Lexema isBreak, Lexema semicolon2) {
        this.isCase = isCase;
        this.comillas1 = comillas1;
        this.letras = letras;
        this.operadoresAritmeticos = operadoresAritmeticos;
        this.comillas2 = comillas2;
        this.equals = equals;
        this.cuerpo = cuerpo;
        this.semicolon1 = semicolon1;
        this.isBreak = isBreak;
        this.semicolon2 = semicolon2;
    }

    public Lexema getIsCase() {
        return isCase;
    }

    public void setIsCase(Lexema isCase) {
        this.isCase = isCase;
    }

    public Lexema getComillas1() {
        return comillas1;
    }

    public void setComillas1(Lexema comillas1) {
        this.comillas1 = comillas1;
    }

    public Lexema getLetras() {
        return letras;
    }

    public void setLetras(Lexema letras) {
        this.letras = letras;
    }

    public Lexema getOperadoresAritmeticos() {
        return operadoresAritmeticos;
    }

    public void setOperadoresAritmeticos(Lexema operadoresAritmeticos) {
        this.operadoresAritmeticos = operadoresAritmeticos;
    }

    public Lexema getComillas2() {
        return comillas2;
    }

    public void setComillas2(Lexema comillas2) {
        this.comillas2 = comillas2;
    }

    public Lexema getEquals() {
        return equals;
    }

    public void setEquals(Lexema equals) {
        this.equals = equals;
    }

    public Lexema getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(Lexema cuerpo) {
        this.cuerpo = cuerpo;
    }

    public Lexema getSemicolon1() {
        return semicolon1;
    }

    public void setSemicolon1(Lexema semicolon1) {
        this.semicolon1 = semicolon1;
    }

    public Lexema getIsBreak() {
        return isBreak;
    }

    public void setIsBreak(Lexema isBreak) {
        this.isBreak = isBreak;
    }

    public Lexema getSemicolon2() {
        return semicolon2;
    }

    public void setSemicolon2(Lexema semicolon2) {
        this.semicolon2 = semicolon2;
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
        return "mesaje:" + isCase.getToken() + " " + comillas1.getToken() + " " + letras.getToken()
                + " " + operadoresAritmeticos.getToken() + " " + comillas2.getToken() + " " + equals.getToken()
                + " " + cuerpo.getToken() + " " + semicolon1.getToken() + " " + isBreak.getToken() + " " + semicolon2.getToken();
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
