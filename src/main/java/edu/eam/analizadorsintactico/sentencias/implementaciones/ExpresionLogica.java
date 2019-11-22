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
public class ExpresionLogica extends Sentencia {

    private List<Expresion> expresiones;
    private List<OpLogico> operadores;

    public ExpresionLogica() {
    }

    public ExpresionLogica(List<Expresion> expresiones, List<OpLogico> operadores) {
        this.expresiones = expresiones;
        this.operadores = operadores;
    }

    public List<Expresion> getExpresiones() {
        return expresiones;
    }

    public void setExpresiones(List<Expresion> expresiones) {
        this.expresiones = expresiones;
    }

    public List<OpLogico> getOperadores() {
        return operadores;
    }

    public void setOperadores(List<OpLogico> operadores) {
        this.operadores = operadores;
    }

    @Override
    public List<Sentencia> llenarHijos() {
        hijos = new ArrayList<>();
        for (int i = 0; i < expresiones.size(); i++) {
            hijos.add(expresiones.get(i));
        }

        for (int i = 0; i < operadores.size(); i++) {
            hijos.add(operadores.get(i));
        }
        return hijos;
    }

    @Override
    public String toString() {
        return "Expresion logica:";
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
