/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.leertxt;

import java.io.*;

/**
 *
 * @author m825
 */
public class Leer {
    public Leer(){
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
            /* esta lee solo una linea especifica y es la el numero de linea que esta en el i<3 el valor de 3 tiene que cambiar en relacion 
                a la linea 
           for(int i=0;i<3;i++){
               bfRead=bf.readLine();
               Texto=bfRead;
           }
           System.out.println(Texto);
           */
        }catch(Exception e){
        
        }
    }
}
