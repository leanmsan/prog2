/* Ejercicio Jugadores 
Crear una clase “Jugador” con atributos:
String nombre
String apellido
int edad
Int goles
Definir un constructor para inicializar cada atributo
Definir los métodos get y set para cada atributo
En el método main crear una lista con 5 jugadores.
Calcular el promedio de la edad de los jugadores recorriendo la lista y cantidad de goles totales. */

import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 
<<<<<<< HEAD
        ArrayList<Jugador> listajugadores = new ArrayList<>();
        int totalEdad = 0;
        int totalGoles = 0;

        for (int i = 0; i < 2; i++) {
=======
        ArrayList<String> listajugadores = new ArrayList<>();
        int totalEdad = 0;
        int totalGoles = 0;

        for (int i = 0; i < 5; i++) {
>>>>>>> 30971f2010ed8aaa90869bce423e21eece408ad6
            System.out.println("Dime el apellido");
            String apellido = sc.next();
            System.out.println("Dime el nombre");
            String nombre = sc.next();
            System.out.println("Dime su edad");
            int edad = sc.nextInt();
            System.out.println("Dime cuantos goles hizo");
            int goles = sc.nextInt();
            Jugador jugadores = new Jugador(apellido, nombre, edad, goles);
            listajugadores.add(jugadores);
            totalEdad = totalEdad + edad;
        }
        
        for (Jugador j : listajugadores) {
            totalGoles += j.getGoles();
        }

<<<<<<< HEAD
        int promEdad = totalEdad / 2;
=======
        int promEdad = totalEdad / 5;
>>>>>>> 30971f2010ed8aaa90869bce423e21eece408ad6
        System.out.println("\n" + "El promedio de edad es de " + promEdad + "\n" + "El total de goles es de " + totalGoles);
        
        //para control
        System.out.println("\n" + "Lista Jugadores");
        for (int i = 0; i < listajugadores.size(); i++) {
            System.out.println(listajugadores.get(i));
        }
    }
}