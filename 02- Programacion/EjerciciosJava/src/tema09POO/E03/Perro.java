package tema09POO.E03;

public class Perro extends Animal {
    // Creamos los atributos de la subclase Perro
    String raza;
    String color;

    public Perro() {
        super();
        this.raza = raza;
        this.color = color;
    }

    public Perro(String color, String raza) {
        this.color = color;
        this.raza = raza;
    }

    public Perro(String color, String raza, String nombre) {
        super(nombre);
        this.color = color;
        this.raza = raza;
    }

    public Perro(String color, String raza, String nombre, int edad) {
        super(nombre, edad);
        this.color = color;
        this.raza = raza;
    }

    public Perro(String color, String raza, String nombre, int edad, String dni) {
        super(nombre, edad, dni);
        this.color = color;
        this.raza = raza;
    }

    public Perro(String color, String raza, String nombre, int edad, String dni, String sexo) {
        super(nombre, edad, dni, sexo);
        this.color = color;
        this.raza = raza;
    }

    // Creamos los métodos de la subclase Perro
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
