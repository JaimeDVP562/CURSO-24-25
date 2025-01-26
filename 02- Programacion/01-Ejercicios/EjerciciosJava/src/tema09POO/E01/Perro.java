package tema09POO.E01;

public class Perro extends Animal {
    // Creamos los atributos de la subclase Perro
    String raza;
    String color;

    // Creamos los constructores de la Subclase Perro

    public Perro(String nombre, int edad, String dni, String sexo, String raza, String color) {
        super(nombre, edad, dni, sexo);
        this.raza = raza;
        this.color = color;
    }

    public Perro(String nombre, int edad, String dni, String raza, String color) {
        super(nombre, edad, dni);
        this.raza = raza;
        this.color = color;
    }

    public Perro(String nombre, int edad, String raza, String color) {
        super(nombre, edad);
        this.raza = raza;
        this.color = color;
    }

    public Perro(String nombre, String raza, String color) {
        super(nombre);
        this.raza = raza;
        this.color = color;
    }

    public Perro(String raza, String color) {
        this.raza = raza;
        this.color = color;
    }

}
