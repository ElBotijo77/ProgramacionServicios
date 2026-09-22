package org.example;

import java.util.Random;

public class Jugador extends Npc{

    private int dinero = 2;

    // CONTRUCTOR
    public Jugador(String nombre) {
        super(nombre);
    }

    // GETTERS Y SETTERS
    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getDinero() {
        return dinero;
    }

    @Override
    public String toString() {
        return "Jugador: " + super.getNombre() +
                ", puntosSalud=" + super.getPuntosSalud() +
                ", puntosAtaque=" + super.getPuntosAtaque() +
                ", dinero=" + getDinero();
    }
}
