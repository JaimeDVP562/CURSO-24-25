package tema09POO;

public class Gato {

    String color;
    String raza;
    String sexo;
    int edad;
    double peso;

    /**
     * Constructor simple.
     *
     * @param sexo sexo del gato
     */
    public Gato(String sexo) {
        this.sexo = sexo;
    }

    /**
     * Constructor completo.
     *
     * @param color color del pelaje del gato
     * @param raza raza del gato
     * @param sexo sexo del gato
     * @param edad edad del gato
     * @param peso peso del gato
     */
    public Gato(String color, String raza, String sexo, int edad, double peso) {
        this.color = color;
        this.raza = raza;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
    }

    public Gato(String color, int edad, double peso, String raza, String sexo) {
        this.color = color;
        this.edad = edad;
        this.peso = peso;
        this.raza = raza;
        this.sexo = sexo;
    }

}
