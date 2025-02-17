package tema7Arrays;

import java.util.Random;

public class T07E10 {

    /**
     * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y
     * que los almacene en un array. El programa debe ser capaz de pasar todos los
     * números pares a las primeras posiciones del array (del 0 en adelante) y todos
     * los números impares a las celdas restantes. Utiliza arrays auxiliares si es
     * necesario.
     * 
     */
    public static void main(String[] args) {

        // Declaramos las variables
        String arrayOriginal = "";
        String par = "";
        String impar = "";

        // Declaramos el array de enteros de los 20 números
        int[] numeros = new int[20];

        // Rellenamos el array con 20 números random
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = new Random().nextInt(100);
            arrayOriginal += " " + numeros[i];
        }

        // Pintamos el array original
        System.out.println("Array original: ");
        System.out.println(arrayOriginal);

        // Rellenamos los arrays de los numeros pares e impares
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                par += " " + numeros[i];
            } else {
                impar += " " + numeros[i];
            }
        }

        // Pintamos el array con los numeros pares delante
        System.out.println("Array con los numeros pares delante: ");
        System.out.println(par + impar);
    }
}
