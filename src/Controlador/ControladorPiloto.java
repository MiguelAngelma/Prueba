/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.EstadoDeVuelo;
import Vista.VistaPilotoAutomatico;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel Ángel
 */
public class ControladorPiloto {

    // al ser el controlador tiene que tener un objeto de la vista
    //ademas tiene que acceder a los datos de la vista
    private VistaPilotoAutomatico vista;

    // este atributo se inicializa en un constructor
    public ControladorPiloto(VistaPilotoAutomatico vista) {
        this.vista = vista;
    }
    
    //modicarRumbo es llamado en sumarRumbo y restarRumbo
    //a si quedará registro en el fichero por cada modificacion
    public void modificarRumbo() throws IOException {
        int nuevoRumbo = Integer.parseInt(vista.getjTextFieldRumbo().getText());

        EstadoDeVuelo.devolverEstado().setRumbo(nuevoRumbo);

    }
    //modicarAltitud es llamado en sumarAltitud y restarAltitud
    public void modificarAltitud() throws IOException {
        int nuevaAltitud = Integer.parseInt(vista.getjTextFieldAltitud().getText());

        EstadoDeVuelo.devolverEstado().setAltitud(nuevaAltitud);

    }

    public void sumarAltitud() {
        try {
            int altitud = Integer.parseInt(vista.getjTextFieldAltitud().getText());
            
            if (altitud >= 0 && altitud < 40000) {
                altitud++;
                vista.getjTextFieldAltitud().setText("" + altitud);
                modificarAltitud();
            } else {
                JOptionPane.showMessageDialog(vista, "Solo adimite valores entre 0 y 40000", "Error", JOptionPane.ERROR_MESSAGE);
                vista.getjTextFieldAltitud().setText("" + 0);
            }
            
        } catch (IOException io) {
            JOptionPane.showMessageDialog(vista, "Error E/S", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(vista, "Error, solo valores numéricos", "Error", JOptionPane.ERROR_MESSAGE);
            vista.getjTextFieldAltitud().setText("" + 0);
        }
    }

    public void restarAltitud() {
        try {
            int altitud = Integer.parseInt(vista.getjTextFieldAltitud().getText());
            
            if (altitud > 0 && altitud <= 40000) {
                altitud--;
                vista.getjTextFieldAltitud().setText("" + altitud);
                modificarAltitud();
            } else {
                JOptionPane.showMessageDialog(vista, "Solo adimite valores entre 0 y 40000", "Error", JOptionPane.ERROR_MESSAGE);
                vista.getjTextFieldAltitud().setText("" + 0);
            }
            
        } catch (IOException io) {
            JOptionPane.showMessageDialog(vista, "Error E/S", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(vista, "Error, solo valores numéricos", "Error", JOptionPane.ERROR_MESSAGE);
            vista.getjTextFieldAltitud().setText("" + 0);
        }
    }

    public void sumarRumbo() {
        try {
            int rumbo = Integer.parseInt(vista.getjTextFieldRumbo().getText());
            
            if (rumbo >= 0 && rumbo < 349) {
                rumbo++;
                vista.getjTextFieldRumbo().setText("" + rumbo);
                modificarRumbo();
            } else {
                JOptionPane.showMessageDialog(vista, "Solo adimite valores entre 0 y 349", "Error", JOptionPane.ERROR_MESSAGE);
                vista.getjTextFieldRumbo().setText("" + 0);
            }
            
        } catch (IOException io) {
            JOptionPane.showMessageDialog(vista, "Error E7S", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(vista, "Error, solo valores numéricos", "Error", JOptionPane.ERROR_MESSAGE);
            vista.getjTextFieldRumbo().setText("" + 0);
        }
    }

    public void restarRumbo() {
        try {
            int rumbo = Integer.parseInt(vista.getjTextFieldRumbo().getText());
            
            if (rumbo > 0 && rumbo <= 349) {
                rumbo--;
                vista.getjTextFieldRumbo().setText("" + rumbo);
                modificarRumbo();
            } else {
                JOptionPane.showMessageDialog(vista, "Solo adimite valores entre 0 y 40000", "Error", JOptionPane.ERROR_MESSAGE);
                vista.getjTextFieldAltitud().setText("" + 0);
            }
            
        } catch (IOException io) {
            JOptionPane.showMessageDialog(vista, "Error E7S", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(vista, "Error, solo valores numéricos", "Error", JOptionPane.ERROR_MESSAGE);
            vista.getjTextFieldRumbo().setText("" + 0);
        }
    }

}
