/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jaime.imagen_texto_java;


import java.io.File;
import net.sourceforge.tess4j.*;

/**
 *
 * @author Jymmy
 */
public class convertir {

    String texto = "";

    public String convertirATexto(File rutaImagen, String idioma) {
        //File imageFile = new File("imagen1.jpg");
        //String ruta = System.getProperty("user.dir") + "\\tessdata";
        String ruta = "";
        ruta = "classes/tessdata/";
        ITesseract instance = new Tesseract();
        instance.setDatapath(ruta);
        instance.setLanguage((idioma.equals("") ? "spa" : idioma));
        try {
            texto = instance.doOCR(rutaImagen);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
        return texto;
    }
}
