/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_3;

/**
 *
 * @author Jairo
 */
public class Principal_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Precio p = new Precio();
        Precio m = new Precio(2.2);
        Precio n = new Precio(25.3);
        //p.agregar(20.2);
        System.out.println(p.obtener()+"\n"+m.obtener()+"\n"+n.obtener());
    }

}
