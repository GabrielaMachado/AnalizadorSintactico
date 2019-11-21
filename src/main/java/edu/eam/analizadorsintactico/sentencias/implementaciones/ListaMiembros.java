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
 * @author user
 */
public class ListaMiembros<T extends Sentencia> extends Sentencia{

    private final List<T> listaMiembros;

    public ListaMiembros(List<T> miembros) {
        this.listaMiembros = miembros;
    }

    public ListaMiembros() {
        listaMiembros = new ArrayList<>();
    }
    
        
    public void add(T sentencia) {
        listaMiembros.add(sentencia);
    }

    public List<T> getSentencias() {
        return listaMiembros;
    }
        

    @Override
    public List<Sentencia> llenarHijos() {
        hijos = new ArrayList<>();
        listaMiembros.forEach((t) -> {
            hijos.add(t);
        });
        return hijos;
    }

    @Override
    public String toString() {
         return "Lista de "+(!hijos.isEmpty()?hijos.get(0).getClass().getSimpleName():"");
    }    

    @Override
    public String parse() {
        return "";
    }
    
}
