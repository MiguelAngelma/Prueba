/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.IOException;
import java.io.Serializable;

/**
 *
 * @author Miguel Ángel
 * El modelo constará de una clase llamada EstadoDeVuelo. De
esta clase sólo existirá un objeto en la aplicación. Esta clase
contendrá dos atributos enteros, la altitud y el rumbo, así
como los métodos observadores y mutadores necesarios.
También tendrá un atributo de la clase desarrollada en el punto
b.
 */
public class EstadoDeVuelo implements Serializable {
   
    //Atributos privados de la clase.
    private int altitud, rumbo;
    
    // nos declaramos un objeto de la otra clase (CajaNegra) y lo inicializamos en el constructor
    private static CajaNegra miCajaNegraGit;
    
    private static EstadoDeVuelo miEstado;
    
    //constructor que inicializa los valores a 0,
    //ademas el constructor debe ser privado a causa del patron singleton
    private EstadoDeVuelo() {
          altitud=0;
          rumbo=0;
          
          miCajaNegraGit= new CajaNegra();// inicializacion de un objeto
    }
    //Patron singleton
    public static EstadoDeVuelo devolverEstado(){
        if(miEstado==null) miEstado = new EstadoDeVuelo();
        return miEstado;
    }
    

    public int getAltitud() {
        return altitud;
    }

    public void setAltitud(int altitud) throws IOException {
        this.altitud = altitud;
         miCajaNegraGit.registraEstado(this);//Llamamos al metodo de la clase CajaNegra
                                           // para el cambio de altitud.
    }

    public int getRumbo() {
        return rumbo;
    }

    public void setRumbo(int rumbo) throws IOException {
        this.rumbo = rumbo;
         miCajaNegraGit.registraEstado(this);//llamamos al metodo de la clase CajaNegra
                                          //para el cambio de rumbo
    }
    
    
    
}
