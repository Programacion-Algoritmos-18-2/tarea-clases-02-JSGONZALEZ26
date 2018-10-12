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
public class Equipo {

    /*Atributos*/
    private String nombre;
    private int num_Jugadores;
    private String ciudad;

    /*Obtener y presentar los atributos*/
    public void agregar_Nombre(String x) {
        nombre = x;

    }

    public void agregar_Jugadores(int x) {
        num_Jugadores = x;
    }

    public void agregar_Ciudad(String x) {
        ciudad = x;

    }

    public String obtener_Nombre() {
        return nombre;
    }

    public int obtener_numJugadores() {
        return num_Jugadores;
    }

    public String obtener_Ciudad() {
        return ciudad;
    }

    /*Creación de constructores*/
    public Equipo() {
        agregar_Nombre("Liga de Quito");
        agregar_Jugadores(23);
        agregar_Ciudad("Quito");
    }

    public Equipo(String x) {
        agregar_Nombre(x);
    }

    public Equipo(String x, int y) {
        agregar_Nombre(x);
        agregar_Jugadores(y);
    }

    public Equipo(String x, int y, String z) {
        agregar_Nombre(x);
        agregar_Jugadores(y);
        agregar_Ciudad(z);
    }
}
