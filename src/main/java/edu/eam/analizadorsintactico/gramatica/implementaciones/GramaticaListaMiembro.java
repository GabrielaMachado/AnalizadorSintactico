/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eam.analizadorsintactico.gramatica.implementaciones;

import edu.eam.analizadorlexicos.Lexema;
import static edu.eam.analizadorsintactico.gramatica.definiciones.Gramatica.posicionInicial;
import edu.eam.analizadorsintactico.sentencias.definicion.Sentencia;
import edu.eam.analizadorsintactico.sentencias.implementaciones.Atributo;
import edu.eam.analizadorsintactico.sentencias.implementaciones.DoWhile;
import edu.eam.analizadorsintactico.sentencias.implementaciones.FOR;
import edu.eam.analizadorsintactico.sentencias.implementaciones.IF;
import edu.eam.analizadorsintactico.sentencias.implementaciones.Instancia;
import edu.eam.analizadorsintactico.sentencias.implementaciones.ListaMiembros;
import edu.eam.analizadorsintactico.sentencias.implementaciones.Mensaje;
import edu.eam.analizadorsintactico.sentencias.implementaciones.Metodo;
import edu.eam.analizadorsintactico.sentencias.implementaciones.Miembro;
import edu.eam.analizadorsintactico.sentencias.implementaciones.SwitchCase;
import edu.eam.analizadorsintactico.sentencias.implementaciones.TryCatch;
import edu.eam.analizadorsintactico.sentencias.implementaciones.While;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class GramaticaListaMiembro {

    public Sentencia analizar(ArrayList<Lexema> arrayLexemas) {

        GramaticaIF gramaticaIf = new GramaticaIF();
        GramaticaAtributo gramaticaAtributo = new GramaticaAtributo();
        GramaticaInstancia gramaticaInstancia = new GramaticaInstancia();
        GramaticaMetodo gramaticaMetodo = new GramaticaMetodo();
        GramaticaMensaje gramaticaMensaje = new GramaticaMensaje();
        GramaticaSwitchCase gramaticaSwitchCase = new GramaticaSwitchCase();
        GramaticaWhile gramaticaWhile = new GramaticaWhile();
        GramaticaFor gramaticaFor = new GramaticaFor();
        GramaticaDoWhile gramaticaDoWhile = new GramaticaDoWhile();
        GramaticaTryCatch gramaticaTryCatch = new GramaticaTryCatch();

        IF isIf = new IF();
        Atributo atributo = new Atributo();
        Instancia instancia = new Instancia();
        Metodo metodo = new Metodo();
        Mensaje mensaje = new Mensaje();
        SwitchCase switchCase = new SwitchCase();
        While isWhile = new While();
        FOR isFor = new FOR();
        DoWhile doWhile = new DoWhile();
        TryCatch tryCatch = new TryCatch();

        ListaMiembros<Sentencia> listaMiembros = new ListaMiembros<>();
        //  flujoTokens.guardarPosicion();
        int posI = posicionInicial;
        int posA = posicionInicial;
        //primer token de la gramatica.
        Lexema lexema = arrayLexemas.get(posA);

        do {
//            if (flujoLexema.getLexema().getTipoLexema() == TipoLexemaEnum.COMILLA_DOBLE || flujoLexema.getLexema().getTipoLexema() == TipoLexemaEnum.VLR_RETORNO) {
//                break;
////            }
            isIf = (IF) gramaticaIf.analizar(arrayLexemas);
            if (isIf != null) {
                listaMiembros.add(isIf);
                return listaMiembros;
            } else {
                posA = posI;
                return null;

            }

//            declaranteVariable = (DeclaranteVariable) gramaticaDeclaranteVariable.analizar(flujoLexema);
//            if (declaranteVariable != null) {
//                listaSentencias.add(declaranteVariable);
//                if (flujoLexema.getLexema().getTipoLexema() != TipoLexemaEnum.PUNTO_Y_COMA) {
//                    throw new SintacticException(flujoLexema.getLexema(), TipoLexemaEnum.PUNTO_Y_COMA);
//                }
//                flujoLexema.avanzar();
//                flujoLexema.guardarPosicion();
//                continue;
//            } 
//            flujoLexema.backTrack();           
//            
//            si = (Si) gramaticaSi.analizar(flujoLexema);
//            if (si != null) {
//                listaSentencias.add(si);
//                flujoLexema.guardarPosicion();
//                continue;
//            }
//            flujoLexema.backTrack();
//            
//            para = (Para) gramaticaPara.analizar(flujoLexema);
//            if (para != null) {
//                listaSentencias.add(para);
//                flujoLexema.guardarPosicion();
//                continue;
//            }
//            flujoLexema.backTrack();
//
//            paraCada = (ParaCada) gramaticaParaCada.analizar(flujoLexema);
//            if (paraCada != null) {
//                listaSentencias.add(paraCada);
//                flujoLexema.guardarPosicion();
//                continue;
//            }
//            flujoLexema.backTrack();            
//            
//            hacer = (Hacer) gramaticaHacer.analizar(flujoLexema);
//            if (hacer != null) {
//                listaSentencias.add(hacer);                
//                if (flujoLexema.getLexema().getTipoLexema() != TipoLexemaEnum.PUNTO_Y_COMA) {
//                    throw new SintacticException(flujoLexema.getLexema(), TipoLexemaEnum.PUNTO_Y_COMA);
//                }
//                flujoLexema.avanzar();
//                flujoLexema.guardarPosicion();
//                continue;
//            }
//            flujoLexema.backTrack();  
//            
//            mientras = (Mientras) gramaticaMientras.analizar(flujoLexema);
//            if (mientras != null) {
//                listaSentencias.add(mientras);
//                flujoLexema.guardarPosicion();
//                continue;
//            }
//            flujoLexema.backTrack(); 
//            
//            imprimirConsola = (ImprimirConsola) gramaticaImprimirConsola.analizar(flujoLexema);
//            if (imprimirConsola != null) {
//                listaSentencias.add(imprimirConsola);                
//                if (flujoLexema.getLexema().getTipoLexema() != TipoLexemaEnum.PUNTO_Y_COMA) {
//                    throw new SintacticException(flujoLexema.getLexema(), TipoLexemaEnum.PUNTO_Y_COMA);
//                }
//                flujoLexema.avanzar();
//                flujoLexema.guardarPosicion();
//                continue;
//            }
//            flujoLexema.backTrack(); 
//            
//            entradaTeclado = (EntradaTeclado) gramaticaEntradaTeclado.analizar(flujoLexema);
//            if (entradaTeclado != null) {
//                listaSentencias.add(entradaTeclado);                
//                if (flujoLexema.getLexema().getTipoLexema() != TipoLexemaEnum.PUNTO_Y_COMA) {
//                    throw new SintacticException(flujoLexema.getLexema(), TipoLexemaEnum.PUNTO_Y_COMA);
//                }
//                flujoLexema.avanzar();
//                flujoLexema.guardarPosicion();
//                continue;
//            }
//            flujoLexema.backTrack(); 
//            
//            break;
//        } while (true);            
//        
//        
//        
//        
//        Gramatica_DeclaracionVariable gramaticaDeclaracionVariable = new Gramatica_DeclaracionVariable();
//        Gramatica_DeclaranteVariable gramaticaDeclaranteVariable = new Gramatica_DeclaranteVariable();
//        Gramatica_Para gramaticaPara = new Gramatica_Para();
//        Gramatica_Si gramaticaSi = new Gramatica_Si();
//        Gramatica_ParaCada gramaticaParaCada = new Gramatica_ParaCada();
//        Gramatica_Hacer gramaticaHacer = new Gramatica_Hacer();
//        Gramatica_Mientras gramaticaMientras = new Gramatica_Mientras();
//        Gramatica_ImprimirConsola gramaticaImprimirConsola = new Gramatica_ImprimirConsola();
//        Gramatica_EntradaTeclado gramaticaEntradaTeclado = new Gramatica_EntradaTeclado();
//        
//        ListaSentencias<Sentencia> listaSentencias = new ListaSentencias<>();
//        flujoLexema.guardarPosicion();
//        
//        DeclaracionVariable declaracionVariable;
//        DeclaranteVariable declaranteVariable;
//        Si si;
//        Para para;
//        ParaCada paraCada;
//        Hacer hacer;
//        Mientras mientras;
//        ImprimirConsola imprimirConsola;
//        EntradaTeclado entradaTeclado;
//        
//        do {            
//            if (flujoLexema.getLexema().getTipoLexema() == TipoLexemaEnum.COMILLA_DOBLE || flujoLexema.getLexema().getTipoLexema() == TipoLexemaEnum.VLR_RETORNO) {
//                break;
//            }
//                        
//            declaracionVariable = (DeclaracionVariable) gramaticaDeclaracionVariable.analizar(flujoLexema);
//            if (declaracionVariable != null) {
//                listaSentencias.add(declaracionVariable);
//                if (flujoLexema.getLexema().getTipoLexema() != TipoLexemaEnum.PUNTO_Y_COMA) {
//                    throw new SintacticException(flujoLexema.getLexema(), TipoLexemaEnum.PUNTO_Y_COMA);
//                }
//                flujoLexema.avanzar();
//                flujoLexema.guardarPosicion();
//                continue;
//            } 
//            flujoLexema.backTrack();
//            
//            declaranteVariable = (DeclaranteVariable) gramaticaDeclaranteVariable.analizar(flujoLexema);
//            if (declaranteVariable != null) {
//                listaSentencias.add(declaranteVariable);
//                if (flujoLexema.getLexema().getTipoLexema() != TipoLexemaEnum.PUNTO_Y_COMA) {
//                    throw new SintacticException(flujoLexema.getLexema(), TipoLexemaEnum.PUNTO_Y_COMA);
//                }
//                flujoLexema.avanzar();
//                flujoLexema.guardarPosicion();
//                continue;
//            } 
//            flujoLexema.backTrack();           
//            
//            si = (Si) gramaticaSi.analizar(flujoLexema);
//            if (si != null) {
//                listaSentencias.add(si);
//                flujoLexema.guardarPosicion();
//                continue;
//            }
//            flujoLexema.backTrack();
//            
//            para = (Para) gramaticaPara.analizar(flujoLexema);
//            if (para != null) {
//                listaSentencias.add(para);
//                flujoLexema.guardarPosicion();
//                continue;
//            }
//            flujoLexema.backTrack();
//
//            paraCada = (ParaCada) gramaticaParaCada.analizar(flujoLexema);
//            if (paraCada != null) {
//                listaSentencias.add(paraCada);
//                flujoLexema.guardarPosicion();
//                continue;
//            }
//            flujoLexema.backTrack();            
//            
//            hacer = (Hacer) gramaticaHacer.analizar(flujoLexema);
//            if (hacer != null) {
//                listaSentencias.add(hacer);                
//                if (flujoLexema.getLexema().getTipoLexema() != TipoLexemaEnum.PUNTO_Y_COMA) {
//                    throw new SintacticException(flujoLexema.getLexema(), TipoLexemaEnum.PUNTO_Y_COMA);
//                }
//                flujoLexema.avanzar();
//                flujoLexema.guardarPosicion();
//                continue;
//            }
//            flujoLexema.backTrack();  
//            
//            mientras = (Mientras) gramaticaMientras.analizar(flujoLexema);
//            if (mientras != null) {
//                listaSentencias.add(mientras);
//                flujoLexema.guardarPosicion();
//                continue;
//            }
//            flujoLexema.backTrack(); 
//            
//            imprimirConsola = (ImprimirConsola) gramaticaImprimirConsola.analizar(flujoLexema);
//            if (imprimirConsola != null) {
//                listaSentencias.add(imprimirConsola);                
//                if (flujoLexema.getLexema().getTipoLexema() != TipoLexemaEnum.PUNTO_Y_COMA) {
//                    throw new SintacticException(flujoLexema.getLexema(), TipoLexemaEnum.PUNTO_Y_COMA);
//                }
//                flujoLexema.avanzar();
//                flujoLexema.guardarPosicion();
//                continue;
//            }
//            flujoLexema.backTrack(); 
//            
//            entradaTeclado = (EntradaTeclado) gramaticaEntradaTeclado.analizar(flujoLexema);
//            if (entradaTeclado != null) {
//                listaSentencias.add(entradaTeclado);                
//                if (flujoLexema.getLexema().getTipoLexema() != TipoLexemaEnum.PUNTO_Y_COMA) {
//                    throw new SintacticException(flujoLexema.getLexema(), TipoLexemaEnum.PUNTO_Y_COMA);
//                }
//                flujoLexema.avanzar();
//                flujoLexema.guardarPosicion();
//                continue;
//            }
//            flujoLexema.backTrack(); 
//            
//            break;
        } while (true);

    }

}
