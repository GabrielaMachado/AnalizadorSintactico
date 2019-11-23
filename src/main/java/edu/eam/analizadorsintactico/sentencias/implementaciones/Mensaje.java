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
public class Mensaje extends Sentencia {

    private Lexema mensaje;
    private ContenidoMensaje contenidoMensaje;

    public Mensaje() {
    }

    public Mensaje(Lexema mensaje, ContenidoMensaje contenidoMensaje) {
        this.mensaje = mensaje;
        this.contenidoMensaje = contenidoMensaje;
    }

    public Lexema getMensaje() {
        return mensaje;
    }

    public void setMensaje(Lexema mensaje) {
        this.mensaje = mensaje;
    }

    public ContenidoMensaje getContenidoMensaje() {
        return contenidoMensaje;
    }

    public void setContenidoMensaje(ContenidoMensaje contenidoMensaje) {
        this.contenidoMensaje = contenidoMensaje;
    }

    @Override
    public List<Sentencia> llenarHijos() {
        hijos = new ArrayList<>();
        if (mensaje != null) {
            hijos.add(new SentenciaLexema(mensaje));
        }
        if (contenidoMensaje != null) {
            hijos.add(contenidoMensaje);
        }
        for (int i = 0; i < hijos.size(); i++) {
            System.out.println("hijo " + i + "  " + hijos.get(i));
        }
        return hijos;
    }

    @Override
    public String toString() {
        return "mensaje:" + mensaje.getToken();
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
