package tema09POO.E01;

public class Gato extends Animal {

    // Creamos los atributos de la subclase Gato
    String raza;
    String color;

    // Creamos los constructores de la Subclase Gato

    public Gato(String nombre, int edad, String dni, String sexo, String raza, String color) {
        super(nombre, edad, dni, sexo);
        this.raza = raza;
        this.color = color;
    }

    public Gato(String nombre, int edad, String dni, String raza, String color) {
        super(nombre, edad, dni);
        this.raza = raza;
        this.color = color;
    }

    public Gato(String nombre, int edad, String raza, String color) {
        super(nombre, edad);
        this.raza = raza;
        this.color = color;
    }

    public Gato(String nombre, String raza, String color) {
        super(nombre);
        this.raza = raza;
        this.color = color;
    }

    public Gato(String raza, String color) {
        this.raza = raza;
        this.color = color;
    }

}
