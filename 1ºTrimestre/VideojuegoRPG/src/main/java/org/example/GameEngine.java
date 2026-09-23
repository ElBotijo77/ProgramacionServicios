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
        TurnManager.muestraCaracteristicas(jugadores, ejercito);

        // Altamente improbable que hayan mas turnos que el maximo de un INT
        for(int i= 0; i < Integer.MAX_VALUE; i++){
            if(jugadores.isEmpty()) {
                System.out.println("---------------------------\n FIN DE LA PARTIDA\n---------------------------");
                break;
            }
            TurnManager.siguienteTurno();
        }
    }
}
