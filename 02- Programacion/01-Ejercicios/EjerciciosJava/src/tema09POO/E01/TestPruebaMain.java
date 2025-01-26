package tema09POO.E01;

/**
 * 
 * A continuación tienes una lista en la que están mezcladas varias clases con
 * instancias de esas clases. Para ponerlo un poco más difícil, todos los
 * elementos están escritos en minúscula. Di cuáles son las clases, cuáles las
 * instancias, a qué clase pertenece cada una de estas instancias y cuál es la
 * jerarquía entre las clases: paula, goofy, gardfiel, perro, mineral, caballo,
 * tom, silvestre, pirita, rocinante, milu, snoopy, gato, pluto, animal, javier,
 * bucefalo, pegaso, ayudantedesantaclaus, cuarzo, laika, persona, patolucas.
 */
public class TestPruebaMain {

    public static void main(String[] args) {
        // Creamos las instancias de las clases
        Persona persona1 = new Persona("Paula", 25, "12345678A", "Hombre");
        Perro perro1 = new Perro("Dogo", "azul");
        Perro perro2 = new Perro("Goofy", 2, null, "macho", "chihuahua", "amarillo");
        Gato gato1 = new Gato("Gardfiel", 0, "no sé", "verde");

        // Imprimimos por pantalla

        System.out.println("Instancia de la clase Persona: " + persona1.nombre);
        System.out.println(perro2.dni);

    }
}