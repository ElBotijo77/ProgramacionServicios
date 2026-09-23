package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameEngine {

    public static void runApp(){

        Scanner sc = new Scanner(System.in);
        List<Personaje> ejercito = List.of(new Enemigo("Primero"), new Enemigo("Segundo"),
                new Enemigo("Tercero"), new Enemigo("Cuarto"));


        System.out.println("---------------------------\n Videojuego RPG\n---------------------------");
        List<Jugador> jugadores = TurnManager.creacionPersonajes();


        //Aqui ira el manejo de turnos
        TurnManager.muestraCaracteristicas(jugadores, ejercito);


    }
}
