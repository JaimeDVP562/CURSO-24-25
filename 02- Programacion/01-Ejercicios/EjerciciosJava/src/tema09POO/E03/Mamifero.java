package tema09POO.E03;

public class Mamifero extends Animal {

    public Mamifero(String nombre) {
        super(nombre);
    }

    public String amamantar() {
        return "estoy amamantando a mis crias";
    }
}
