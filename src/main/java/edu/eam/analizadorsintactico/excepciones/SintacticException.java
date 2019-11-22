/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eam.analizadorsintactico.excepciones;

import edu.eam.analizadorlexicos.Lexema;

/**
 * Excepcion que se lanza cuando hay un error sintactico.
 *
 * @author dani0
 */
public class SintacticException extends RuntimeException {

    private Lexema antes;
    /**
     * Lo que se esperaba
     */
    private String esperado;

    public SintacticException(Lexema antes, String esperado) {

        super("Error en " + antes.getCont()
                + ": Simbolo no esperado: " + antes.getToken() + ". se esperaba " + esperado
        );

        this.antes = antes;
        this.esperado = esperado;
    }

    public Lexema getAntes() {
        return antes;
    }

    public void setAntes(Lexema antes) {
        this.antes = antes;
    }

    public String getEsperado() {
        return esperado;
    }

    public void setEsperado(String esperado) {
        this.esperado = esperado;
    }

}
