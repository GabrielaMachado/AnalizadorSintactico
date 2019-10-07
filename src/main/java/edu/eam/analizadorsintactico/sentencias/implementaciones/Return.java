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
public class Return extends Sentencia{
    
    private Lexema mensaje;

    private Lexema literalBooleana;
    
    private Lexema ident;
    
    private Lexema isNull;
    
    private Lexema funcion;
    
    private Lexema expresion;
    
    private Lexema semicolon;

    public Return() {
    }

    public Return(Lexema mensaje, Lexema literalBooleana, Lexema ident, Lexema isNull, Lexema funcion, Lexema expresion, Lexema semicolon) {
        this.mensaje = mensaje;
        this.literalBooleana = literalBooleana;
        this.ident = ident;
        this.isNull = isNull;
        this.funcion = funcion;
        this.expresion = expresion;
        this.semicolon = semicolon;
    }

    public Lexema getMensaje() {
        return mensaje;
    }

    public void setMensaje(Lexema mensaje) {
        this.mensaje = mensaje;
    }

    public Lexema getLiteralBooleana() {
        return literalBooleana;
    }

    public void setLiteralBooleana(Lexema literalBooleana) {
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

    public Lexema getFuncion() {
        return funcion;
    }

    public void setFuncion(Lexema funcion) {
        this.funcion = funcion;
    }

    public Lexema getExpresion() {
        return expresion;
    }

    public void setExpresion(Lexema expresion) {
        this.expresion = expresion;
    }

    public Lexema getSemicolon() {
        return semicolon;
    }

    public void setSemicolon(Lexema semicolon) {
        this.semicolon = semicolon;
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
        return "return:" + mensaje.getToken() + " " + literalBooleana.getToken() + " " + ident.getToken()
                + " " + isNull.getToken() + " " + funcion.getToken() + " " + expresion.getToken()
                + " " + semicolon.getToken();
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
