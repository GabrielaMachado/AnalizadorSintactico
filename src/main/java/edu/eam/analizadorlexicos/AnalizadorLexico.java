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
    public static String isIf = "if";
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
    public static String keyOpen = "{";
    public static String keyClose = "}";
    public static String parenthesisOpen = "(";
    public static String parenthesisClose = ")";
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
    static String quotes = "'";

    public static void main(String[] args) {
        FrmPrincipal frm = new FrmPrincipal();
        frm.setVisible(true);

    }

    public static ArrayList<Lexema> verificarAutomatas(Character[] cadena) {
        while (cadena.length > posInicial) {
            lexema = (prueba.esPalabra(cadena, posInicial, isTrue, TipoLexemaEnum.LBOL_TRUE));
            if (lexema != null) {
                posInicial = posActual + 1;
                arrayLexema.add(lexema);
                verificarAutomatas(cadena);
            } else {
                lexema = (prueba.esPalabra(cadena, posInicial, isFalse, TipoLexemaEnum.LBOL_FALSE));
                if (lexema != null) {
                    posInicial = posActual + 1;
                    arrayLexema.add(lexema);
                    verificarAutomatas(cadena);
                } else {
                    lexema = (prueba.esPalabra(cadena, posInicial, isCatch, TipoLexemaEnum.EXP_CATCH));
                    if (lexema != null) {
                        posInicial = posActual + 1;
                        arrayLexema.add(lexema);
                        verificarAutomatas(cadena);
                    } else {
                        lexema = (prueba.esPalabra(cadena, posInicial, isTry, TipoLexemaEnum.EXP_TRY));
                        if (lexema != null) {
                            posInicial = posActual + 1;
                            arrayLexema.add(lexema);
                            verificarAutomatas(cadena);
                        } else {
                            lexema = (prueba.esPalabra(cadena, posInicial, isMessage, TipoLexemaEnum.SD_MESSAGE));
                            if (lexema != null) {
                                posInicial = posActual + 1;
                                arrayLexema.add(lexema);
                                verificarAutomatas(cadena);
                            } else {
                                lexema = (prueba.esPalabra(cadena, posInicial, isReturn, TipoLexemaEnum.SD_RETURN));
                                if (lexema != null) {
                                    posInicial = posActual + 1;
                                    arrayLexema.add(lexema);
                                    verificarAutomatas(cadena);
                                } else {
                                    lexema = (prueba.esPalabra(cadena, posInicial, isSwitch, TipoLexemaEnum.EST_CON_SWITCH));
                                    if (lexema != null) {
                                        posInicial = posActual + 1;
                                        arrayLexema.add(lexema);
                                        verificarAutomatas(cadena);
                                    } else {
                                        lexema = (prueba.esPalabra(cadena, posInicial, isWhile, TipoLexemaEnum.EST_CON_WHILE));
                                        if (lexema != null) {
                                            posInicial = posActual + 1;
                                            arrayLexema.add(lexema);
                                            verificarAutomatas(cadena);
                                        } else {
                                            lexema = (prueba.esPalabra(cadena, posInicial, isBreak, TipoLexemaEnum.EST_CON_BREAK));
                                            if (lexema != null) {
                                                posInicial = posActual + 1;
                                                arrayLexema.add(lexema);
                                                verificarAutomatas(cadena);
                                            } else {
                                                lexema = (prueba.esPalabra(cadena, posInicial, isCase, TipoLexemaEnum.EST_CON_CASE));
                                                if (lexema != null) {
                                                    posInicial = posActual + 1;
                                                    arrayLexema.add(lexema);
                                                    verificarAutomatas(cadena);
                                                } else {
                                                    lexema = (prueba.esPalabra(cadena, posInicial, isElse, TipoLexemaEnum.EST_CON_ELSE));
                                                    if (lexema != null) {
                                                        posInicial = posActual + 1;
                                                        arrayLexema.add(lexema);
                                                        verificarAutomatas(cadena);
                                                    } else {
                                                        lexema = (prueba.esPalabra(cadena, posInicial, isFor, TipoLexemaEnum.EST_CON_FOR));
                                                        if (lexema != null) {
                                                            posInicial = posActual + 1;
                                                            arrayLexema.add(lexema);
                                                            verificarAutomatas(cadena);
                                                        } else {
                                                            lexema = (prueba.esPalabra(cadena, posInicial, isIf, TipoLexemaEnum.EST_CON_IF));
                                                            if (lexema != null) {
                                                                posInicial = posActual + 1;
                                                                arrayLexema.add(lexema);
                                                                verificarAutomatas(cadena);
                                                            } else {
                                                                lexema = (prueba.esPalabra(cadena, posInicial, isDo, TipoLexemaEnum.EST_CON_DO));
                                                                if (lexema != null) {
                                                                    posInicial = posActual + 1;
                                                                    arrayLexema.add(lexema);
                                                                    verificarAutomatas(cadena);
                                                                } else {
                                                                    lexema = (prueba.esPalabra(cadena, posInicial, isBoolean, TipoLexemaEnum.TD_BOOLEAN));
                                                                    if (lexema != null) {
                                                                        posInicial = posActual + 1;
                                                                        arrayLexema.add(lexema);
                                                                        verificarAutomatas(cadena);
                                                                    } else {
                                                                        lexema = (prueba.esPalabra(cadena, posInicial, isInteger, TipoLexemaEnum.TD_INTEGER));
                                                                        if (lexema != null) {
                                                                            posInicial = posActual + 1;
                                                                            arrayLexema.add(lexema);
                                                                            verificarAutomatas(cadena);
                                                                        } else {
                                                                            lexema = (prueba.esPalabra(cadena, posInicial, isDouble, TipoLexemaEnum.TD_DOUBLE));
                                                                            if (lexema != null) {
                                                                                posInicial = posActual + 1;
                                                                                arrayLexema.add(lexema);
                                                                                verificarAutomatas(cadena);
                                                                            } else {
                                                                                lexema = (prueba.esPalabra(cadena, posInicial, isString, TipoLexemaEnum.TD_STRING));
                                                                                if (lexema != null) {
                                                                                    posInicial = posActual + 1;
                                                                                    arrayLexema.add(lexema);
                                                                                    verificarAutomatas(cadena);
                                                                                } else {
                                                                                    lexema = (prueba.esPalabra(cadena, posInicial, isStyle, TipoLexemaEnum.TD_STYLE));
                                                                                    if (lexema != null) {
                                                                                        posInicial = posActual + 1;
                                                                                        arrayLexema.add(lexema);
                                                                                        verificarAutomatas(cadena);
                                                                                    } else {
                                                                                        lexema = (prueba.esPalabra(cadena, posInicial, isFigure, TipoLexemaEnum.TD_FIGURE));
                                                                                        if (lexema != null) {
                                                                                            posInicial = posActual + 1;
                                                                                            arrayLexema.add(lexema);
                                                                                            verificarAutomatas(cadena);
                                                                                        } else {
                                                                                            lexema = (prueba.esPalabra(cadena, posInicial, isColor, TipoLexemaEnum.TD_COLOR));
                                                                                            if (lexema != null) {
                                                                                                posInicial = posActual + 1;
                                                                                                arrayLexema.add(lexema);
                                                                                                verificarAutomatas(cadena);
                                                                                            } else {

                                                                                                lexema = (prueba.esPalabra(cadena, posInicial, isChar, TipoLexemaEnum.TD_CHAR));
                                                                                                if (lexema != null) {
                                                                                                    posInicial = posActual + 1;
                                                                                                    arrayLexema.add(lexema);
                                                                                                    verificarAutomatas(cadena);
                                                                                                } else {

                                                                                                    lexema = (prueba.esPalabra(cadena, posInicial, isCanvas, TipoLexemaEnum.ED_CANVAS));
                                                                                                    if (lexema != null) {
                                                                                                        posInicial = posActual + 1;
                                                                                                        arrayLexema.add(lexema);
                                                                                                        verificarAutomatas(cadena);
                                                                                                    } else {

                                                                                                        lexema = (prueba.esPalabra(cadena, posInicial, isVoid, TipoLexemaEnum.ED_VOID));
                                                                                                        if (lexema != null) {
                                                                                                            posInicial = posActual + 1;
                                                                                                            arrayLexema.add(lexema);
                                                                                                            verificarAutomatas(cadena);
                                                                                                        } else {

                                                                                                            lexema = (prueba.esPalabra(cadena, posInicial, isNull, TipoLexemaEnum.ED_NULL));
                                                                                                            if (lexema != null) {
                                                                                                                posInicial = posActual + 1;
                                                                                                                arrayLexema.add(lexema);
                                                                                                                verificarAutomatas(cadena);
                                                                                                            } else {

                                                                                                                lexema = (prueba.esPalabra(cadena, posInicial, isNew, TipoLexemaEnum.ED_NEW));
                                                                                                                if (lexema != null) {
                                                                                                                    posInicial = posActual + 1;
                                                                                                                    arrayLexema.add(lexema);
                                                                                                                    verificarAutomatas(cadena);
                                                                                                                } else {

                                                                                                                    lexema = (prueba.esPalabra(cadena, posInicial, isAnd, TipoLexemaEnum.OP_LOG_AND));
                                                                                                                    if (lexema != null) {
                                                                                                                        posInicial = posActual + 1;
                                                                                                                        arrayLexema.add(lexema);
                                                                                                                        verificarAutomatas(cadena);
                                                                                                                    } else {

                                                                                                                        lexema = (prueba.esPalabra(cadena, posInicial, isOr, TipoLexemaEnum.OP_LOG_OR));
                                                                                                                        if (lexema != null) {
                                                                                                                            posInicial = posActual + 1;
                                                                                                                            arrayLexema.add(lexema);
                                                                                                                            verificarAutomatas(cadena);
                                                                                                                        } else {

                                                                                                                            lexema = (prueba.esPalabra(cadena, posInicial, keyOpen, TipoLexemaEnum.AGR_OPENKEY));
                                                                                                                            if (lexema != null) {
                                                                                                                                posInicial = posActual + 1;
                                                                                                                                arrayLexema.add(lexema);
                                                                                                                                verificarAutomatas(cadena);
                                                                                                                            } else {

                                                                                                                                lexema = (prueba.esPalabra(cadena, posInicial, keyClose, TipoLexemaEnum.AGR_CLOSEKEY));
                                                                                                                                if (lexema != null) {
                                                                                                                                    posInicial = posActual + 1;
                                                                                                                                    arrayLexema.add(lexema);
                                                                                                                                    verificarAutomatas(cadena);
                                                                                                                                } else {

                                                                                                                                    lexema = (prueba.esPalabra(cadena, posInicial, parenthesisOpen, TipoLexemaEnum.AGR_OPENP));
                                                                                                                                    if (lexema != null) {
                                                                                                                                        posInicial = posActual + 1;
                                                                                                                                        arrayLexema.add(lexema);
                                                                                                                                        verificarAutomatas(cadena);
                                                                                                                                    } else {

                                                                                                                                        lexema = (prueba.esPalabra(cadena, posInicial, parenthesisClose, TipoLexemaEnum.AGR_CLOSEP));
                                                                                                                                        if (lexema != null) {
                                                                                                                                            posInicial = posActual + 1;
                                                                                                                                            arrayLexema.add(lexema);
                                                                                                                                            verificarAutomatas(cadena);
                                                                                                                                        } else {

                                                                                                                                            lexema = (prueba.esPalabra(cadena, posInicial, plus, TipoLexemaEnum.OP_ART_PLUS));
                                                                                                                                            if (lexema != null) {
                                                                                                                                                posInicial = posActual + 1;
                                                                                                                                                arrayLexema.add(lexema);
                                                                                                                                                verificarAutomatas(cadena);
                                                                                                                                            } else {

                                                                                                                                                lexema = (prueba.esPalabra(cadena, posInicial, minus, TipoLexemaEnum.OP_ART_MINUS));
                                                                                                                                                if (lexema != null) {
                                                                                                                                                    posInicial = posActual + 1;
                                                                                                                                                    arrayLexema.add(lexema);
                                                                                                                                                    verificarAutomatas(cadena);
                                                                                                                                                } else {

                                                                                                                                                    lexema = (prueba.esPalabra(cadena, posInicial, times, TipoLexemaEnum.OP_ART_TIME));
                                                                                                                                                    if (lexema != null) {
                                                                                                                                                        posInicial = posActual + 1;
                                                                                                                                                        arrayLexema.add(lexema);
                                                                                                                                                        verificarAutomatas(cadena);
                                                                                                                                                    } else {

                                                                                                                                                        lexema = (prueba.esPalabra(cadena, posInicial, commentary, TipoLexemaEnum.COMMENTARY));
                                                                                                                                                        if (lexema != null) {
                                                                                                                                                            posInicial = posActual + 1;
                                                                                                                                                            arrayLexema.add(lexema);
                                                                                                                                                            verificarAutomatas(cadena);
                                                                                                                                                        } else {

                                                                                                                                                            lexema = (prueba.esPalabra(cadena, posInicial, divided, TipoLexemaEnum.OP_ART_DIVIDED));
                                                                                                                                                            if (lexema != null) {
                                                                                                                                                                posInicial = posActual + 1;
                                                                                                                                                                arrayLexema.add(lexema);
                                                                                                                                                                verificarAutomatas(cadena);
                                                                                                                                                            } else {

                                                                                                                                                                lexema = (prueba.esPalabra(cadena, posInicial, lessThan, TipoLexemaEnum.OP_LOG_LTHAN));
                                                                                                                                                                if (lexema != null) {
                                                                                                                                                                    posInicial = posActual + 1;
                                                                                                                                                                    arrayLexema.add(lexema);
                                                                                                                                                                    verificarAutomatas(cadena);
                                                                                                                                                                } else {

                                                                                                                                                                    lexema = (prueba.esPalabra(cadena, posInicial, greaterThan, TipoLexemaEnum.OP_LOG_GTHAN));
                                                                                                                                                                    if (lexema != null) {
                                                                                                                                                                        posInicial = posActual + 1;
                                                                                                                                                                        arrayLexema.add(lexema);
                                                                                                                                                                        verificarAutomatas(cadena);
                                                                                                                                                                    } else {

                                                                                                                                                                        lexema = (prueba.esPalabra(cadena, posInicial, semicolon, TipoLexemaEnum.DELIMITADOR));
                                                                                                                                                                        if (lexema != null) {
                                                                                                                                                                            posInicial = posActual + 1;
                                                                                                                                                                            arrayLexema.add(lexema);
                                                                                                                                                                            verificarAutomatas(cadena);
                                                                                                                                                                        } else {

                                                                                                                                                                            lexema = (prueba.esPalabra(cadena, posInicial, isEquals, TipoLexemaEnum.OP_LOG_ISEQUALS));
                                                                                                                                                                            if (lexema != null) {
                                                                                                                                                                                posInicial = posActual + 1;
                                                                                                                                                                                arrayLexema.add(lexema);
                                                                                                                                                                                verificarAutomatas(cadena);
                                                                                                                                                                            } else {

                                                                                                                                                                                lexema = (prueba.esPalabra(cadena, posInicial, equals, TipoLexemaEnum.ASIGNACION));
                                                                                                                                                                                if (lexema != null) {
                                                                                                                                                                                    posInicial = posActual + 1;
                                                                                                                                                                                    arrayLexema.add(lexema);
                                                                                                                                                                                    verificarAutomatas(cadena);
                                                                                                                                                                                } else {

                                                                                                                                                                                    lexema = (prueba.esPalabra(cadena, posInicial, quotes, TipoLexemaEnum.QUOTES));
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
        return arrayLexema;
    }
}
