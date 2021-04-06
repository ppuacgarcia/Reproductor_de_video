/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.listadevideo;

/**
 *
 * @author mayel
 */
public class Video {
    
    private String nombreVideo;
    private String descripcionVideo;
    private String direccionVideo;

    public Video(String nombreVideo, String descripcionVideo, String direccionVideo) {
        this.nombreVideo = nombreVideo;
        this.descripcionVideo = descripcionVideo;
        this.direccionVideo = direccionVideo;
    }
    
    public Video() {
        this.nombreVideo = "";
        this.descripcionVideo = "";
        this.direccionVideo = "";
    }

    public String getNombreVideo() {
        return nombreVideo;
    }

    public String getDescripcionVideo() {
        return descripcionVideo;
    }

    public String getDireccionVideo() {
        return direccionVideo;
    }

    public void setNombreVideo(String nombreVideo) {
        this.nombreVideo = nombreVideo;
    }

    public void setDescripcionVideo(String descripcionVideo) {
        this.descripcionVideo = descripcionVideo;
    }

    public void setDireccionVideo(String direccionVideo) {
        this.direccionVideo = direccionVideo;
    }
}
