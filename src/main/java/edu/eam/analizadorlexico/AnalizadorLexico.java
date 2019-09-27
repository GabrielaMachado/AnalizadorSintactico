/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eam.analizadorlexico;

import static edu.eam.analizadorlexico.FrmPrincipal.prueba;
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
    static String lessThan = "<";
    static String greaterThan = ">";
    static String commentary = "//";
    static String semicolon = ";";
    //  static String semicolon = "==";

    public static void main(String[] args) {
        FrmPrincipal frm = new FrmPrincipal();
        frm.setVisible(true);

    }

    public static void verificarAutomatas(Character[] cadena) {
        while (cadena.length > posInicial) {
            lexema = (prueba.esPalabra(cadena, posInicial, isTrue, "Literal booleana"));
            if (lexema != null) {
                posInicial = posActual + 1;
                arrayLexema.add(lexema);
                verificarAutomatas(cadena);
            } else {
                lexema = (prueba.esPalabra(cadena, posInicial, isFalse, "Literal booleana"));
                if (lexema != null) {
                    posInicial = posActual + 1;
                    arrayLexema.add(lexema);
                    verificarAutomatas(cadena);
                } else {
                    lexema = (prueba.esPalabra(cadena, posInicial, isCatch, "Literal booleana"));
                    if (lexema != null) {
                        posInicial = posActual + 1;
                        arrayLexema.add(lexema);
                        verificarAutomatas(cadena);
                    } else {
                        lexema = (prueba.esPalabra(cadena, posInicial, isTry, "Literal booleana"));
                        if (lexema != null) {
                            posInicial = posActual + 1;
                            arrayLexema.add(lexema);
                            verificarAutomatas(cadena);
                        } else {
                            lexema = (prueba.esPalabra(cadena, posInicial, isMessage, "Literal booleana"));
                            if (lexema != null) {
                                posInicial = posActual + 1;
                                arrayLexema.add(lexema);
                                verificarAutomatas(cadena);
                            } else {
                                lexema = (prueba.esPalabra(cadena, posInicial, isReturn, "Literal booleana"));
                                if (lexema != null) {
                                    posInicial = posActual + 1;
                                    arrayLexema.add(lexema);
                                    verificarAutomatas(cadena);
                                } else {
                                    lexema = (prueba.esPalabra(cadena, posInicial, isSwitch, "Literal booleana"));
                                    if (lexema != null) {
                                        posInicial = posActual + 1;
                                        arrayLexema.add(lexema);
                                        verificarAutomatas(cadena);
                                    } else {
                                        lexema = (prueba.esPalabra(cadena, posInicial, isWhile, "Literal booleana"));
                                        if (lexema != null) {
                                            posInicial = posActual + 1;
                                            arrayLexema.add(lexema);
                                            verificarAutomatas(cadena);
                                        } else {
                                            lexema = (prueba.esPalabra(cadena, posInicial, isBreak, "Literal booleana"));
                                            if (lexema != null) {
                                                posInicial = posActual + 1;
                                                arrayLexema.add(lexema);
                                                verificarAutomatas(cadena);
                                            } else {
                                                lexema = (prueba.esPalabra(cadena, posInicial, isCase, "Literal booleana"));
                                                if (lexema != null) {
                                                    posInicial = posActual + 1;
                                                    arrayLexema.add(lexema);
                                                    verificarAutomatas(cadena);
                                                } else {
                                                    lexema = (prueba.esPalabra(cadena, posInicial, isElse, "Literal booleana"));
                                                    if (lexema != null) {
                                                        posInicial = posActual + 1;
                                                        arrayLexema.add(lexema);
                                                        verificarAutomatas(cadena);
                                                    } else {
                                                        lexema = (prueba.esPalabra(cadena, posInicial, isFor, "Literal booleana"));
                                                        if (lexema != null) {
                                                            posInicial = posActual + 1;
                                                            arrayLexema.add(lexema);
                                                            verificarAutomatas(cadena);
                                                        } else {
                                                            lexema = (prueba.esPalabra(cadena, posInicial, isIf, "Literal booleana"));
                                                            if (lexema != null) {
                                                                posInicial = posActual + 1;
                                                                arrayLexema.add(lexema);
                                                                verificarAutomatas(cadena);
                                                            } else {
                                                                lexema = (prueba.esPalabra(cadena, posInicial, isDo, "Literal booleana"));
                                                                if (lexema != null) {
                                                                    posInicial = posActual + 1;
                                                                    arrayLexema.add(lexema);
                                                                    verificarAutomatas(cadena);
                                                                } else {
                                                                    lexema = (prueba.esPalabra(cadena, posInicial, isBoolean, "Literal booleana"));
                                                                    if (lexema != null) {
                                                                        posInicial = posActual + 1;
                                                                        arrayLexema.add(lexema);
                                                                        verificarAutomatas(cadena);
                                                                    } else {
                                                                        lexema = (prueba.esPalabra(cadena, posInicial, isInteger, "Literal booleana"));
                                                                        if (lexema != null) {
                                                                            posInicial = posActual + 1;
                                                                            arrayLexema.add(lexema);
                                                                            verificarAutomatas(cadena);
                                                                        } else {
                                                                            lexema = (prueba.esPalabra(cadena, posInicial, isDouble, "Literal booleana"));
                                                                            if (lexema != null) {
                                                                                posInicial = posActual + 1;
                                                                                arrayLexema.add(lexema);
                                                                                verificarAutomatas(cadena);
                                                                            } else {
                                                                                lexema = (prueba.esPalabra(cadena, posInicial, isString, "Literal booleana"));
                                                                                if (lexema != null) {
                                                                                    posInicial = posActual + 1;
                                                                                    arrayLexema.add(lexema);
                                                                                    verificarAutomatas(cadena);
                                                                                } else {
                                                                                    lexema = (prueba.esPalabra(cadena, posInicial, isStyle, "Literal booleana"));
                                                                                    if (lexema != null) {
                                                                                        posInicial = posActual + 1;
                                                                                        arrayLexema.add(lexema);
                                                                                        verificarAutomatas(cadena);
                                                                                    } else {
                                                                                        lexema = (prueba.esPalabra(cadena, posInicial, isFigure, "Literal booleana"));
                                                                                        if (lexema != null) {
                                                                                            posInicial = posActual + 1;
                                                                                            arrayLexema.add(lexema);
                                                                                            verificarAutomatas(cadena);
                                                                                        } else {
                                                                                            lexema = (prueba.esPalabra(cadena, posInicial, isColor, "Literal booleana"));
                                                                                            if (lexema != null) {
                                                                                                posInicial = posActual + 1;
                                                                                                arrayLexema.add(lexema);
                                                                                                verificarAutomatas(cadena);
                                                                                            } else {

                                                                                                lexema = (prueba.esPalabra(cadena, posInicial, isChar, "Literal booleana"));
                                                                                                if (lexema != null) {
                                                                                                    posInicial = posActual + 1;
                                                                                                    arrayLexema.add(lexema);
                                                                                                    verificarAutomatas(cadena);
                                                                                                } else {

                                                                                                    lexema = (prueba.esPalabra(cadena, posInicial, isCanvas, "Literal booleana"));
                                                                                                    if (lexema != null) {
                                                                                                        posInicial = posActual + 1;
                                                                                                        arrayLexema.add(lexema);
                                                                                                        verificarAutomatas(cadena);
                                                                                                    } else {

                                                                                                        lexema = (prueba.esPalabra(cadena, posInicial, isVoid, "Literal booleana"));
                                                                                                        if (lexema != null) {
                                                                                                            posInicial = posActual + 1;
                                                                                                            arrayLexema.add(lexema);
                                                                                                            verificarAutomatas(cadena);
                                                                                                        } else {

                                                                                                            lexema = (prueba.esPalabra(cadena, posInicial, isNull, "Literal booleana"));
                                                                                                            if (lexema != null) {
                                                                                                                posInicial = posActual + 1;
                                                                                                                arrayLexema.add(lexema);
                                                                                                                verificarAutomatas(cadena);
                                                                                                            } else {

                                                                                                                lexema = (prueba.esPalabra(cadena, posInicial, isNew, "Literal booleana"));
                                                                                                                if (lexema != null) {
                                                                                                                    posInicial = posActual + 1;
                                                                                                                    arrayLexema.add(lexema);
                                                                                                                    verificarAutomatas(cadena);
                                                                                                                } else {

                                                                                                                    lexema = (prueba.esPalabra(cadena, posInicial, isAnd, "Literal booleana"));
                                                                                                                    if (lexema != null) {
                                                                                                                        posInicial = posActual + 1;
                                                                                                                        arrayLexema.add(lexema);
                                                                                                                        verificarAutomatas(cadena);
                                                                                                                    } else {

                                                                                                                        lexema = (prueba.esPalabra(cadena, posInicial, isOr, "Literal booleana"));
                                                                                                                        if (lexema != null) {
                                                                                                                            posInicial = posActual + 1;
                                                                                                                            arrayLexema.add(lexema);
                                                                                                                            verificarAutomatas(cadena);
                                                                                                                        } else {

                                                                                                                            lexema = (prueba.esPalabra(cadena, posInicial, keyOpen, "Literal booleana"));
                                                                                                                            if (lexema != null) {
                                                                                                                                posInicial = posActual + 1;
                                                                                                                                arrayLexema.add(lexema);
                                                                                                                                verificarAutomatas(cadena);
                                                                                                                            } else {

                                                                                                                                lexema = (prueba.esPalabra(cadena, posInicial, keyClose, "Literal booleana"));
                                                                                                                                if (lexema != null) {
                                                                                                                                    posInicial = posActual + 1;
                                                                                                                                    arrayLexema.add(lexema);
                                                                                                                                    verificarAutomatas(cadena);
                                                                                                                                } else {

                                                                                                                                    lexema = (prueba.esPalabra(cadena, posInicial, parenthesisOpen, "Literal booleana"));
                                                                                                                                    if (lexema != null) {
                                                                                                                                        posInicial = posActual + 1;
                                                                                                                                        arrayLexema.add(lexema);
                                                                                                                                        verificarAutomatas(cadena);
                                                                                                                                    } else {

                                                                                                                                        lexema = (prueba.esPalabra(cadena, posInicial, parenthesisClose, "Literal booleana"));
                                                                                                                                        if (lexema != null) {
                                                                                                                                            posInicial = posActual + 1;
                                                                                                                                            arrayLexema.add(lexema);
                                                                                                                                            verificarAutomatas(cadena);
                                                                                                                                        } else {

                                                                                                                                            lexema = (prueba.esPalabra(cadena, posInicial, plus, "Literal booleana"));
                                                                                                                                            if (lexema != null) {
                                                                                                                                                posInicial = posActual + 1;
                                                                                                                                                arrayLexema.add(lexema);
                                                                                                                                                verificarAutomatas(cadena);
                                                                                                                                            } else {

                                                                                                                                                lexema = (prueba.esPalabra(cadena, posInicial, minus, "Literal booleana"));
                                                                                                                                                if (lexema != null) {
                                                                                                                                                    posInicial = posActual + 1;
                                                                                                                                                    arrayLexema.add(lexema);
                                                                                                                                                    verificarAutomatas(cadena);
                                                                                                                                                } else {

                                                                                                                                                    lexema = (prueba.esPalabra(cadena, posInicial, times, "Literal booleana"));
                                                                                                                                                    if (lexema != null) {
                                                                                                                                                        posInicial = posActual + 1;
                                                                                                                                                        arrayLexema.add(lexema);
                                                                                                                                                        verificarAutomatas(cadena);
                                                                                                                                                    } else {

                                                                                                                                                        lexema = (prueba.esPalabra(cadena, posInicial, commentary, "Literal booleana"));
                                                                                                                                                        if (lexema != null) {
                                                                                                                                                            posInicial = posActual + 1;
                                                                                                                                                            arrayLexema.add(lexema);
                                                                                                                                                            verificarAutomatas(cadena);
                                                                                                                                                        } else {

                                                                                                                                                            lexema = (prueba.esPalabra(cadena, posInicial, divided, "Literal booleana"));
                                                                                                                                                            if (lexema != null) {
                                                                                                                                                                posInicial = posActual + 1;
                                                                                                                                                                arrayLexema.add(lexema);
                                                                                                                                                                verificarAutomatas(cadena);
                                                                                                                                                            } else {

                                                                                                                                                                lexema = (prueba.esPalabra(cadena, posInicial, lessThan, "Literal booleana"));
                                                                                                                                                                if (lexema != null) {
                                                                                                                                                                    posInicial = posActual + 1;
                                                                                                                                                                    arrayLexema.add(lexema);
                                                                                                                                                                    verificarAutomatas(cadena);
                                                                                                                                                                } else {

                                                                                                                                                                    lexema = (prueba.esPalabra(cadena, posInicial, greaterThan, "Literal booleana"));
                                                                                                                                                                    if (lexema != null) {
                                                                                                                                                                        posInicial = posActual + 1;
                                                                                                                                                                        arrayLexema.add(lexema);
                                                                                                                                                                        verificarAutomatas(cadena);
                                                                                                                                                                    } else {

                                                                                                                                                                        lexema = (prueba.esPalabra(cadena, posInicial, semicolon, "Literal booleana"));
                                                                                                                                                                        if (lexema != null) {
                                                                                                                                                                            posInicial = posActual + 1;
                                                                                                                                                                            arrayLexema.add(lexema);
                                                                                                                                                                            verificarAutomatas(cadena);
                                                                                                                                                                        } else {

                                                                                                                                                                            lexema = (prueba.esPalabra(cadena, posInicial, isInteger, "Literal booleana"));
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
}
