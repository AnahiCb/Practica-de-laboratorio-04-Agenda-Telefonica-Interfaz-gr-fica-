/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.vista.VentanaAgenda;
import java.awt.*;

/**
 *
 * @author Anahi
 */
public class Test {

    public static void main(String[] args) {

        VentanaAgenda principal = new VentanaAgenda("Agenda Telefonica (Interfaz Grafica)");
        principal.setSize(800, 600);
        principal.setLocation(new Point(250, 50));

    }

}
