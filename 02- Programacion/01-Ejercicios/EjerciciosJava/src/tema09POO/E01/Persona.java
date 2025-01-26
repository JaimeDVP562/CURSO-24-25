package tema09POO.E01;

public class Persona {

    // Declaramos las variables de la clase
    String nombre;
    int edad;
    String dni;
    String sexo;

    // Constructos de la clase con todos los parámetros
    public Persona(String nombre, int edad, String dni, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
    }

    // Constructos de la clase con tres parámetros
    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = "No especificado";
    }

    // Constructos de la clase con dos parámetros
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = "No especificado";
        this.sexo = "No especificado";
    }

    // Constructos de la clase un parámetro
    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
        this.dni = "No especificado";
        this.sexo = "No especificado";
    }

    // Constructos de la clase vacío
    public Persona() {
        this.nombre = "Desconocido";
        this.edad = 0;
        this.dni = "No especificado";
        this.sexo = "No especificado";
    }
}
