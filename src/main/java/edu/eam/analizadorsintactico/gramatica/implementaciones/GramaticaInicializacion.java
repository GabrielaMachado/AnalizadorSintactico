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
import edu.eam.analizadorsintactico.sentencias.implementaciones.Inicializacion;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class GramaticaInicializacion implements Gramatica{
    
    @Override
    public Sentencia analizar(ArrayList<Lexema> arrayLexemas) {
//Sentencia a retornar....
        Inicializacion inicializacion = new Inicializacion();
        //  flujoTokens.guardarPosicion();
        int posI = posicionInicial;
        int posA = posicionInicial;
        //primer token de la gramatica.
        Lexema lexema = arrayLexemas.get(posA);

        //tipo de dato.....
        if (lexema.getTipo() == TipoLexemaEnum.LITERAL_BOLEANA || lexema.getTipo() == TipoLexemaEnum.NUMERO
                || lexema.getTipo() == TipoLexemaEnum.NUMERO/*decimal*/ || lexema.getTipo() == TipoLexemaEnum.LITERAL_BOLEANA/*funcion*/) {
            inicializacion.setLiteralBooleana(lexema);
            posA++;
            lexema = arrayLexemas.get(posA);

            //nombre del atributo....
            if (lexema.getTipo() == TipoLexemaEnum.QUOTES) {
                inicializacion.setComillas1(lexema);
                posA++;
                lexema = arrayLexemas.get(posA);

                if (lexema.getTipo() == TipoLexemaEnum.AGR_OPENP/*letras*/) {
                    inicializacion.setLetras(lexema);
                    posA++;
                    lexema = arrayLexemas.get(posA);

                    if (lexema.getTipo() == TipoLexemaEnum.QUOTES) {
                        inicializacion.setComillas2(lexema);
                        posA++;
                        lexema = arrayLexemas.get(posA);

                                    if (lexema.getTipo() == TipoLexemaEnum.DELIMITADOR) {
                                        //derivar...
                                        return inicializacion;
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
