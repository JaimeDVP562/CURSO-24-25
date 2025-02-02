package tema09POO.E03;

public class Lagarto {
    private String nombre;

    public Lagarto(String nombre) {
        this.nombre = nombre;
    }

    public void tomarElSol() {
        System.out.println("Estoy tomando el sol");
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

}
