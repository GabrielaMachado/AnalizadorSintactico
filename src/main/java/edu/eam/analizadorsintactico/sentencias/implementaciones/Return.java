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
public class Return extends Sentencia {

    private Lexema isReturn;
    private Mensaje mensaje;
    private LiteralBooleana literalBooleana;
    private Lexema ident;
    private Lexema isNull;
    private Metodo metodo;
    private Expresion expresion;

    public Return() {
    }

    public Return(Lexema isReturn, Mensaje mensaje, LiteralBooleana literalBooleana, Lexema ident, Lexema isNull, Metodo metodo, Expresion expresion) {
        this.isReturn = isReturn;
        this.mensaje = mensaje;
        this.literalBooleana = literalBooleana;
        this.ident = ident;
        this.isNull = isNull;
        this.metodo = metodo;
        this.expresion = expresion;
    }

    public Lexema getIsReturn() {
        return isReturn;
    }

    public void setIsReturn(Lexema isReturn) {
        this.isReturn = isReturn;
    }

    public Mensaje getMensaje() {
        return mensaje;
    }

    public void setMensaje(Mensaje mensaje) {
        this.mensaje = mensaje;
    }

    public LiteralBooleana getLiteralBooleana() {
        return literalBooleana;
    }

    public void setLiteralBooleana(LiteralBooleana literalBooleana) {
        this.literalBooleana = literalBooleana;
    }

    public Lexema getIdent() {
        return ident;
    }

    public void setIdent(Lexema ident) {
        this.ident = ident;
    }

    public Lexema getIsNull() {
        return isNull;
    }

    public void setIsNull(Lexema isNull) {
        this.isNull = isNull;
    }

    public Metodo getMetodo() {
        return metodo;
    }

    public void setMetodo(Metodo metodo) {
        this.metodo = metodo;
    }

    public Expresion getExpresion() {
        return expresion;
    }

    public void setExpresion(Expresion expresion) {
        this.expresion = expresion;
    }

    @Override
    public List<Sentencia> llenarHijos() {
        hijos = new ArrayList<>();
        if (isReturn != null) {
            hijos.add(new SentenciaLexema(isReturn));
        }
        if (mensaje != null) {
            hijos.add(mensaje);
        }
        if (literalBooleana != null) {
            hijos.add(literalBooleana);
        }
        if (ident != null) {
            hijos.add(new SentenciaLexema(ident));
        }
        if (isNull != null) {
            hijos.add(new SentenciaLexema(isNull));
        }
        if (metodo != null) {
            hijos.add(metodo);
        }
        if (expresion != null) {
            hijos.add(expresion);
        }
        for (int i = 0; i < hijos.size(); i++) {
            System.out.println("hijo " + i + "  " + hijos.get(i));
        }
        return hijos;
    }

    @Override
    public String toString() {
        return "return:" + mensaje.getMensaje()+ " " + literalBooleana.getLiteralBooleana()+ " " + ident.getToken()
                + " " + isNull.getToken() + " " + metodo.getIdent();
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
