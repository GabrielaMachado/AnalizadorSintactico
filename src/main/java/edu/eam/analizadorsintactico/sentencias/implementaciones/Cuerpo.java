/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eam.analizadorsintactico.sentencias.implementaciones;

import edu.eam.analizadorsintactico.sentencias.definicion.Sentencia;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dani0
 */
public class Cuerpo extends Sentencia {

    /**
     * Modificador de acceso del metodo.
     */
    private ListaMiembros miembros;

    public Cuerpo() {
    }

    public Cuerpo(ListaMiembros miembros) {
        this.miembros = miembros;
    }

    @Override
    public List<Sentencia> llenarHijos() {
        hijos = new ArrayList<>();
        if (miembros.getSentencias() != null) {
            hijos.add(miembros);
        }
        return hijos;
    }

    public ListaMiembros getMiembros() {
        return miembros;
    }

    public void setMiembros(ListaMiembros miembros) {
        this.miembros = miembros;
    }

    @Override
    public String toString() {
       
        return "Cuerpo: ";
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
