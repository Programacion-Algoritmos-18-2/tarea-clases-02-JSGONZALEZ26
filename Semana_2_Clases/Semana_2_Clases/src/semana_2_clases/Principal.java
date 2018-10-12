/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana_2_clases;

/**
 *
 * @author Jairo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Precio p;
        p = new Precio();
        double x = 0;
        System.out.println(p.euros);
        p.euros = 10.1;
        System.out.println(p.euros);
        p.agregar(x);
        System.out.println(p.obtener());
    }

}
