/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eam.analizadorsintactico.sentencias.implementaciones;

import edu.eam.analizadorsintactico.sentencias.definicion.Sentencia;
import java.util.List;

/**
 *
 * @author user
 */
public class ListaCatch <T extends Sentencia> extends Sentencia{

//    private String separador;
//
//    /**
//     * Sentencias de la lista.
//     */
//    private final List<T> sentencias;
//
//    /**
//     * Constructor
//     *
//     * @param sentencias
//     */
//    public Lista(List<T> sentencias) {
//        this.sentencias = sentencias;
//    }
//
//    /**
//     * COnstructor
//     */
//    public Lista() {
//        sentencias = new ArrayList<>();
//    }
//
//    @Override
//    public List<Sentencia> llenarHijos() {
//        hijos=new ArrayList<>();
//        for (T t : sentencias) {
//           hijos.add(t);
//        }
//        
//        return hijos;
//    }
//
//    @Override
//    public String toString() {
//        
//        return "Lista de "+(!hijos.isEmpty()?hijos.get(0).getClass().getSimpleName():"");
//        
//    }
//    
//
//    /**
//     * Metodo para agregar una sentencia.
//     *
//     * @param sentencia
//     */
//    public void add(T sentencia) {
//        sentencias.add(sentencia);
//    }
//
//    public List<T> getSentencias() {
//        return sentencias;
//    }
//
//	@Override
//	public String parse() {
//		StringBuilder str = new StringBuilder();
//		
//		for (Sentencia sentencia : sentencias) {
//			str.append(sentencia.parse());
//		}
//		
//		return str.toString();
//	}


    
    @Override
    public List<Sentencia> llenarHijos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
