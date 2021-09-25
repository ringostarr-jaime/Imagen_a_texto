/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jaime.imagen_texto_java.loading;

import com.jaime.imagen_texto_java.Gestionarchivos;
import com.jaime.imagen_texto_java.JFgestionA;
import com.jaime.imagen_texto_java.convertir;
import java.io.File;
import javax.accessibility.AccessibleContext;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author Jymmy
 */
public class hiloLoad implements Runnable {

    JFrame jframe=null;
    convertir cc = new convertir();
    File archivo=null;
    String idioma="";
    public static String texto="";      
    JTextArea txtArea;
    JFgestionA jfga;
            
    public void iniciarHilo(loadFrame frame, File archivo, String idioma, JTextArea txtArea, JFgestionA jfga) {
        this.jfga=jfga;
        this.txtArea=txtArea;
        jframe = frame;
        this.archivo=archivo;
        this.idioma=idioma;
        new Thread(this).start();
       
    }

    @Override
    public void run() {    
        jfga.setVisible(false);
        jframe.setVisible(true);
        jframe.setLocationRelativeTo(null);
        txtArea.setText(cc.convertirATexto(archivo, idioma)); 
        jframe.dispose();
        jframe.hide();
        jfga.setVisible(true);
    }



}
