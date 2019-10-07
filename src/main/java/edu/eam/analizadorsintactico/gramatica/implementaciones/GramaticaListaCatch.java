/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eam.analizadorsintactico.gramatica.implementaciones;

import edu.eam.analizadorlexicos.Lexema;
import edu.eam.analizadorsintactico.gramatica.definiciones.Gramatica;
import edu.eam.analizadorsintactico.sentencias.definicion.Sentencia;
import edu.eam.analizadorsintactico.sentencias.implementaciones.Catch;
import edu.eam.analizadorsintactico.sentencias.implementaciones.ListaCatch;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class GramaticaListaCatch implements Gramatica{

    /**
     * Metodo que analiza el flujo de tokens buscando lista de sentencias
     * separadas por algun token en especial.
     *
     * @param flujo, flujo de tokens...
     * @return la lista de sentencias o null si no esta.
     */
    @Override
    public Sentencia analizar(ArrayList<Lexema> arrayLexemas) {

//
//        GramaticaCatch gramaticaCatch = new GramaticaCatch();
//        Catch isCatch;
//
//        ListaCatch<Catch> listaParamentros = new ListaCatch<>();
//        int posI = posicionInicial;
//        int posA = posicionInicial;
//        
//        Lexema lexema = arrayLexemas.get(posA);
//
//        isCatch = (Catch) gramaticaCatch.analizar(lexema);
//        if (isCatch == null) {
//            return listaParamentros;
//        }
//        listaParamentros.add(isCatch);
//
//        do {
////            if (flujoLexema.getLexema().getTipoLexema() != TipoLexemaEnum.COMA) {
////                break;
////            }
////            flujoLexema.avanzar();
////
////            isCatch = (Parametro) gramaticaCatch.analizar(flujoLexema);
////            if (isCatch == null) {
////                throw new SintacticException(flujoLexema.getLexema(), TipoLexemaEnum.PARAMETRO);
////            }
////            listaParamentros.add(isCatch);
//        } while (true);
//
//        return listaParamentros;
//    }
        return null;
    }
}
