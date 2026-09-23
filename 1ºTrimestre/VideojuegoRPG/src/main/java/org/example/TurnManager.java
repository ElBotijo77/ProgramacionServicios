package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class TurnManager {

    public static List<Jugador> creacionPersonajes(){
       List<Jugador> lista = new ArrayList<>();
       Scanner sc = new Scanner(System.in);
       String nombre = "";

       System.out.println("Empieza a decir el nombre de los jugadores. Cuando hayas terminado, pulsa X");
       for (int i=0; i<4; i++){
           nombre = sc.nextLine();
           if (Objects.equals(nombre, "X") && i > 0) break;
           lista.add(new Jugador(nombre));
           nombre = "";
       }
       sc.close();
       System.out.println("Muy bien, hay un total de " + lista.size() + " jugadores");
       return lista;
    }

    // Al declarar el argumento como una coleccion, nos aseguramos de que se muestren varios personajes
    public static void muestraCaracteristicas(List<Jugador> jugadores, List<Personaje> enemigos){
        System.out.println("\n------------ Caracteristicas de los jugadores --------------");
        for(Personaje p: jugadores){
            System.out.println(p);
        }
        System.out.println("\n------------ Caracteristicas de los enemigos --------------");
        for(Personaje p: enemigos){
            System.out.println(p);
        }
    }
}
