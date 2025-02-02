package tema09POO.E03;

public class Canario extends Animal {
    public Canario(String nombre) {
        super(nombre);
    }

    public void canta() {
        System.out.println("pio pio pio");
    }

    public void vuela() {
        System.out.println("Volando voy");
    }

    public void come() {
        System.out.println("Comiendo alpiste");
    }

    public void duerme() {
        System.out.println("Zzzzzzzzzzzzzzzzzz");
    }
}
