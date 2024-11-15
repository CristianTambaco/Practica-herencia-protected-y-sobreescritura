package Herencia1;

//Superclase Jugador
public class JUGADOR {
    // Atributos
    protected String nombre;
    protected int edad;
    protected String equipo;

    // Constructor
    public JUGADOR(String nombre, int edad, String equipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.equipo = equipo;
    }

    // Metodo personalizado mostrar informacion jugador
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Equipo: " + equipo);
    }
}

// Subclase Portero
class Portero extends JUGADOR {

    // Atributos
    private int atajadas;
    private int golesRecibidos;

    // Constructor
    public Portero(String nombre, int edad, String equipo, int atajadas, int golesRecibidos) {
        super(nombre, edad, equipo);
        this.atajadas = atajadas;
        this.golesRecibidos = golesRecibidos;
    }

    // Sobrescribir el metodo mostrarInfo() para mostrar información
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();  // Llamar metodo de superclase
        System.out.println("Atajadas: " + atajadas);
        System.out.println("Goles Recibidos: " + golesRecibidos);
    }
}

// Subclase Defensa
class Defensa extends JUGADOR {

    // Atributos
    private int bloqueos;

    // Constructor
    public Defensa(String nombre, int edad, String equipo, int bloqueos) {
        super(nombre, edad, equipo);
        this.bloqueos = bloqueos;
    }

    // Sobrescribir el metodo mostrarInfo() para mostrar información
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();  // Llamar metodo de superclase
        System.out.println("Bloqueos: " + bloqueos);
    }
}


// Subclase Delantero
class Delantero extends JUGADOR {

    //Atributos


    // Constructor
    public Delantero(String nombre, int edad, String equipo) {
        super(nombre, edad, equipo);
    }

    // Sobrescribir el metodo mostrarInfo() para mostrar informacion
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();  // Llamar metodo de superclase
    }

}



