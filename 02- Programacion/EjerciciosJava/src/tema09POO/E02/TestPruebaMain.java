package tema09POO.E02;

/**
 * Haz una lista con los atributos que podría tener la clase caballo. A
 * continuación haz una lista con los posibles métodos (acciones asociadas a los
 * caballos). Hecho esto implementa la clase Caballo y pruébala creando
 * instancias y aplica algunos métodos.
 * 
 * 
 * Ejemplo:
 * Hola, me llamo Babieca
 * Tocotoc tocotoc tocotoc
 * Hiiiiiiieeeeee
 * Hola, yo soy Lykos
 * Ñam ñam ñam
 * Tocotoc tocotoc tocotoc
 * 
 */

public class TestPruebaMain {

    public static void main(String[] args) {

        // Creamos las instancias para la clase caballo
        Caballo caballo1 = new Caballo("blanco", "Pura Sangre", "BABIECA", 12, " 31016512-a");

        System.out
                .println("Hola mi caballo se llama " + caballo1.nombre + " es de raza " + caballo1.raza + ", se llama "
                        + caballo1.nombre + ", su DNI es " + caballo1.dni);

    }
}
