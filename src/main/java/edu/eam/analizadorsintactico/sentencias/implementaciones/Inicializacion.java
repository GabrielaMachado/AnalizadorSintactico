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
public class Inicializacion extends Sentencia {

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
        hijos = new ArrayList<>();
        if (literalBooleana != null) {
            hijos.add(new SentenciaLexema(literalBooleana));
        }
        if (numero != null) {
            hijos.add(new SentenciaLexema(numero));
        }
        if (letras != null) {
            hijos.add(new SentenciaLexema(letras));
        }

        return hijos;
    }

    @Override
    public String toString() {
        return "inicializacion:";
    }

    @Override
    public String parse() {
        StringBuilder str = new StringBuilder();
        if (literalBooleana != null) {
            str.append(literalBooleana.getToken());
            str.append(";");
        }

        if (numero != null) {
            str.append(numero.getToken());
            str.append(";");
        }

        if (comillas1 != null) {
            str.append(comillas1.getToken());
            if (letras != null) {
                str.append(letras.getToken());
                if (comillas2 != null) {
                    str.append(comillas2.getToken());
                    str.append(";");
                }
            }
        }

        return str.toString();
    }
}
