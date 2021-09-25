/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jaime.imagen_texto_java;


import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import net.sourceforge.tess4j.*;


/**
 *
 * @author Jymmy
 */
public class convertir {
    
    public String convertirATexto(File rutaImagen, String idioma)
    {        
        String texto="";
        //File imageFile = new File("imagen1.jpg");
        String ruta = System.getProperty("user.dir") + "\\tessdata";        
        ITesseract instance = new Tesseract();  
        instance.setDatapath(ruta);
        instance.setLanguage((idioma.equals("")?"spa":idioma));           
        try {           
            texto  = instance.doOCR(rutaImagen);          
            //System.out.println(texto);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }        
        return texto;
    }
}
