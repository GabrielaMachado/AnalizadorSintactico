/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eam.analizadorsintactico.gramatica.implementaciones;

import edu.eam.analizadorlexicos.Lexema;
import edu.eam.analizadorlexicos.TipoLexemaEnum;
import static edu.eam.analizadorsintactico.controlador.AnalizadorSintactico.posicion;
import edu.eam.analizadorsintactico.gramatica.definiciones.Gramatica;
import edu.eam.analizadorsintactico.sentencias.definicion.Sentencia;
import edu.eam.analizadorsintactico.sentencias.implementaciones.Atributo;
import edu.eam.analizadorsintactico.sentencias.implementaciones.Parametro;
import edu.eam.analizadorsintactico.sentencias.implementaciones.TipoDato;
import java.util.ArrayList;

/**
 *
 * @author dani0
 */
public class GramaticaParametro implements Gramatica {

    @Override
    public Sentencia analizar(ArrayList<Lexema> arrayLexemas) {
//Sentencia a retornar....
        Parametro parametro = new Parametro();

        TipoDato tipoDato;
        Gramatica gramaticaTipoDato = new GramaticaTipoDato();

        //  flujoTokens.guardarPosicion();
        int posI = posicion;
        int posA = posicion;
        //primer token de la gramatica.
        Lexema lexema = arrayLexemas.get(posA);

        tipoDato = (TipoDato) gramaticaTipoDato.analizar(arrayLexemas);
        //tipo de dato.....
        if (tipoDato != null) {
            parametro.setTipoDato(tipoDato);
            posA++;
            lexema = arrayLexemas.get(posA);

            //nombre del atributo....
            if (lexema.getTipo() == TipoLexemaEnum.IDENT) {
                parametro.setIdent(lexema);
                posA++;
                lexema = arrayLexemas.get(posA);

                if (lexema.getTipo() == TipoLexemaEnum.DELIMITADOR) {
                    //derivar...
                    posicion = posA;
                    return parametro;
                } else {

                    //si no es identificador, no es atributo, se retorna el flujo a 
                    //la posicion inicial
                    posA = posI;

                    return null; //se retorna null para que se pruebe con otra regal..
                }
            } else {
                //si no es identificador, no es atributo, se retorna el flujo a 
                //la posicion inicial
                posA = posI;
                return null; //se retorna null para que se pruebe con otra regal..
            }

        }
        return null;
    }

}
