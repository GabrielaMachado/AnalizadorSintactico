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
public class Inicializacion extends Sentencia{
    
    private Lexema literalBooleana;

    private Lexema comillas1;
    
    private Lexema letras;
    
    private Lexema comillas2;
    
    private Lexema numero;
    
    private Lexema numeroDecimal;
    
    private Lexema funcion;

    public Inicializacion() {
    }

    public Inicializacion(Lexema literalBooleana, Lexema comillas1, Lexema letras, Lexema comillas2, Lexema numero, Lexema numeroDecimal, Lexema funcion) {
        this.literalBooleana = literalBooleana;
        this.comillas1 = comillas1;
        this.letras = letras;
        this.comillas2 = comillas2;
        this.numero = numero;
        this.numeroDecimal = numeroDecimal;
        this.funcion = funcion;
    }

    public Lexema getLiteralBooleana() {
        return literalBooleana;
    }

    public void setLiteralBooleana(Lexema literalBooleana) {
        this.literalBooleana = literalBooleana;
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

    public Lexema getComillas2() {
        return comillas2;
    }

    public void setComillas2(Lexema comillas2) {
        this.comillas2 = comillas2;
    }

    public Lexema getNumero() {
        return numero;
    }

    public void setNumero(Lexema numero) {
        this.numero = numero;
    }

    public Lexema getNumeroDecimal() {
        return numeroDecimal;
    }

    public void setNumeroDecimal(Lexema numeroDecimal) {
        this.numeroDecimal = numeroDecimal;
    }

    public Lexema getFuncion() {
        return funcion;
    }

    public void setFuncion(Lexema funcion) {
        this.funcion = funcion;
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
        return "inicializacion:" + literalBooleana.getToken() + " " + comillas1.getToken() + " " + letras.getToken()
                + " " + comillas2.getToken() + " " + numero.getToken() + " " + numeroDecimal.getToken()
                + " " + funcion.getToken();
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
