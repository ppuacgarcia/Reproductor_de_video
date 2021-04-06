/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.listadevideo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author mayel
 */
public class Lista {
    
    private int tamaño;
    private String nombreLista;
    private Nodo frente;
    private Nodo fondo;
    private Nodo indicador;
    
    public Lista() {
	this.frente = null;
	this.fondo = null;
	this.tamaño = 0;
        this.indicador = null;
    }
    
     public String getNombreLista() {
        return nombreLista;
    }
     
    public void setNombreLista(String nombreLista) {
        this.nombreLista = nombreLista;
    }

    
    public void InsertarFinal(String nombre, String descripcion, String direccion) throws IOException
    {
        Video nuevoVideo = new Video(nombre,descripcion,direccion);
        Nodo nuevo = new Nodo();
        nuevo.setVideo(nuevoVideo);
        if ((this.fondo==null) && (this.frente==null))
        {
            this.frente = nuevo;
            this.fondo = nuevo;
            this.indicador = nuevo;
            this.tamaño = 1;
        }
        else
        {
            Nodo aux = this.fondo;
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
    
    public String Actual()
    {
        if (this.indicador != null)
        {
            return this.indicador.getVideo().getDireccionVideo();
        }
        return "";
    }
    
    public String Mostrar() {
	Nodo aux = this.frente;
	String resultado = "";
	while (aux != null) {
		resultado = resultado +  "Nombre: " + aux.getVideo().getNombreVideo() + "\n";
                resultado = resultado +  "Descripcion: " + aux.getVideo().getDescripcionVideo() + "\n";
                resultado = resultado +  "Direccion: " + aux.getVideo().getNombreVideo() + "\n";
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
        Nodo aux = this.frente;
        try
        {
            archivo = new FileWriter(nombreLista + ".txt");
            printWriter = new PrintWriter(archivo);
            printWriter.println(Mostrar());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        archivo.close();
    }
    
}
