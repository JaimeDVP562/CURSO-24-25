package tema09POO.E02;

public class Caballo extends Animal {
    String raza;
    String color;

    public Caballo(String color, String raza) {
        this.color = color;
        this.raza = raza;
    }

    public Caballo(String color, String raza, String nombre) {
        super(nombre);
        this.color = color;
        this.raza = raza;
    }

    public Caballo(String color, String raza, String nombre, int edad) {
        super(nombre, edad);
        this.color = color;
        this.raza = raza;
    }

    public Caballo(String color, String raza, String nombre, int edad, String dni) {
        super(nombre, edad, dni);
        this.color = color;
        this.raza = raza;
    }

    public Caballo(String color, String raza, String nombre, int edad, String dni, String sexo) {
        super(nombre, edad, dni, sexo);
        this.color = color;
        this.raza = raza;
    }

}
