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
import edu.eam.analizadorsintactico.sentencias.implementaciones.Catch;
import edu.eam.analizadorsintactico.sentencias.implementaciones.ListaMiembros;
import edu.eam.analizadorsintactico.sentencias.implementaciones.Miembro;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class GramaticaCatch implements Gramatica {

    @Override
    public Sentencia analizar(ArrayList<Lexema> arrayLexemas) {
        //Sentencia a retornar....
        Catch isCatch = new Catch();
        //  flujoTokens.guardarPosicion();
        int posI = posicionInicial;
        int posA = posicionInicial;
        //primer token de la gramatica.
        Lexema lexema = arrayLexemas.get(posA);

        //tipo de dato.....
        if (lexema.getTipo() == TipoLexemaEnum.EXP_CATCH) {
            isCatch.setIsCatch(lexema);
            posA++;
            lexema = arrayLexemas.get(posA);

            //nombre del atributo....
            if (lexema.getTipo() == TipoLexemaEnum.AGR_OPENP) {
                isCatch.setOpenP(lexema);
                posA++;
                lexema = arrayLexemas.get(posA);

                if (lexema.getTipo() == TipoLexemaEnum.IDENT) {
                    isCatch.setIdent1(lexema);
                    posA++;
                    lexema = arrayLexemas.get(posA);

                    if (lexema.getTipo() == TipoLexemaEnum.IDENT) {
                        isCatch.setIdent2(lexema);
                        posA++;
                        lexema = arrayLexemas.get(posA);

                        if (lexema.getTipo() == TipoLexemaEnum.AGR_CLOSEP) {
                            isCatch.setCloseP(lexema);
                            posA++;
                            lexema = arrayLexemas.get(posA);

                            if (lexema.getTipo() == TipoLexemaEnum.AGR_OPENKEY) {
                                isCatch.setOpenKey(lexema);
                                posA++;
                                lexema = arrayLexemas.get(posA);


                                
//                                 ListaMiembros<Miembro> listaMiembros = (ListaMiembros<Miembro>) GramaticaListaMiembro.analizar(lexema);
//        main.setListaSentencia(listaSentencias);
//                                if (lexema.getTipo() == TipoLexemaEnum.TIPO_DATO) {
//                                    isCatch.setListaMiembros(lexema);
//                                    posA++;
//                                    lexema = arrayLexemas.get(posA);
//                                }

//                                if (lexema.getTipo() == TipoLexemaEnum.cuerpo) {
//                                    isCatch.setListaMiembros(lexema);
//                                    posA++;
//                                    lexema = arrayLexemas.get(posA);
//                                }

                                if (lexema.getTipo() == TipoLexemaEnum.AGR_CLOSEKEY) {
                                    return isCatch;

//                      
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
                    } else {
                        //si no es identificador, no es atributo, se retorna el flujo a 
                        //la posicion inicial
                        posA = posI;
                        return null; //se retorna null para que se pruebe con otra regal..
                    }
                } else {

                    posA = posI;
                    return null;
                }
            } else {
                posA = posI;
                return null;
            }
        }else {
                posA = posI;
                return null;
            }
    }
}
