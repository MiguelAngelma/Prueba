/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

/**
 *
 * @author Miguel Ángel
 * El modelo constará de una segunda clase, CajaNegra, que
tendrá un sólo método, llamado registraEstado, que recibe
como parámetro un objeto EstadoDeVuelo. este método
escribe en un fichero de texto, en una línea separada por
comas, la fecha y hora actual, la altitud y el rumbo. Este
método sería llamado por la clase EstadoDeVuelo cada vez
que se produzca una modificación en alguno de dichos
atributos.
 */
public class CajaNegra implements Serializable{
    
    private String nombreFichero = "registrosDeVuelo.txt";
    
    public void registraEstado(EstadoDeVuelo estado) throws IOException{
        File f = new File(nombreFichero);
        
        PrintWriter pw = new PrintWriter(new FileWriter(f,true));
        
        String cadena = new String(System.currentTimeMillis()+ " " + estado.getAltitud() + " " + estado.getRumbo());
        
        pw.println(cadena);
        
        pw.close();
    }
    
}
