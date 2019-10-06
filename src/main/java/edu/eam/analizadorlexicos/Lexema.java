/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eam.analizadorlexicos;

/**
 *
 * @author user
 */
public class Lexema {
     private int posicion;
        private TipoLexemaEnum tipo;
        private String token;

        public Lexema(int posicion, TipoLexemaEnum tipo, String token) {
            setCont(posicion);
            setTipo(tipo);
            setToken(token);
        }

        public void setCont(int posicion) {
            this.posicion = posicion;
        }

        public void setTipo(TipoLexemaEnum tipo) {
            this.tipo = tipo;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public int getCont() {
            return posicion;
        }

        public TipoLexemaEnum getTipo() {
            return tipo;
        }

        public String getToken() {
            return token;
        }
}
