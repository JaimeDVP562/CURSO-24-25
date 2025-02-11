package clases;

public class Perro extends Mascota {

    public int totalPerros = 0;

    // Generamos constructores
    public Perro(String chip, int edad, String raza, int totalPerros) {
        super(chip, edad);
        this.raza = raza;
        this.totalPerros = totalPerros;
    }

    public Perro(String chip, int edad, String raza) {
        super(chip, edad);
        this.raza = raza;
    }

    public Perro(String chip, int edad) {
        super(chip, edad);
    }

    public Perro(String chip, String nombre) {
        super();
    }

    // Generamos GETTERS
    @Override
    public String getRaza() {
        return raza;
    }

    public int getTotalPerros() {
        return totalPerros;
    }

    // Generamos SETTERS
    public void setTotalPerros(int totalPerros) {
        this.totalPerros = totalPerros;
    }

    @Override
    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro";
    }

}
