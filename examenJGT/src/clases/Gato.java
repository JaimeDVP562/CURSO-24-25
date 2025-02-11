package clases;

public class Gato extends Mascota {

    private String pelaje;

    // Generamos los CONSTRUCTORES

    public Gato(String pelaje) {
        this.pelaje = pelaje;
    }

    public Gato(String pelaje, String chip, int edad) {
        super(chip, edad);
        this.pelaje = pelaje;
    }

    public Gato(String pelaje, String chip, int edad, String nombre) {
        super(chip, nombre, edad);
        this.pelaje = pelaje;
    }

    public Gato(String pelaje, String chip, int edad, String nombre, String raza) {
        super(chip, nombre, edad, raza);
        this.pelaje = pelaje;
    }

    public Gato(String chip, String nombre) {
        this.chip = chip;
        this.nombre = nombre;

    }

    // Generamos los GETTERS
    public String getPelaje() {
        return pelaje;
    }

    // Generamos los SETTERS
    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

}
