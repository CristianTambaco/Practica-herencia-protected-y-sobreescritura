package Herencia1;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        // Crear objeto Scanner
        Scanner scanner = new Scanner(System.in);

        String nombre;
        String equipo;
        int edad;
        int atajadas;
        int golesRecibidos;
        int bloqueos;

        System.out.println("Datos Portero");
        System.out.print("Nombre: ");
        nombre = scanner.nextLine();

        System.out.print("Edad: ");
        edad = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Equipo: ");
        equipo = scanner.nextLine();

        System.out.print("Atajadas: ");
        atajadas = scanner.nextInt();

        System.out.print("Goles Recibidos: ");
        golesRecibidos = scanner.nextInt();

        scanner.nextLine();

        // Crear objeto portero de la clase JUGADOR
        JUGADOR portero = new Portero(nombre, edad, equipo, atajadas, golesRecibidos);


        System.out.println("\nDatos Defensa:");
        System.out.print("Nombre: ");
        nombre = scanner.nextLine();

        System.out.print("Edad: ");
        edad = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Equipo: ");
        equipo = scanner.nextLine();

        System.out.print("Bloqueos: ");
        bloqueos = scanner.nextInt();

        scanner.nextLine();

        // Crear objeto defensa de la clase JUGADOR
        JUGADOR defensa = new Defensa(nombre, edad, equipo, bloqueos);


        System.out.println("\nDatos Delantero:");
        System.out.print("Nombre: ");
        nombre = scanner.nextLine();

        System.out.print("Edad: ");
        edad = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Equipo: ");
        equipo = scanner.nextLine();

        // Crear objeto delantero de la clase JUGADOR
        JUGADOR delantero = new Delantero(nombre, edad, equipo);

        System.out.println("\nInformación Portero:");
        portero.mostrarInfo();
        System.out.println();

        System.out.println("Información Defensa:");
        defensa.mostrarInfo();
        System.out.println();

        System.out.println("Información Delantero:");
        delantero.mostrarInfo();

        scanner.close();
    }
}