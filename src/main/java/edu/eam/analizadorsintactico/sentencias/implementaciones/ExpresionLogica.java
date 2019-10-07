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
public class ExpresionLogica extends Sentencia{
    
    private Lexema numero1;

    private Lexema operadoresAritmeticos;
    
    private Lexema numero2;
    
    
    public ExpresionLogica() {
    }

    public ExpresionLogica(Lexema numero1, Lexema operadoresAritmeticos, Lexema numero2) {
        this.numero1 = numero1;
        this.operadoresAritmeticos = operadoresAritmeticos;
        this.numero2 = numero2;
    }

    public Lexema getNumero1() {
        return numero1;
    }

    public void setNumero1(Lexema numero1) {
        this.numero1 = numero1;
    }

    public Lexema getOperadoresAritmeticos() {
        return operadoresAritmeticos;
    }

    public void setOperadoresAritmeticos(Lexema operadoresAritmeticos) {
        this.operadoresAritmeticos = operadoresAritmeticos;
    }

    public Lexema getNumero2() {
        return numero2;
    }

    public void setNumero2(Lexema numero2) {
        this.numero2 = numero2;
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
        return "Expresion logica:" + numero1.getToken() + " " + operadoresAritmeticos.getToken() + " " + numero2.getToken();
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
