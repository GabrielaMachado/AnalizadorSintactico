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
import static edu.eam.analizadorsintactico.gramatica.definiciones.Gramatica.posicionInicial;
import edu.eam.analizadorsintactico.sentencias.definicion.Sentencia;
import edu.eam.analizadorsintactico.sentencias.implementaciones.Expresion;
import edu.eam.analizadorsintactico.sentencias.implementaciones.LiteralBooleana;
import edu.eam.analizadorsintactico.sentencias.implementaciones.Mensaje;
import edu.eam.analizadorsintactico.sentencias.implementaciones.Metodo;
import edu.eam.analizadorsintactico.sentencias.implementaciones.Return;
import edu.eam.analizadorsintactico.sentencias.implementaciones.SwitchCase;
import java.util.ArrayList;

/**
 *
 * @author dani0
 */
public class GramaticaReturn implements Gramatica {

    @Override
    public Sentencia analizar(ArrayList<Lexema> arrayLexemas) {
//Sentencia a retornar....
        Return isReturn = new Return();
        Mensaje mensaje;
        LiteralBooleana literalBooleana;
        Metodo metodo;
        Expresion expresion;
        Gramatica gramaticaMensaje = new GramaticaMensaje();
        Gramatica gramaticaLiteralBooleana = new GramaticaLiteralBooleana();
        Gramatica gramaticaMetodo = new GramaticaMetodo();
        Gramatica gramaticaExpresion = new GramaticaExpresion();
        //  flujoTokens.guardarPosicion();
        int posI = posicion;
        int posA = posicion;
        //primer token de la gramatica.
        Lexema lexema = arrayLexemas.get(posA);

        //tipo de dato.....
        if (lexema.getTipo() == TipoLexemaEnum.SD_RETURN) {
            isReturn.setIsReturn(lexema);
            posA++;
            lexema = arrayLexemas.get(posA);
            posicion = posA;
            mensaje = (Mensaje) gramaticaMensaje.analizar(arrayLexemas);

            if (mensaje != null) {
                isReturn.setMensaje(mensaje);
                posA++;
                lexema = arrayLexemas.get(posA);

                if (lexema.getTipo() == TipoLexemaEnum.DELIMITADOR) {
                    //derivar...
                    posicion = posA;
                    return isReturn;
                }
            }
            posicion = posA;
            literalBooleana = (LiteralBooleana) gramaticaLiteralBooleana.analizar(arrayLexemas);
            if (literalBooleana != null) {
                isReturn.setLiteralBooleana(literalBooleana);
                posA++;
                lexema = arrayLexemas.get(posA);

                if (lexema.getTipo() == TipoLexemaEnum.DELIMITADOR) {
                    //derivar...
                    posicion = posA;
                    return isReturn;
                }
            }
            posicion = posA;
            metodo = (Metodo) gramaticaMetodo.analizar(arrayLexemas);
            if (metodo != null) {
                isReturn.setMetodo(metodo);
                posA++;
                lexema = arrayLexemas.get(posA);

                if (lexema.getTipo() == TipoLexemaEnum.DELIMITADOR) {
                    //derivar...
                    posicion = posA;
                    return isReturn;
                }
            }
            posicion = posA;
            expresion = (Expresion) gramaticaMetodo.analizar(arrayLexemas);
            if (expresion != null) {
                isReturn.setExpresion(expresion);
                posA++;
                lexema = arrayLexemas.get(posA);

                if (lexema.getTipo() == TipoLexemaEnum.DELIMITADOR) {
                    //derivar...
                    posicion = posA;
                    return isReturn;
                }
            }

        }

        return null;
    }

}
