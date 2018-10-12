/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_en_clase;

/**
 *
 * @author Jairo
 */
public class Tarea_En_Clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Equipo e1 = new Equipo();
        Equipo e2 = new Equipo("Liga de Loja");
        e2.agregar_Jugadores(20);
        e2.agregar_Ciudad("Loja");
        Equipo e3 = new Equipo("Liga de Loja", 20);
        e3.agregar_Ciudad("Loja");
        Equipo e4 = new Equipo("Liga de Loja", 20, "Loja");
        System.out.printf("Nombre: %s - Jugadores: %s - Ciudad: %s\n", e1.obtener_Nombre(), e1.obtener_numJugadores(), e1.obtener_Ciudad());
        System.out.printf("Nombre: %s - Jugadores: %s - Ciudad: %s\n", e2.obtener_Nombre(), e2.obtener_numJugadores(), e2.obtener_Ciudad());
        System.out.printf("Nombre: %s - Jugadores: %s - Ciudad: %s\n", e3.obtener_Nombre(), e3.obtener_numJugadores(), e3.obtener_Ciudad());
        System.out.printf("Nombre: %s - Jugadores: %s - Ciudad: %s\n", e4.obtener_Nombre(), e4.obtener_numJugadores(), e4.obtener_Ciudad());
    }

}
