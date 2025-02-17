package tema09POO.E03;

public class Animal {
    // Declaramos las variables (atributos) de la clase
    String nombre;
    int edad;
    String dni;
    String sexo;

    // Constructos de la clase con todos los parámetros
    public Animal(String nombre, int edad, String dni, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
    }

    // Constructos de la clase con tres parámetros
    public Animal(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = "No especificado";
    }

    // Constructos de la clase con dos parámetros
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = "No especificado";
        this.sexo = "No especificado";
    }

    // Constructos de la clase un parámetro
    public Animal(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
        this.dni = "No especificado";
        this.sexo = "No especificado";
    }

    // Constructos de la clase vacío
    public Animal() {
        this.nombre = "Desconocido";
        this.edad = 0;
        this.dni = "No especificado";
        this.sexo = "No especificado";
    }

    // Creamos los Getters y Setters de la clase
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
