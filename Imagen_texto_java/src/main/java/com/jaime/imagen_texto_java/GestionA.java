/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jaime.imagen_texto_java;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.imageio.stream.FileImageInputStream;

/**
 *
 * @author Jymmy
 */
public class GestionA {

    FileImageInputStream entrada;
    FileOutputStream salida;
    File archivo;

    public GestionA() {

    }    

    //<editor-fold defaultstate="collapsed" desc="GuardaATexto">     
    public String GuardaATexto(File archivo, String contenido) {
        String respuesta = null;
        try {
            salida = new FileOutputStream(archivo);
            byte[] bytesTxt = contenido.getBytes();
            salida.write(bytesTxt);
            salida.close();
            respuesta = "Se guardo con exito el archivo";

        } catch (Exception e) {
        }
        return respuesta;
    }
    //</editor-fold>

    //Abrir una imagen
    public byte[] AbrirImagen(File archivo) {
        //byte[] bytesImg = new byte[1024*1024*100];

        //Recuperamos el tamaño de la imagen
        long I = archivo.length();
        //convertimos el integer para poder asignar al arreglo
        int tam = (int) I;
        byte[] bytesImg = new byte[tam];

        try {
            entrada = new FileImageInputStream(archivo);
            entrada.read(bytesImg);
            entrada.close();
        } catch (Exception e) {
        }

        return bytesImg;

    }

    //<editor-fold defaultstate="collapsed" desc="GuardarAImagen">    
    /*Metodo para guadar una imagen*/
    public String GuardarAImagen(File archivo, byte[] bytesImg) {
        String respuesta = null;

        try {
            salida = new FileOutputStream(archivo);
            salida.write(bytesImg);
            respuesta = "La imagen se guardo con exito";
        } catch (Exception e) {
        }
        return respuesta;
    }
    //</editor-fold>
}
