package org.example;

public class Main {
    public static void main(String[] args) {

        Jugador j1 = new Jugador("Jugador A");
        Jugador j2 = new Jugador("Jugador B");
        Jugador j3 = new Jugador("Jugador C");

        Enemigo n1 = new Enemigo("Enemigo A");
        Enemigo n2 = new Enemigo("Enemigo B");
        Enemigo n3 = new Enemigo("Enemigo C");

        j1.calcularFuerzaInicial();
        j2.calcularFuerzaInicial();
        j3.calcularFuerzaInicial();

        n1.calcularFuerzaInicial();
        n2.calcularFuerzaInicial();
        n3.calcularFuerzaInicial();

        System.out.println(j1.toString());
        System.out.println(j2.toString());
        System.out.println(j3.toString());

        System.out.println(n1.toString());
        System.out.println(n2.toString());
        System.out.println(n3.toString());

    }
}