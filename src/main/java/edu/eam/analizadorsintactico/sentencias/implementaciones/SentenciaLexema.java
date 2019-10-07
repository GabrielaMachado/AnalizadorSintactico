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
 * @author user
 */
public class SentenciaLexema extends Sentencia{
    private Lexema simbolo;

    public SentenciaLexema() {
    }

    public SentenciaLexema(Lexema simbolo) {
        this.simbolo = simbolo;
    }

    @Override
    public List<Sentencia> llenarHijos() {
        return new ArrayList<>();
    }

    @Override
    public String toString() {

        return simbolo.getTipo() + ":" + simbolo.getToken();

    }

    public Lexema getSimbolo() {
        return simbolo;
    }

    @Override
    public String parse() {
        // TODO Auto-generated method stub
        return null;
    }

}
