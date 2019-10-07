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
public class ExpresionComparacion extends Sentencia{
    
    private Lexema expresion1;
    
    private Lexema expresion2;

    private Lexema operadorRelacional;
    
    private Lexema expresion3;

    public ExpresionComparacion() {
    }

    public ExpresionComparacion(Lexema expresion1, Lexema expresion2, Lexema operadorRelacional, Lexema expresion3) {
        this.expresion1 = expresion1;
        this.expresion2 = expresion2;
        this.operadorRelacional = operadorRelacional;
        this.expresion3 = expresion3;
    }

    public Lexema getExpresion1() {
        return expresion1;
    }

    public void setExpresion1(Lexema expresion1) {
        this.expresion1 = expresion1;
    }

    public Lexema getExpresion2() {
        return expresion2;
    }

    public void setExpresion2(Lexema expresion2) {
        this.expresion2 = expresion2;
    }

    public Lexema getOperadorRelacional() {
        return operadorRelacional;
    }

    public void setOperadorRelacional(Lexema operadorRelacional) {
        this.operadorRelacional = operadorRelacional;
    }

    public Lexema getExpresion3() {
        return expresion3;
    }

    public void setExpresion3(Lexema expresion3) {
        this.expresion3 = expresion3;
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
        return "Expresion comparacion:" + expresion1.getToken() + " " + expresion2.getToken() +
                " " + operadorRelacional.getToken() + " " + expresion3.getToken();
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
