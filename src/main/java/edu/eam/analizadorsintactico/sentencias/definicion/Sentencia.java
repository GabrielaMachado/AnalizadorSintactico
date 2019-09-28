/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eam.analizadorsintactico.sentencias.definicion;

import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import javax.swing.tree.TreeNode;

/**
 * Interface que representa una Sentencia resultado de una analisis gramatical.
 *
 * @author dani0
 */
public abstract class Sentencia implements TreeNode {

    /**
     * Sentencia dentro de la que se encuentra esta sentencia.
     */
    protected Sentencia root;
    /**
     * Hijos de la raiz de derivacion.
     */
    protected List<Sentencia> hijos;

    /**
     * Metodo donde se definen el orden en que estan los membros de la
     * sentencias.
     *
     * @return
     */
    public abstract List<Sentencia> llenarHijos();

    public List<Sentencia> getHijos() {
        if (hijos == null) {
            llenarHijos();
        }
        return hijos;
    }

    /**
     * Retpresentacion Textual del Simbolo.
     * @return 
     */
    public abstract String toString();
    
    @Override
    public TreeNode getChildAt(int childIndex) {
        return getHijos().get(childIndex);
    }

    @Override
    public int getChildCount() {
        return getHijos().size();
    }

    @Override
    public TreeNode getParent() {
        return root;
    }

    @Override
    public int getIndex(TreeNode node) {
        return getHijos().indexOf(node);
    }

    @Override
    public boolean getAllowsChildren() {
        return true;
    }

    @Override
    public boolean isLeaf() {
        if (getHijos() == null) {
            return true;
        }
        return getHijos().isEmpty();
    }

    @Override
    public Enumeration children() {
        return Collections.enumeration(hijos);
    }

    /**
     * @param hijos the hijos to set
     */
    public void setHijos(List<Sentencia> hijos) {
        this.hijos = hijos;
    }
    
    public abstract String parse();

}
