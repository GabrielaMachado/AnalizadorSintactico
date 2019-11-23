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
public class SentenciaMain extends Sentencia {

    private Lista<Sentencia> listaSentencia;

    private Lista<Atributo> listaAtributos;

    private Lexema main;

    private Lexema openKey;

    private IF condicion;

    private While isWhile;

    private Atributo atributo;

    private Instancia instancia;

    private LlamadoFuncion llamadoFuncion;

    private Lexema closeKey;

    public SentenciaMain() {
        listaSentencia = new Lista<>();
        listaAtributos = new Lista<>();
    }

//    public SentenciaMain(Cuerpo cuerpo, Lexema main, Lexema openKey, IF condicion, Lexema closeKey, Atributo atributo, Instancia instancia,
//            LlamadoFuncion llamadoFuncion) {
//        this.main = main;
//        this.openKey = openKey;
//        this.condicion = condicion;
//        this.closeKey = closeKey;
//        this.atributo = atributo;
//        this.instancia = instancia;
//        this.llamadoFuncion = llamadoFuncion;
//        this.cuerpo = cuerpo;
//    }
    public LlamadoFuncion getLlamadoFuncion() {
        return llamadoFuncion;
    }

    public Lista<Atributo> getListaAtributos() {
        return listaAtributos;
    }

    public void setListaAtributos(Lista<Atributo> listaAtributos) {
        this.listaAtributos = listaAtributos;
    }

    public void setLlamadoFuncion(LlamadoFuncion llamadoFuncion) {
        this.llamadoFuncion = llamadoFuncion;
    }

    public Instancia getInstancia() {
        return instancia;
    }

    public void setInstancia(Instancia instancia) {
        this.instancia = instancia;
    }

    public Lexema getMain() {
        return main;
    }

    public void setMain(Lexema main) {
        this.main = main;
    }

    public Lexema getOpenKey() {
        return openKey;
    }

    public void setOpenKey(Lexema openKey) {
        this.openKey = openKey;
    }

    public IF getCondicion() {
        return condicion;
    }

    public void setCondicion(IF condicion) {
        this.condicion = condicion;
    }

    public Lexema getCloseKey() {
        return closeKey;
    }

    public void setCloseKey(Lexema closeKey) {
        this.closeKey = closeKey;
    }

    public While getIsWhile() {
        return isWhile;
    }

    public void setIsWhile(While isWhile) {
        this.isWhile = isWhile;
    }

    public Atributo getAtributo() {
        return atributo;
    }

    public void setAtributo(Atributo atributo) {
        this.atributo = atributo;
    }

    public Lista<Sentencia> getListaSentencia() {
        return listaSentencia;
    }

    public void setListaSentencia(Lista<Sentencia> listaSentencia) {
        this.listaSentencia = listaSentencia;
    }

    @Override
    public List<Sentencia> llenarHijos() {
        hijos = new ArrayList<>();

        if (listaSentencia.getSentencias() != null) {
            hijos.add(listaSentencia);
        }

        if (listaAtributos.getSentencias() != null) {
            hijos.add(listaAtributos);
        }

        if (main != null) {
            hijos.add(new SentenciaLexema(main));
        }
        if (condicion != null) {
            hijos.add(condicion);
        }

        if (atributo != null) {
            hijos.add(atributo);
        }

        if (instancia != null) {
            hijos.add(instancia);
        }

        if (llamadoFuncion != null) {
            hijos.add(llamadoFuncion);
        }

        for (int i = 0; i < hijos.size(); i++) {
            System.out.println("hijo " + i + "  " + hijos.get(i));
        }
        return hijos;
    }

    @Override
    public String toString() {
        return "Main:" + main.getToken();
    }

    @Override
    public String parse() {
        StringBuilder str = new StringBuilder();
        str.append("public class Clase { \n");

        if (listaAtributos != null) {
            for (Atributo sentencia : listaAtributos.getSentencias()) {
                str.append(sentencia.parse());
            }
        }

        if (main != null) {
            str.append(" public static void main(String[] args)");
        }

        if (openKey != null) {
            str.append(openKey.getToken()).append("\n");
        }


        str.append("\n");

        if (closeKey != null) {
            str.append(closeKey.getToken());
        }

        return str.toString();
    }
}
