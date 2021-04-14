/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectolistasvidfeos;

/**
 *
 * @author Triasic Ranger
 */
public class NodoLista {
    
    private Lista lista;
    private NodoLista siguiente;
    private NodoLista anterior;

    public NodoLista(Lista lista) {
        this.lista = lista;
        this.siguiente = null;
        this.anterior = null;
        


    }
    
    public NodoLista() {
        this.lista = null;
        this.siguiente = null;
        this.anterior = null;
    }

    public Lista getLista() {
        return lista;
    }

    public NodoLista getSiguiente() {
        return siguiente;
    }

    public NodoLista getAnterior() {
        return anterior;
    }

    public void setLista(Lista lista) {
        this.lista = lista;
    }

    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }

    public void setAnterior(NodoLista anterior) {
        this.anterior = anterior;
    }
}
