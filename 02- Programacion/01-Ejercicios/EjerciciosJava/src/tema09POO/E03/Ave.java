package tema09POO.E03;

public class Ave {
    public String nombre;

    public Ave(String nombre) {
        this.nombre = nombre;
    }

    public String volar() {
        return "esta volando";
    }

    public String ponerHuevos() {
        return "esta poniendo huevos";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

}
