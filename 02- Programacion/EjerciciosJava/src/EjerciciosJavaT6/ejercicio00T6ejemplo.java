package EjerciciosJavaT6;

import java.util.Random;

public class ejercicio00T6ejemplo {
    public static void main(String[] args) {
        /**
         * 
         * Supongamos que necesitamos el intervalo [3,7)
         * Lo hacemos paso a paso, partiendo del intervalo
         * 
         */
        // Paso 1:
        System.out.println(Math.random());

        // Paso 2:
        System.out.println(Math.random() * 4);

        // Paso 3: [3, 7)
        System.out.println((int) ((Math.random() * 5) + 3));

        /**
         * Caso práctico
         * 
         * Para simular el lanzamiento de un dado, necesitamos obtener
         * un numero aleatorio en el intervalo ^[1,69]
         * 
         */

        final int CARAS_DADO = 6;
        final int CARAS_DADO_ROL = 12;

        System.out.println("Lanzamiento de dado 6 caras: " + (int) +(Math.random() * +CARAS_DADO + 1));
        System.out.println("Lanzamiento de dado 12 caras: " + (int) +(Math.random() * +CARAS_DADO_ROL + 1)); // Siempre
                                                                                                             // tenemos
                                                                                                             // que
                                                                                                             // poner en
                                                                                                             // el
                                                                                                             // intervalo
                                                                                                             // un
                                                                                                             // número
                                                                                                             // más del
                                                                                                             // que
                                                                                                             // queremos
                                                                                                             // que
                                                                                                             // llegue

        /**
         * 
         * ALTERNATIVA: Clase random
         */

        // Dado de 12 caras
        Random rand = new Random();

        System.out.println("Lanzamiento de dado con clases Random: " + (rand.nextInt(CARAS_DADO_ROL) + 1));

        // Intervalo de [3,7]
        System.out.println("Lanzamiento de dado con clases Random: (en un intervalo [3,7]) " + rand.nextInt(5) + 3);

    }
}
