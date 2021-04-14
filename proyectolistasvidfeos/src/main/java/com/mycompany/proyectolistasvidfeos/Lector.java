/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectolistasvidfeos;

import java.io.*;

/**
 *
 * @author m825
 */
public class Lector {
    public Lector(){
    }
    public void leertxt(String ruta){
        String Texto="";
        try{
            BufferedReader bf= new BufferedReader(new FileReader(ruta));
            String temp="";
            String bfRead;
            //esta lee todo el documento
            while((bfRead=bf.readLine())!=null){
                System.out.println(bfRead);
            }
            
        }catch(Exception e){
        
        }
    }
}
