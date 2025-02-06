package clases;

public class Mascota {

    String chip;
    String nombre;
    int edad;
    String raza;
    boolean vacunada;

    public Mascota() {
    }

    public Mascota(String chip, int edad, String nombre, String raza) {
        this.chip = chip;
        this.edad = edad;
        this.nombre = nombre;
        this.raza = raza;
    }

    public Mascota(String chip, int edad, String nombre) {
        this.chip = chip;
        this.edad = edad;
        this.nombre = nombre;
    }

    public Mascota(String chip, int edad) {
        this.chip = chip;
        this.edad = edad;
    }

    public Mascota(String chip) {
        this.chip = chip;
    }

    // Generamos los SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setVacunada(boolean vacunada) {
        this.vacunada = vacunada;
    }

    // Generamos los GETTERS
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getChip() {
        return chip;
    }

    public String getRaza() {
        return raza;
    }

    // Creamos los métodos
    public boolean vacunar() {
        return vacunada;
    }

    @Override
    public String toString() {
        return "Mascota [ chip=]" + chip + ", nombre " + nombre + ", edad " + edad + ", raza " + raza;
    }

    public void pasear() {
        System.out.println("Vamos de paseo al parque");

    }

}
