/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana_2_clases;

import java.util.Scanner;

/**
 *
 * @author Jairo
 */
public class Precio {

    double euros;
    Scanner entrada = new Scanner(System.in);

    public void agregar(double x) {
        System.out.println("Ingrese el valor de euros:");
        euros = entrada.nextDouble();
    }

    public double obtener() {
        return euros;
    }

}
