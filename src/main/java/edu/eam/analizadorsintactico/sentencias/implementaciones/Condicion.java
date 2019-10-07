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
 * @author user
 */
public class Condicion extends Sentencia {

    /**
     * Modificador de acceso del metodo.
     */
    private Lexema ident1;
    /**
     * Nombre del metodo
     */
    private Lexema operadoresRelacionales;

    /**
     * Tipo de retorno.
     */
    private Lexema ident2;

    /**
     * Tipo de retorno.
     */
    private Lexema numero;

    public Condicion() {
    }

    public Condicion(Lexema ident1, Lexema operadoresRelacionales, Lexema ident2, Lexema numero) {
        this.ident1 = ident1;
        this.operadoresRelacionales = operadoresRelacionales;
        this.ident2 = ident2;
        this.numero = numero;
    }

    public Lexema getIdent1() {
        return ident1;
    }

    public void setIdent1(Lexema ident1) {
        this.ident1 = ident1;
    }

    public Lexema getOperadoresRelacionales() {
        return operadoresRelacionales;
    }

    public void setOperadoresRelacionales(Lexema operadoresRelacionales) {
        this.operadoresRelacionales = operadoresRelacionales;
    }

    public Lexema getIdent2() {
        return ident2;
    }

    public void setIdent2(Lexema ident2) {
        this.ident2 = ident2;
    }

    public Lexema getNumero() {
        return numero;
    }

    public void setNumero(Lexema numero) {
        this.numero = numero;
    }

    @Override
    public List<Sentencia> llenarHijos() {
        hijos = new ArrayList<>();
        hijos.add(new SentenciaLexema(ident1));
        hijos.add(new SentenciaLexema(ident2));
//        if (inicializacion != null) {
//            hijos.add(new SentenciaToken(inicializacion));
//        }
        return hijos;
    }

    @Override
    public String toString() {
        return "Condicion: " + ident1.getToken();
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
