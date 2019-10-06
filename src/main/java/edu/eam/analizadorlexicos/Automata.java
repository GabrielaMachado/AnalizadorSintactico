/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eam.analizadorlexicos;
import static edu.eam.analizadorlexicos.AnalizadorLexico.posActual;

/**
 *
 * @author user
 */
public class Automata {
    private char[] palabra;
     private Character tokens[] = {'@', 'ñ', '~', '$', '°', '¡'};
    Lexema lex;

    public Character[] leer(String texto) {
        String res = " " + texto + " ";
        int longitud = 0;
        Character ch[];
        res = res.toLowerCase();
        longitud = res.length();
        ch = new Character[longitud];
        System.out.println(res);
        for (int i = 0; i < longitud; i++) {
            ch[i] = res.charAt(i);
        }
        return ch;
    }

    public Lexema esPalabra(Character ch[], int pos, String isTipo, TipoLexemaEnum tipo) {
        int posIn = pos;
        String lexema = "";

        if (pos > 0 && ch[pos - 1].toString().equals(" ")) {
            palabra = isTipo.toCharArray();
            lexema = "";
            for (int i = 0; i < palabra.length; i++) {
                if (ch[posIn].equals(palabra[i])) {
                    lexema += ch[posIn].toString();
                    if (lexema.equals(isTipo)) {
                        posActual = posIn;
                        if (ch[posIn + 1].toString().equals(" ")) {
                            posIn++;
                            return lex = new Lexema(pos, tipo, lexema);
                        } else {
                            return null;
                        }
                    }
                } else {
                    return null;
                }
                posIn++;
            }
        } else {
            return null;
        }
        return null;
    }


    public Lexema esUnError(Character ch[], int pos) {
        String lexema = "";
        for (int j = 0; j < tokens.length; j++) {
            if (ch[pos].toString().equals(tokens[j].toString())) {
                pos++;
                lexema = ch[pos].toString();
                return lex = new Lexema(pos - 1, TipoLexemaEnum.ERROR, lexema);
            }
        }
        return null;
    }

    public Lexema esIdentificador(Character ch[], int pos) {
        String lexema = "";
        int posIden = pos;
        // lexema = ch[pos].toString();
        if (ch[pos].toString().equals(" ")) {
            pos++;
            posActual = pos;
            return null;
        } else {
            while (!ch[pos].toString().equals(" ")) {
                System.out.println(pos);
                System.out.println("." + ch[pos] + ".");
                lexema += ch[pos].toString();
                pos++;
                posActual = pos;
            }
            return lex = new Lexema(posIden, TipoLexemaEnum.IDENT, lexema);
        }
    }
}
