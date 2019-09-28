/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eam.analizadorsintactico.excepciones;

/**
 *Excepcion que se lanza cuando hay un error sintactico.
 * @author dani0
 */
public class SintacticException extends RuntimeException{
    
    /**
     * Token actual del analisis.
     */
    //private SimboloLexico antes;
    /**
     * Lo que se esperaba
     */
    //private TipoLexemaEnum esperado;
    

//    public SintacticException(SimboloLexico antes, TipoLexemaEnum esperado) {
//        
//        super("Error en "+antes.getFila()+"-"+antes.getColumna()+
//                ": Simbolo no esperado: "+antes.getTipo().name()+". se esperaba "+esperado
//        );
//        
//        this.antes = antes;
//        this.esperado = esperado;
//    }
//
//    public SimboloLexico getAntes() {
//        return antes;
//    }
//
//    public void setAntes(SimboloLexico antes) {
//        this.antes = antes;
//    }
//
//    public TipoLexemaEnum getEsperado() {
//        return esperado;
//    }
//
//    public void setEsperado(TipoLexemaEnum esperado) {
//        this.esperado = esperado;
//    }
     
}
