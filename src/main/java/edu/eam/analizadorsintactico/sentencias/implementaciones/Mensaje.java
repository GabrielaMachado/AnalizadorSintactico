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

    public Mensaje() {
    }

    public Mensaje(Lexema mensaje, Lexema equals, Lexema openP, Lexema comillas, Lexema contenidoMensaje,
            Lexema operadoresAritmeticos, Lexema closeP, Lexema semicolon) {
        this.mensaje = mensaje;
        this.equals = equals;
        this.openP = openP;
        this.comillas = comillas;
        this.contenidoMensaje = contenidoMensaje;
        this.operadoresAritmeticos = operadoresAritmeticos;
        this.closeP = closeP;
        this.semicolon = semicolon;
    }

    public Lexema getMensaje() {
        return mensaje;
    }

    public void setMensaje(Lexema mensaje) {
        this.mensaje = mensaje;
    }

    public Lexema getEquals() {
        return equals;
    }

    public void setEquals(Lexema equals) {
        this.equals = equals;
    }

    public Lexema getOpenP() {
        return openP;
    }

    public void setOpenP(Lexema openP) {
        this.openP = openP;
    }

    public Lexema getComillas() {
        return comillas;
    }

    public void setComillas(Lexema comillas) {
        this.comillas = comillas;
    }

    public Lexema getContenidoMensaje() {
        return contenidoMensaje;
    }

    public void setContenidoMensaje(Lexema contenidoMensaje) {
        this.contenidoMensaje = contenidoMensaje;
    }

    public Lexema getOperadoresAritmeticos() {
        return operadoresAritmeticos;
    }

    public void setOperadoresAritmeticos(Lexema operadoresAritmeticos) {
        this.operadoresAritmeticos = operadoresAritmeticos;
    }

    public Lexema getCloseP() {
        return closeP;
    }

    public void setCloseP(Lexema closeP) {
        this.closeP = closeP;
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
        return "mesaje:" + mensaje.getToken() + " " + equals.getToken() + " " + openP.getToken()
                + " " + comillas.getToken() + " " + contenidoMensaje.getToken() + " " + operadoresAritmeticos.getToken()
                + " " + closeP.getToken() + " " + semicolon.getToken();
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
