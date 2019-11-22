/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eam.analizadorsintactico.gramatica.implementaciones;

import edu.eam.analizadorlexicos.Lexema;
import edu.eam.analizadorlexicos.TipoLexemaEnum;
import static edu.eam.analizadorsintactico.controlador.AnalizadorSintactico.posicion;
import edu.eam.analizadorsintactico.excepciones.SintacticException;
import edu.eam.analizadorsintactico.gramatica.definiciones.Gramatica;
import edu.eam.analizadorsintactico.sentencias.definicion.Sentencia;
import edu.eam.analizadorsintactico.sentencias.implementaciones.Condicion;
import edu.eam.analizadorsintactico.sentencias.implementaciones.Cuerpo;
import edu.eam.analizadorsintactico.sentencias.implementaciones.IF;
import java.util.ArrayList;

public class GramaticaIF implements Gramatica {

    @Override
    public Sentencia analizar(ArrayList<Lexema> arrayLexemas) {
        IF isIf = new IF();
        Condicion condicion;
        Cuerpo cuerpo;
        Gramatica gramaticaCondicion = new GramaticaCondicion();
        Gramatica gramaticaCuerpo = new GramaticaCuerpo();

        int posI = posicion;
        int posA = posicion;
        //primer token de la gramatica.
        Lexema lexema = arrayLexemas.get(posA);

        if (lexema.getTipo() == TipoLexemaEnum.EST_CON_IF) {
            isIf.setIF(lexema);
            posA++;
            lexema = arrayLexemas.get(posA);

            if (lexema.getTipo() == TipoLexemaEnum.AGR_OPENP) {
                posA++;
                lexema = arrayLexemas.get(posA);
                posicion = posA;
                condicion = (Condicion) gramaticaCondicion.analizar(arrayLexemas);
                
                if (condicion != null) {
                    isIf.setCondicion(condicion);
                    posA++;
                    lexema = arrayLexemas.get(posA);

                    if (lexema.getTipo() == TipoLexemaEnum.AGR_CLOSEP) {
                        posA++;
                        lexema = arrayLexemas.get(posA);

                        if (lexema.getTipo() == TipoLexemaEnum.AGR_OPENKEY) {
                            posA++;
                            lexema = arrayLexemas.get(posA);
                            posicion = posA;
                            cuerpo = (Cuerpo) gramaticaCuerpo.analizar(arrayLexemas);
                            
                            if (cuerpo != null) {
                                isIf.setCuerpo(cuerpo);
                                posA++;
                                lexema = arrayLexemas.get(posA);

                                if (lexema.getTipo() == TipoLexemaEnum.AGR_CLOSEKEY) {
                                    posA++;
                                    lexema = arrayLexemas.get(posA);

                                    if (lexema.getTipo() == TipoLexemaEnum.DELIMITADOR) {
                                        posicion = posA;
                                        return isIf;
                                    } else {
                                        posA = posI;
                                        return null;
                                    }
                                }
                            }
                        }
                    }
                }
            }
//            posA++;
//            isIf.setIdent1(lexema);
//            lexema = arrayLexemas.get(posA);
//            //derivar...
//            if (lexema.getToken().equals(";")) {
//                posicion = posA;
//                //derivar...
//                return isIf;
//            } else {
//                //si no es identificador, no es atributo, se retorna el flujo a 
//                //la posicion inicial
//                posA = posI;
//                return null; //se retorna null para que se pruebe con otra regal..
//            }
        } else {
            //si no es identificador, no es atributo, se retorna el flujo a 
            //la posicion inicial
            posA = posI;
            return null; //se retorna null para que se pruebe con otra regal..
        }
        return null;
    }

}
//	@Override
//	public Sentencia analizar(Sentencia padre, FlujoTokens flujoTokens) {
//
//		flujoTokens.getTokenActual();
//		
//		if (flujoTokens.getTokenActual().getTipo() != AnalizadorLexico.isIf)
//			return  null;
//		flujoTokens.avanzar();
//		
//		if (flujoTokens.getTokenActual().getTipo() != AnalizadorLexico.parenthesisOpen){
//			throw new SintacticException(flujoTokens.getTokenActual(), AnalizadorLexico.parenthesisOpen);
//		}
//		
//		Condicion condicion = (Condicion) new GramaticaCondicion()
//				.analizar(null, flujoTokens);
//		
//		if (condicion==null)
//			throw new SintacticException(flujoTokens.getTokenActual(), TipoLexemaEnum.PARENTESIS_ABIERTO);
//
//		IF si = new IF();
//		si.setCondicion(condicion);
//		flujoTokens.avanzar();
//
//		if (flujoTokens.getTokenActual().getTipo() != TipoLexemaEnum.PARENTESIS_CERRADO){
//			throw new SintacticException(flujoTokens.getTokenActual(), TipoLexemaEnum.PARENTESIS_CERRADO);
//		}
//		
//		
//		return null;
//	}
//	
//	
//	/**
//	 * if (String){
//	 * }
//	 * 
//	 * boolean a = x<10 && y>20
//	 * 
//

