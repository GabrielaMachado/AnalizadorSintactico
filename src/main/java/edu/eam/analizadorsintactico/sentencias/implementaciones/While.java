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
public class While extends Sentencia {

    private Lexema isWhile;
    private LiteralBooleana literalBooleana;
    private ExpresionLogica expresionLogica;
    private Cuerpo cuerpo1;
    private Cuerpo cuerpo2;

    public While() {
    }

    public While(Lexema isWhile, LiteralBooleana literalBooleana, ExpresionLogica expresionLogica, Cuerpo cuerpo1, Cuerpo cuerpo2) {
        this.isWhile = isWhile;
        this.literalBooleana = literalBooleana;
        this.expresionLogica = expresionLogica;
        this.cuerpo1 = cuerpo1;
        this.cuerpo2 = cuerpo2;
    }

    public Lexema getIsWhile() {
        return isWhile;
    }

    public void setIsWhile(Lexema isWhile) {
        this.isWhile = isWhile;
    }

    public LiteralBooleana getLiteralBooleana() {
        return literalBooleana;
    }

    public void setLiteralBooleana(LiteralBooleana literalBooleana) {
        this.literalBooleana = literalBooleana;
    }

    public ExpresionLogica getExpresionLogica() {
        return expresionLogica;
    }

    public void setExpresionLogica(ExpresionLogica expresionLogica) {
        this.expresionLogica = expresionLogica;
    }

    public Cuerpo getCuerpo1() {
        return cuerpo1;
    }

    public void setCuerpo1(Cuerpo cuerpo1) {
        this.cuerpo1 = cuerpo1;
    }

    public Cuerpo getCuerpo2() {
        return cuerpo2;
    }

    public void setCuerpo2(Cuerpo cuerpo2) {
        this.cuerpo2 = cuerpo2;
    }

    @Override
    public List<Sentencia> llenarHijos() {
        hijos = new ArrayList<>();

        if (isWhile != null) {
            hijos.add(new SentenciaLexema(isWhile));
        }
        if (literalBooleana != null) {
            hijos.add(literalBooleana);
        }
        if (expresionLogica != null) {
            hijos.add(expresionLogica);
        }
        if (cuerpo1 != null) {
            hijos.add(cuerpo1);
        }
        if (cuerpo2 != null) {
            hijos.add(cuerpo2);
        }
        for (int i = 0; i < hijos.size(); i++) {
            System.out.println("hijo " + i + "  " + hijos.get(i));
        }
        return hijos;
    }

    @Override
    public String toString() {
        return "while:" + isWhile.getToken();
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
