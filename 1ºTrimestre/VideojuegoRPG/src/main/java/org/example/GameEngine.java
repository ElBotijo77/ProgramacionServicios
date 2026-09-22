package org.example;

import java.util.List;
import java.util.Scanner;

public class GameEngine {

    public static void runApp(){

        Scanner sc = new Scanner(System.in);
        List<Enemigo> ejercito = List.of(new Enemigo("Primero"), new Enemigo("Segundo"),
                new Enemigo("Tercero"), new Enemigo("Cuarto"));

        System.out.println("---------------------------\n Videojuego RPG\n---------------------------");
        System.out.println("Di tu nombre: ");
        Jugador j1 = new Jugador(sc.nextLine());
        
        //Aqui ira el manejo de turnos

        System.out.println(j1.toString());

    }
}
