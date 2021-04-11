/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectolistasvidfeos;

/**
 *
 * @author mayel
 */
public class Nodo {
    
    private Video video;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo() {
        this.video = null;
        this.siguiente = null;
        this.anterior = null;
    }
    
    public Nodo(Video video) {
        this.video = video;
        this.siguiente = null;
        this.anterior = null;
    }

    public Video getVideo() {
        return video;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

}

