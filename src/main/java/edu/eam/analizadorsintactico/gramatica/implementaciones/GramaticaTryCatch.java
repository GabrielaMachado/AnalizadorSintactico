/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eam.analizadorsintactico.gramatica.implementaciones;

import edu.eam.analizadorlexicos.Lexema;
import edu.eam.analizadorlexicos.TipoLexemaEnum;
import edu.eam.analizadorsintactico.gramatica.definiciones.Gramatica;
import static edu.eam.analizadorsintactico.gramatica.definiciones.Gramatica.posicionInicial;
import edu.eam.analizadorsintactico.sentencias.definicion.Sentencia;
import edu.eam.analizadorsintactico.sentencias.implementaciones.Catch;
import edu.eam.analizadorsintactico.sentencias.implementaciones.ListaCatch;
import edu.eam.analizadorsintactico.sentencias.implementaciones.TryCatch;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class GramaticaTryCatch implements Gramatica{
    
    @Override
    public Sentencia analizar(ArrayList<Lexema> arrayLexemas) {
//Sentencia a retornar....
        TryCatch tryCatch = new TryCatch();
        //  flujoTokens.guardarPosicion();
        int posI = posicionInicial;
        int posA = posicionInicial;
        //primer token de la gramatica.
        Lexema lexema = arrayLexemas.get(posA);

        //tipo de dato.....
        if (lexema.getTipo() == TipoLexemaEnum.EXP_TRY) {
            tryCatch.setIsTry(lexema);
            posA++;
            lexema = arrayLexemas.get(posA);

            //nombre del atributo....
            if (lexema.getTipo() == TipoLexemaEnum.AGR_OPENKEY) {
                tryCatch.setOpenKey(lexema);
                posA++;
                lexema = arrayLexemas.get(posA);

                if (lexema.getTipo() == TipoLexemaEnum.LITERAL_BOLEANA/*cuerpo1*/) {
                    tryCatch.setCuerpo1(lexema);
                    posA++;
                    lexema = arrayLexemas.get(posA);

                    if (lexema.getTipo() == TipoLexemaEnum.AGR_CLOSEKEY) {
                        tryCatch.setCloseKey(lexema);
                        posA++;
                        lexema = arrayLexemas.get(posA);

                        ListaCatch<Catch> catchs = new ListaCatch<>();
                        GramaticaCatch gramaCatch = new GramaticaCatch();
                        GramaticaListaCatch<Catch> gramaCatchs = new GramaticaListaCatch();
                        catchs = gramaCatchs.analizar(gramaCatch,tryCatch,flujoTokens, TipoLexemaEnum.COMA);
                        tryCatch.setListaCatch(catchs);
                        lexema=arrayLexemas.get(posA);
                        if (lexema.getTipo() == TipoLexemaEnum.EXP_CATCH) {
                            tryCatch.setIsCatch(lexema);
                            posA++;
                            lexema = arrayLexemas.get(posA);

                            if (lexema.getTipo() == TipoLexemaEnum.AGR_OPENP) {
                                tryCatch.setOpenP(lexema);
                                posA++;
                                lexema = arrayLexemas.get(posA);

                                if (lexema.getTipo() == TipoLexemaEnum.IDENT) {
                                    tryCatch.setIdent1(lexema);
                                    posA++;
                                    lexema = arrayLexemas.get(posA);
                                    if (lexema.getTipo() == TipoLexemaEnum.IDENT) {
                                        tryCatch.setIdent2(lexema);
                                        posA++;
                                        lexema = arrayLexemas.get(posA);
                                        if (lexema.getTipo() == TipoLexemaEnum.AGR_CLOSEP) {
                                            tryCatch.setCloseP(lexema);
                                            posA++;
                                            lexema = arrayLexemas.get(posA);
                                            if (lexema.getTipo() == TipoLexemaEnum.AGR_OPENKEY) {
                                                tryCatch.setOpenKey2(lexema);
                                                posA++;
                                                lexema = arrayLexemas.get(posA);
                                                if (lexema.getTipo() == TipoLexemaEnum.OP_LOG_OR/*cuerpo2*/) {
                                                    tryCatch.setOpenKey2(lexema);
                                                    posA++;
                                                    lexema = arrayLexemas.get(posA);
                                                    if (lexema.getTipo() == TipoLexemaEnum.AGR_CLOSEKEY) {
                                                        //derivar...
                                                        return tryCatch;
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
