/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eam.analizadorsintactico.gramatica.implementaciones;

import edu.eam.analizadorlexicos.Lexema;
import edu.eam.analizadorlexicos.TipoLexemaEnum;
import edu.eam.analizadorsintactico.gramatica.definiciones.Gramatica;
import edu.eam.analizadorsintactico.sentencias.definicion.Sentencia;
import edu.eam.analizadorsintactico.sentencias.implementaciones.Instancia;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class GramaticaInstancia implements Gramatica {

    @Override
    public Sentencia analizar(Sentencia padre, ArrayList<Lexema> arrayLexemas) {
//Sentencia a retornar....
        Instancia instancia = new Instancia();
        //  flujoTokens.guardarPosicion();
        int posI = posicionInicial;
        int posA = posicionInicial;
        //primer token de la gramatica.
        Lexema lexema = arrayLexemas.get(posA);

        //tipo de dato.....
        if (lexema.getTipo() == TipoLexemaEnum.IDENT) {
            instancia.setIdent1(lexema);
            posA++;
            lexema = arrayLexemas.get(posA);

            //nombre del atributo....
            if (lexema.getTipo() == TipoLexemaEnum.IDENT) {
                instancia.setIdent2(lexema);
                posA++;
                lexema = arrayLexemas.get(posA);

                if (lexema.getToken().equals("=")) {
                    instancia.setIdent1(lexema);
                    posA++;
                    lexema = arrayLexemas.get(posA);

                    if (lexema.getToken().equals("new")) {
                        instancia.setIdent1(lexema);
                        posA++;
                        lexema = arrayLexemas.get(posA);

                        if (lexema.getTipo() == TipoLexemaEnum.IDENT) {
                            instancia.setIdent3(lexema);
                            posA++;
                            lexema = arrayLexemas.get(posA);

                            if (lexema.getToken().equals("(")) {
                                instancia.setIdent1(lexema);
                                posA++;
                                lexema = arrayLexemas.get(posA);

                                if (lexema.getToken().equals(")")) {
                                    instancia.setIdent1(lexema);
                                    posA++;
                                    lexema = arrayLexemas.get(posA);
                                    
                                    if (lexema.getToken().equals(";")) {
                                        //derivar...
                                        return instancia;
                                    } else {
                                        //si no es identificador, no es atributo, se retorna el flujo a 
                                        //la posicion inicial
                                        posA = posI;
                                        return null; //se retorna null para que se pruebe con otra regal..
                                    }
                                } else {
                                    posA = posI;
                                    return null; //
                                }
                            } else {
                                posA = posI;
                                return null; //
                            }
                        } else {
                            posA = posI;
                            return null; //
                        }
                    } else {
                        posA = posI;
                        return null; //
                    }
                } else {
                    posA = posI;
                    return null; //s
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
