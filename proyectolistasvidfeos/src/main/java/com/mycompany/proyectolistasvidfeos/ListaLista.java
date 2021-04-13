/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectolistasvidfeos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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

    public NodoLista getFrente() {
        return frente;
    }

    public NodoLista getFondo() {
        return fondo;
    }
    
    public void InsertarListaFinal(Lista lista) throws IOException
    {
        NodoLista nuevo = new NodoLista();
        nuevo.setLista(lista);
        if ((this.fondo==null) && (this.frente==null))
        {
            this.frente = nuevo;
            this.fondo = nuevo;
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
        ActualizarLista();
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
    public NodoLista ObtenerIndicador(){
       return this.indicador;
    }
    
    public String Mostrar() {
	NodoLista aux = this.frente;
	String resultado = "";
	while (aux != null) {
		resultado = resultado +  "Nombre: " + aux.getLista().getNombreLista() + "\n";
		if (aux != this.fondo)
                {
                    resultado = resultado + "\n";
                }	
		aux = aux.getSiguiente();
	}
	return resultado;
    }
    
    public void ActualizarLista() throws IOException
    {
        FileWriter archivo = null;
        PrintWriter printWriter = null;
        NodoLista aux = this.frente;
        try
        {
            archivo = new FileWriter("lista.txt");
            printWriter = new PrintWriter(archivo);
            printWriter.println(Mostrar());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        archivo.close();
    }
    
    public NodoLista Buscar(String referencia)
    {
        NodoLista aux = this.frente;
	while (aux != null) {
            if (aux.getLista().getNombreLista().equals(referencia))
            {
                return aux;
            }
            aux = aux.getSiguiente();
	}
        return null;
    }
    
    public void SeleccionarLista (String referencia)
    {
        NodoLista aux = Buscar(referencia);
        if (aux != null)
        {
            this.indicador = aux;
        }
    }
    
    public boolean Repetido (String referencia)
    {
	NodoLista aux = Buscar(referencia);
	if (aux != null)
        {
            System.out.println("No se pueden guardar dos listas con el mismo nombre.");
            return true;
        }
        else
        {
            System.out.println("Lista guardada con exito.");
            return false;
	}
    }
}
