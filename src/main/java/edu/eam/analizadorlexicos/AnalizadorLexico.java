/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eam.analizadorlexicos;

import static edu.eam.analizadorlexicos.FrmPrincipal.prueba;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class AnalizadorLexico {

    /**
     * @param args the command line arguments
     */
    // public static int posActual = 0;
    public static int posActual = 0;
    public static String miniPalabra = "";
    public static Character[] miniCadena;
    public static int posInicial = 0;
    public static ArrayList<Lexema> arrayLexema = new ArrayList<>();
    static Lexema lexema;

    private Character au = 'x';

    static String isTrue = "true";
    static String isFalse = "false";
    static String isCatch = "catch";
    static String isTry = "try";
    static String isMessage = "message";
    static String isReturn = "return";
    static String isSwitch = "switch";
    static String isWhile = "while";
    static String isBreak = "break";
    static String isCase = "case";
    static String isElse = "else";
    static String isFor = "for";
    static String isIf = "if";
    static String isDo = "do";
    static String isBoolean = "boolean";
    static String isInteger = "integer";
    static String isDouble = "double";
    static String isString = "string";
    static String isStyle = "style";
    static String isFigure = "figure";
    static String isColor = "color";
    static String isChar = "char";
    static String isCanvas = "canvas";
    static String isVoid = "void";
    static String isNull = "null";
    static String isNew = "new";
    static String isAnd = "and";
    static String isOr = "or";
    static String keyOpen = "{";
    static String keyClose = "}";
    static String parenthesisOpen = "(";
    static String parenthesisClose = ")";
    static String plus = "+";
    static String minus = "-";
    static String times = "*";
    static String divided = "/";
    static String equals = "=";
    static String isEquals = "==";
    static String lessThan = "<";
    static String greaterThan = ">";
    static String commentary = "//";
    static String semicolon = ";";

    public static void main(String[] args) {
        FrmPrincipal frm = new FrmPrincipal();
        frm.setVisible(true);

    }

    public static ArrayList<Lexema> verificarAutomatas(Character[] cadena) {
        while (cadena.length > posInicial) {
            lexema = (prueba.esPalabra(cadena, posInicial, isTrue, "literal booleana:true"));
            if (lexema != null) {
                posInicial = posActual + 1;
                arrayLexema.add(lexema);
                verificarAutomatas(cadena);
            } else {
                lexema = (prueba.esPalabra(cadena, posInicial, isFalse, "literal booleana:false"));
                if (lexema != null) {
                    posInicial = posActual + 1;
                    arrayLexema.add(lexema);
                    verificarAutomatas(cadena);
                } else {
                    lexema = (prueba.esPalabra(cadena, posInicial, isCatch, "excepciones:catch"));
                    if (lexema != null) {
                        posInicial = posActual + 1;
                        arrayLexema.add(lexema);
                        verificarAutomatas(cadena);
                    } else {
                        lexema = (prueba.esPalabra(cadena, posInicial, isTry, "excepciones:try"));
                        if (lexema != null) {
                            posInicial = posActual + 1;
                            arrayLexema.add(lexema);
                            verificarAutomatas(cadena);
                        } else {
                            lexema = (prueba.esPalabra(cadena, posInicial, isMessage, "salida dato:message"));
                            if (lexema != null) {
                                posInicial = posActual + 1;
                                arrayLexema.add(lexema);
                                verificarAutomatas(cadena);
                            } else {
                                lexema = (prueba.esPalabra(cadena, posInicial, isReturn, "salida dato:return"));
                                if (lexema != null) {
                                    posInicial = posActual + 1;
                                    arrayLexema.add(lexema);
                                    verificarAutomatas(cadena);
                                } else {
                                    lexema = (prueba.esPalabra(cadena, posInicial, isSwitch, "estructura control:switch"));
                                    if (lexema != null) {
                                        posInicial = posActual + 1;
                                        arrayLexema.add(lexema);
                                        verificarAutomatas(cadena);
                                    } else {
                                        lexema = (prueba.esPalabra(cadena, posInicial, isWhile, "estructura control:while"));
                                        if (lexema != null) {
                                            posInicial = posActual + 1;
                                            arrayLexema.add(lexema);
                                            verificarAutomatas(cadena);
                                        } else {
                                            lexema = (prueba.esPalabra(cadena, posInicial, isBreak, "estructura control:break"));
                                            if (lexema != null) {
                                                posInicial = posActual + 1;
                                                arrayLexema.add(lexema);
                                                verificarAutomatas(cadena);
                                            } else {
                                                lexema = (prueba.esPalabra(cadena, posInicial, isCase, "estructura control:case"));
                                                if (lexema != null) {
                                                    posInicial = posActual + 1;
                                                    arrayLexema.add(lexema);
                                                    verificarAutomatas(cadena);
                                                } else {
                                                    lexema = (prueba.esPalabra(cadena, posInicial, isElse, "estructura control:else"));
                                                    if (lexema != null) {
                                                        posInicial = posActual + 1;
                                                        arrayLexema.add(lexema);
                                                        verificarAutomatas(cadena);
                                                    } else {
                                                        lexema = (prueba.esPalabra(cadena, posInicial, isFor, "estructura control:for"));
                                                        if (lexema != null) {
                                                            posInicial = posActual + 1;
                                                            arrayLexema.add(lexema);
                                                            verificarAutomatas(cadena);
                                                        } else {
                                                            lexema = (prueba.esPalabra(cadena, posInicial, isIf, "estructura control:if"));
                                                            if (lexema != null) {
                                                                posInicial = posActual + 1;
                                                                arrayLexema.add(lexema);
                                                                verificarAutomatas(cadena);
                                                            } else {
                                                                lexema = (prueba.esPalabra(cadena, posInicial, isDo, "estructura control:do"));
                                                                if (lexema != null) {
                                                                    posInicial = posActual + 1;
                                                                    arrayLexema.add(lexema);
                                                                    verificarAutomatas(cadena);
                                                                } else {
                                                                    lexema = (prueba.esPalabra(cadena, posInicial, isBoolean, "tipo dato:boolean"));
                                                                    if (lexema != null) {
                                                                        posInicial = posActual + 1;
                                                                        arrayLexema.add(lexema);
                                                                        verificarAutomatas(cadena);
                                                                    } else {
                                                                        lexema = (prueba.esPalabra(cadena, posInicial, isInteger, "tipo dato:integer"));
                                                                        if (lexema != null) {
                                                                            posInicial = posActual + 1;
                                                                            arrayLexema.add(lexema);
                                                                            verificarAutomatas(cadena);
                                                                        } else {
                                                                            lexema = (prueba.esPalabra(cadena, posInicial, isDouble, "tipo dato:double"));
                                                                            if (lexema != null) {
                                                                                posInicial = posActual + 1;
                                                                                arrayLexema.add(lexema);
                                                                                verificarAutomatas(cadena);
                                                                            } else {
                                                                                lexema = (prueba.esPalabra(cadena, posInicial, isString, "tipo dato:string"));
                                                                                if (lexema != null) {
                                                                                    posInicial = posActual + 1;
                                                                                    arrayLexema.add(lexema);
                                                                                    verificarAutomatas(cadena);
                                                                                } else {
                                                                                    lexema = (prueba.esPalabra(cadena, posInicial, isStyle, "tipo dato:style"));
                                                                                    if (lexema != null) {
                                                                                        posInicial = posActual + 1;
                                                                                        arrayLexema.add(lexema);
                                                                                        verificarAutomatas(cadena);
                                                                                    } else {
                                                                                        lexema = (prueba.esPalabra(cadena, posInicial, isFigure, "tipo dato:figure"));
                                                                                        if (lexema != null) {
                                                                                            posInicial = posActual + 1;
                                                                                            arrayLexema.add(lexema);
                                                                                            verificarAutomatas(cadena);
                                                                                        } else {
                                                                                            lexema = (prueba.esPalabra(cadena, posInicial, isColor, "tipo dato:color"));
                                                                                            if (lexema != null) {
                                                                                                posInicial = posActual + 1;
                                                                                                arrayLexema.add(lexema);
                                                                                                verificarAutomatas(cadena);
                                                                                            } else {

                                                                                                lexema = (prueba.esPalabra(cadena, posInicial, isChar, "tipo dato:char"));
                                                                                                if (lexema != null) {
                                                                                                    posInicial = posActual + 1;
                                                                                                    arrayLexema.add(lexema);
                                                                                                    verificarAutomatas(cadena);
                                                                                                } else {

                                                                                                    lexema = (prueba.esPalabra(cadena, posInicial, isCanvas, "entrada dato:canvas"));
                                                                                                    if (lexema != null) {
                                                                                                        posInicial = posActual + 1;
                                                                                                        arrayLexema.add(lexema);
                                                                                                        verificarAutomatas(cadena);
                                                                                                    } else {

                                                                                                        lexema = (prueba.esPalabra(cadena, posInicial, isVoid, "entrada dato:void"));
                                                                                                        if (lexema != null) {
                                                                                                            posInicial = posActual + 1;
                                                                                                            arrayLexema.add(lexema);
                                                                                                            verificarAutomatas(cadena);
                                                                                                        } else {

                                                                                                            lexema = (prueba.esPalabra(cadena, posInicial, isNull, "entrada dato:null"));
                                                                                                            if (lexema != null) {
                                                                                                                posInicial = posActual + 1;
                                                                                                                arrayLexema.add(lexema);
                                                                                                                verificarAutomatas(cadena);
                                                                                                            } else {

                                                                                                                lexema = (prueba.esPalabra(cadena, posInicial, isNew, "entrada dato:new"));
                                                                                                                if (lexema != null) {
                                                                                                                    posInicial = posActual + 1;
                                                                                                                    arrayLexema.add(lexema);
                                                                                                                    verificarAutomatas(cadena);
                                                                                                                } else {

                                                                                                                    lexema = (prueba.esPalabra(cadena, posInicial, isAnd, "operador logico:and"));
                                                                                                                    if (lexema != null) {
                                                                                                                        posInicial = posActual + 1;
                                                                                                                        arrayLexema.add(lexema);
                                                                                                                        verificarAutomatas(cadena);
                                                                                                                    } else {

                                                                                                                        lexema = (prueba.esPalabra(cadena, posInicial, isOr, "operador logico:or"));
                                                                                                                        if (lexema != null) {
                                                                                                                            posInicial = posActual + 1;
                                                                                                                            arrayLexema.add(lexema);
                                                                                                                            verificarAutomatas(cadena);
                                                                                                                        } else {

                                                                                                                            lexema = (prueba.esPalabra(cadena, posInicial, keyOpen, "agrupador:openkey"));
                                                                                                                            if (lexema != null) {
                                                                                                                                posInicial = posActual + 1;
                                                                                                                                arrayLexema.add(lexema);
                                                                                                                                verificarAutomatas(cadena);
                                                                                                                            } else {

                                                                                                                                lexema = (prueba.esPalabra(cadena, posInicial, keyClose, "agrupador:closekey"));
                                                                                                                                if (lexema != null) {
                                                                                                                                    posInicial = posActual + 1;
                                                                                                                                    arrayLexema.add(lexema);
                                                                                                                                    verificarAutomatas(cadena);
                                                                                                                                } else {

                                                                                                                                    lexema = (prueba.esPalabra(cadena, posInicial, parenthesisOpen, "agrupador:openparenthesis"));
                                                                                                                                    if (lexema != null) {
                                                                                                                                        posInicial = posActual + 1;
                                                                                                                                        arrayLexema.add(lexema);
                                                                                                                                        verificarAutomatas(cadena);
                                                                                                                                    } else {

                                                                                                                                        lexema = (prueba.esPalabra(cadena, posInicial, parenthesisClose, "agrupador:closeparenthesis"));
                                                                                                                                        if (lexema != null) {
                                                                                                                                            posInicial = posActual + 1;
                                                                                                                                            arrayLexema.add(lexema);
                                                                                                                                            verificarAutomatas(cadena);
                                                                                                                                        } else {

                                                                                                                                            lexema = (prueba.esPalabra(cadena, posInicial, plus, "aritmeticos:plus"));
                                                                                                                                            if (lexema != null) {
                                                                                                                                                posInicial = posActual + 1;
                                                                                                                                                arrayLexema.add(lexema);
                                                                                                                                                verificarAutomatas(cadena);
                                                                                                                                            } else {

                                                                                                                                                lexema = (prueba.esPalabra(cadena, posInicial, minus, "aritmeticos:minus"));
                                                                                                                                                if (lexema != null) {
                                                                                                                                                    posInicial = posActual + 1;
                                                                                                                                                    arrayLexema.add(lexema);
                                                                                                                                                    verificarAutomatas(cadena);
                                                                                                                                                } else {

                                                                                                                                                    lexema = (prueba.esPalabra(cadena, posInicial, times, "aritmeticos:times"));
                                                                                                                                                    if (lexema != null) {
                                                                                                                                                        posInicial = posActual + 1;
                                                                                                                                                        arrayLexema.add(lexema);
                                                                                                                                                        verificarAutomatas(cadena);
                                                                                                                                                    } else {

                                                                                                                                                        lexema = (prueba.esPalabra(cadena, posInicial, commentary, "comentario:commentary"));
                                                                                                                                                        if (lexema != null) {
                                                                                                                                                            posInicial = posActual + 1;
                                                                                                                                                            arrayLexema.add(lexema);
                                                                                                                                                            verificarAutomatas(cadena);
                                                                                                                                                        } else {

                                                                                                                                                            lexema = (prueba.esPalabra(cadena, posInicial, divided, "aritmeticos:divided"));
                                                                                                                                                            if (lexema != null) {
                                                                                                                                                                posInicial = posActual + 1;
                                                                                                                                                                arrayLexema.add(lexema);
                                                                                                                                                                verificarAutomatas(cadena);
                                                                                                                                                            } else {

                                                                                                                                                                lexema = (prueba.esPalabra(cadena, posInicial, lessThan, "operador logico:lessthan"));
                                                                                                                                                                if (lexema != null) {
                                                                                                                                                                    posInicial = posActual + 1;
                                                                                                                                                                    arrayLexema.add(lexema);
                                                                                                                                                                    verificarAutomatas(cadena);
                                                                                                                                                                } else {

                                                                                                                                                                    lexema = (prueba.esPalabra(cadena, posInicial, greaterThan, "operador logico:greaterthan"));
                                                                                                                                                                    if (lexema != null) {
                                                                                                                                                                        posInicial = posActual + 1;
                                                                                                                                                                        arrayLexema.add(lexema);
                                                                                                                                                                        verificarAutomatas(cadena);
                                                                                                                                                                    } else {

                                                                                                                                                                        lexema = (prueba.esPalabra(cadena, posInicial, semicolon, "delimitador:semicolon"));
                                                                                                                                                                        if (lexema != null) {
                                                                                                                                                                            posInicial = posActual + 1;
                                                                                                                                                                            arrayLexema.add(lexema);
                                                                                                                                                                            verificarAutomatas(cadena);
                                                                                                                                                                        } else {

                                                                                                                                                                            lexema = (prueba.esPalabra(cadena, posInicial, isEquals, "operador logico:isequals"));
                                                                                                                                                                            if (lexema != null) {
                                                                                                                                                                                posInicial = posActual + 1;
                                                                                                                                                                                arrayLexema.add(lexema);
                                                                                                                                                                                verificarAutomatas(cadena);
                                                                                                                                                                            } else {

                                                                                                                                                                                lexema = (prueba.esPalabra(cadena, posInicial, equals, "asignacion:equals"));
                                                                                                                                                                                if (lexema != null) {
                                                                                                                                                                                    posInicial = posActual + 1;
                                                                                                                                                                                    arrayLexema.add(lexema);
                                                                                                                                                                                    verificarAutomatas(cadena);
                                                                                                                                                                                } else {
                                                                                                                                                                                    lexema = prueba.esUnError(cadena, posInicial);
                                                                                                                                                                                    if (lexema != null) {
                                                                                                                                                                                        posInicial = posActual + 1;
                                                                                                                                                                                        arrayLexema.add(lexema);
                                                                                                                                                                                        verificarAutomatas(cadena);
                                                                                                                                                                                    } else {
                                                                                                                                                                                        lexema = prueba.esIdentificador(cadena, posInicial);
                                                                                                                                                                                        if (lexema != null) {
                                                                                                                                                                                            posInicial = posActual;
                                                                                                                                                                                            arrayLexema.add(lexema);
                                                                                                                                                                                            verificarAutomatas(cadena);
                                                                                                                                                                                        } else {
                                                                                                                                                                                            System.out.println("ERROR");
                                                                                                                                                                                            posInicial = posActual;
                                                                                                                                                                                            verificarAutomatas(cadena);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return arrayLexema;
    }
}
