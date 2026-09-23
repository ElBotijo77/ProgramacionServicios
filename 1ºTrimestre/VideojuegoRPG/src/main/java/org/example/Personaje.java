package org.example;

import java.util.Random;

public class Personaje {

    private String nombre = "";
    private int puntosAtaque = 0;
    private int puntosSalud = 20;

    public Personaje(String nombre) {
        this.nombre = nombre;
    }

    // GETTERS

    public String getNombre() {
        return nombre;
        }

    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    public int getPuntosSalud() {
        return puntosSalud;
    }

    // SETTERS

    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    public void calcularFuerzaInicial(){
        Random rand = new Random();
        setPuntosAtaque(rand.nextInt(6));   // Ataque entre 0 y 5
    }

    public String toString() {
        return "Valor NPC: " +
                "nombre='" + nombre + '\'' +
                ", puntosSalud=" + puntosSalud +
                ", puntosAtaque=" + puntosAtaque;
    }
}
