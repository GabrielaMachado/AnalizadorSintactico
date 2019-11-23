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
public class IF extends Sentencia {

    /**
     * Modificador de acceso del metodo.
     */
    private Lexema IF;
    private Condicion condicion;
    private Lista<Sentencia> listaSentencias;

    public IF() {
    }

    public IF(Lexema IF, Condicion condicion, Lista<Sentencia> listaSentencias) {
        this.IF = IF;
        this.condicion = condicion;
        this.listaSentencias = listaSentencias;
    }

    @Override
    public List<Sentencia> llenarHijos() {
        hijos = new ArrayList<>();

        if (IF != null) {
            hijos.add(new SentenciaLexema(IF));
        }
        if (condicion != null) {
            hijos.add(condicion);
        }
        if (listaSentencias != null) {
            hijos.add(listaSentencias);
        }
        for (int i = 0; i < hijos.size(); i++) {
            System.out.println("hijo " + i + "  " + hijos.get(i));
        }
        return hijos;

    }

    public Lexema getIF() {
        return IF;
    }

    public void setIF(Lexema IF) {
        this.IF = IF;
    }

    public Condicion getCondicion() {
        return condicion;
    }

    public void setCondicion(Condicion condicion) {
        this.condicion = condicion;
    }

    public Lista<Sentencia> getlistaSentencias() {
        return listaSentencias;
    }

    public void setlistaSentencias(Lista<Sentencia> cuerpo) {
        this.listaSentencias = cuerpo;
    }

    @Override
    public String toString() {
        return "If :" + IF.getToken();
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
