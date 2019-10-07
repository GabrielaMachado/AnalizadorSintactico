/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eam.analizadorsintactico.sentencias.implementaciones;

<<<<<<< HEAD
=======
import edu.eam.analizadorlexicos.Lexema;
>>>>>>> gramaticas 6
import edu.eam.analizadorsintactico.sentencias.definicion.Sentencia;
import java.util.List;

/**
 *
 * @author dani0
 */
public class LlamadoFuncion extends Sentencia{
<<<<<<< HEAD

    @Override
    public List<Sentencia> llenarHijos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
=======
    
    private Lexema ident;

    private Lexema openP;
    
    private Lexema ident2;
    
    private Lexema coma;
    
    private Lexema closeP;

    public LlamadoFuncion() {
    }

    public LlamadoFuncion(Lexema ident, Lexema openP, Lexema ident2, Lexema coma, Lexema closeP) {
        this.ident = ident;
        this.openP = openP;
        this.ident2 = ident2;
        this.coma = coma;
        this.closeP = closeP;
    }

    public Lexema getIdent() {
        return ident;
    }

    public void setIdent(Lexema ident) {
        this.ident = ident;
    }

    public Lexema getOpenP() {
        return openP;
    }

    public void setOpenP(Lexema openP) {
        this.openP = openP;
    }

    public Lexema getIdent2() {
        return ident2;
    }

    public void setIdent2(Lexema ident2) {
        this.ident2 = ident2;
    }

    public Lexema getComa() {
        return coma;
    }

    public void setComa(Lexema coma) {
        this.coma = coma;
    }

    public Lexema getCloseP() {
        return closeP;
    }

    public void setCloseP(Lexema closeP) {
        this.closeP = closeP;
>>>>>>> gramaticas 6
    }
    
    @Override
    public List<Sentencia> llenarHijos() {
//        hijos = new ArrayList<>();
//        hijos.add(new SentenciaToken(tipoDato));
//        hijos.add(new SentenciaToken(ident));
//        if (inicializacion != null) {
//            hijos.add(new SentenciaToken(inicializacion));
//        }
        return hijos;    }

    @Override
    public String toString() {
        return "Llamado funcion:" + ident.getToken() + " " + openP.getToken() + " " + ident2.getToken()
                + " " + coma.getToken() + " " + closeP.getToken();
    }

    @Override
    public String parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
