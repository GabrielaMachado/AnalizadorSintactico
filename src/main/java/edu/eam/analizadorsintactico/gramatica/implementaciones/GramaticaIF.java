/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eam.analizadorsintactico.gramatica.implementaciones;

import edu.eam.analizadorlexico.AnalizadorLexico;
import edu.eam.analizadorsintactico.excepciones.SintacticException;
import edu.eam.analizadorsintactico.gramatica.definiciones.Gramatica;
import edu.eam.analizadorsintactico.sentencias.definicion.Sentencia;

public class GramaticaIF implements Gramatica {

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
}

