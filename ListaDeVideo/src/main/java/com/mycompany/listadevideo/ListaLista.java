/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.listadevideo;

import java.io.IOException;

/**
 *
 * @author Triasic Ranger
 */
public class ListaLista {
    
    private int tamaño;
    private NodoLista frente;
    private NodoLista fondo;
    private NodoLista indicador;
    
    public ListaLista() {
	this.frente = null;
	this.fondo = null;
	this.tamaño = 0;
        this.indicador = null;
    }
    
    public void InsertarListaFinal(Lista lista) throws IOException
    {
        NodoLista nuevo = new NodoLista();
        nuevo.setLista(lista);
        if ((this.fondo==null) && (this.frente==null))
        {
            this.frente = nuevo;
            this.fondo = nuevo;
            this.indicador = nuevo;
            this.tamaño = 1;
        }
        else
        {
            NodoLista aux = this.fondo;
            nuevo.setAnterior(aux);
            this.fondo = nuevo;
            aux.setSiguiente(fondo);
            this.tamaño++;
        }
    }
    
    public void Adelantar()
    {
        if (this.indicador.getSiguiente() != null)
        {
            this.indicador=this.indicador.getSiguiente();
        }
    }
    
    public void Retroceder()
    {
        if (this.indicador.getAnterior() != null)
        {
            this.indicador=this.indicador.getAnterior();
        }
    }
    
    public Lista Actual()
    {
        if (this.indicador != null)
        {
            return this.indicador.getLista();
        }
        return null;
    }
    
}
