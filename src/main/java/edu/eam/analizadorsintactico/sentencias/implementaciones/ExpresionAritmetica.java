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
public class ExpresionAritmetica extends Sentencia {

    private Lexema numero1;

    private OpAritmetico operadorAritmetico;

    private Lexema numero2;

    public ExpresionAritmetica() {
    }

    public ExpresionAritmetica(Lexema numero1, OpAritmetico operadorAritmetico, Lexema numero2) {
        this.numero1 = numero1;
        this.operadorAritmetico = operadorAritmetico;
        this.numero2 = numero2;
    }

    public Lexema getNumero1() {
        return numero1;
    }

    public void setNumero1(Lexema numero1) {
        this.numero1 = numero1;
    }

    public OpAritmetico getOperadorAritmeticos() {
        return operadorAritmetico;
    }

    public void setOperadorAritmeticos(OpAritmetico operadorAritmetico) {
        this.operadorAritmetico = operadorAritmetico;
    }

    public Lexema getNumero2() {
        return numero2;
    }

    public void setNumero2(Lexema numero2) {
        this.numero2 = numero2;
    }

    @Override
    public List<Sentencia> llenarHijos() {
        hijos = new ArrayList<>();
        if (numero1 != null) {
            hijos.add(new SentenciaLexema(numero1));
        }
        if (numero2 != null) {
            hijos.add(new SentenciaLexema(numero2));
        }
        if (operadorAritmetico != null) {
            hijos.add(operadorAritmetico);
        }
        return hijos;
    }

    @Override
    public String toString() {
        return "Expresion aritmética:" + numero1.getToken() + " " + operadorAritmetico.getOpAritmetico() + " " + numero2.getToken();
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
