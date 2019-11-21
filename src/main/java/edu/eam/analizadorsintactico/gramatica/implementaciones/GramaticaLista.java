/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eam.analizadorsintactico.gramatica.implementaciones;

import edu.eam.analizadorlexicos.Lexema;
import static edu.eam.analizadorsintactico.controlador.AnalizadorSintactico.posicion;
import edu.eam.analizadorsintactico.gramatica.definiciones.Gramatica;
import edu.eam.analizadorsintactico.sentencias.definicion.Sentencia;
import edu.eam.analizadorsintactico.sentencias.implementaciones.Lista;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class GramaticaLista<T extends Sentencia> {

    public Lista<T> analizar(Gramatica gramma, ArrayList<Lexema> arrayLexemas) {

        int posI = posicion;
        int posA = posicion;
        Lexema lexema = arrayLexemas.get(posA);
        List<T> sentencias = new ArrayList<>();
        T parametro = null;
        boolean go = true;
        do {
            //primer token de la gramatica.
            
            parametro = (T) gramma.analizar(arrayLexemas);
            if (parametro != null) {
                sentencias.add(parametro);
                posicion++;
                posA = posicion;
                lexema = arrayLexemas.get(posA);
                if (!";".equals(lexema.getToken())) {
                    break;
                }
            } else {
                go = false;
            }

        } while (go);

        return new Lista<T>(sentencias);
    }

}
