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
public class Mensaje extends Sentencia{
    
    private Lexema mensaje;

    private Lexema equals;
    
    private Lexema openP;
    
    private Lexema comillas;
    
    private Lexema contenidoMensaje;
    
    private Lexema operadoresAritmeticos;
    
    private Lexema closeP;
    
    private Lexema semicolon;

    /**
     * Tipo de retorno.
     */
    private Lexema ident3;

    public Mensaje() {
    }

    public Mensaje(Lexema ident1, Lexema ident2, Lexema ident3) {
        this.ident1 = ident1;
        this.ident2 = ident2;
        this.ident3 = ident3;
    }

    public Lexema getIdent1() {
        return ident1;
    }

    public void setIdent1(Lexema ident1) {
        this.ident1 = ident1;
    }

    public Lexema getIdent2() {
        return ident2;
    }

    public void setIdent2(Lexema ident2) {
        this.ident2 = ident2;
    }

    public Lexema getIdent3() {
        return ident3;
    }

    public void setIdent3(Lexema ident3) {
        this.ident3 = ident3;
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
        return "Instancia:" + ident1.getToken() + " " + ident2.getToken() + " " + ident3.getToken();
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
