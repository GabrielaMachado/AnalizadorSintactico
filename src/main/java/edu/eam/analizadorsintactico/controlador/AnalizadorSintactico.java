/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eam.analizadorsintactico.controlador;

import edu.eam.analizadorlexicos.FlujoTokens;
import edu.eam.analizadorlexicos.Lexema;
import edu.eam.analizadorsintactico.gramatica.implementaciones.GramaticaMain;
import edu.eam.analizadorsintactico.sentencias.implementaciones.SentenciaMain;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class AnalizadorSintactico {
    public static int posicion = 0;
     public static SentenciaMain main;     
    
    public static void verificarGramaticas(ArrayList<Lexema> listaLexemas){

                
        FlujoTokens flujoTokens = new FlujoTokens(listaLexemas);
        

        GramaticaMain gramaticaMain = new GramaticaMain();
        
     main = (SentenciaMain) gramaticaMain.analizar(flujoTokens);
    }

    public static SentenciaMain getMain() {
        return main;
    }

    public void setMain(SentenciaMain main) {
        this.main = main;
    }
}
