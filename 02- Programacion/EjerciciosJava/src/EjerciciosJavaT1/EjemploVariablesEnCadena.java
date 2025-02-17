package EjerciciosJavaT1;

public class EjemploVariablesEnCadena {
    public static void main(String[] args) {
        String nombre = "Jaime";
        int edad = 28;

        /*
         * System.out.printf("Tengo %s años", 49); //Al ponerle el %s (para una cadena
         * de texto "string") lo que hacemos es que le indicamos que nos ponga una
         * cadena de texto que le ponemos luego en el argumento
         */
        System.out.println("Ejemplo 01 "); // Manera cutre de hacer un salto de linea
        System.out.printf("Me llamo %s y tengo %d años.\n", nombre, edad); // Al ponerle el %s (para una cadena de texto
                                                                           // "string") lo que hacemos es que le
                                                                           // indicamos que nos ponga una cadena de
                                                                           // texto que le ponemos luego en el argumento
                                                                           // Al ponerle el %d (para una numeros) lo que
                                                                           // hacemos es que le indicamos que nos ponga
                                                                           // un numero le ponemos luego en el argumento

        /*--------------------------------------------------- */
        /* Ejemplo con el System.out.println(); */
        System.out.println("Ejemplo 02 ");
        System.out.println("Me llamo " + nombre + (" y tengo ") + edad + ("años\n"));
        System.out.println(" "); // Manera cutre de hacer un salto de linea

        /*--------------------------------------------------- */
        /* Ejemplo */
        System.out.println("Ejemplo 03 ");
        System.out.println("Si queremos poner comillas dobles se hace esta manera \"entre comillas\"");

    }
}