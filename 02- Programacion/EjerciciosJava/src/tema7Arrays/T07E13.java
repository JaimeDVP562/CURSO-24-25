package tema7Arrays;

import java.util.Random;
import java.util.Scanner;

public class T07E13 {

    /**
     * 
     * Escribe un programa que rellene un array de 100 elementos con números enteros
     * aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación el
     * programa mostrará el array y preguntará si el usuario quiere destacar el
     * máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo el
     * número destacado entre dobles asteriscos.
     */

    public static void main(String[] args) {

        // Inicializamos el Scanner
        Scanner sc = new Scanner(System.in);

        // Declaramos las variables
        int opcion;

        // Declaramos un array de enteros
        int[] numeros = new int[100];

        // Rellenamos el array con números random
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = new Random().nextInt(500 + 1);
        }

        // Pintamos por pantalla el array original
        System.out.println("Array original: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // Preguntamos al usuario qué número desea destacar
        System.out.println("¿Qué número quiere destacar? (1 - mínimo, 2- máximo):");
        opcion = sc.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (opcion == 1) {

            } else {

            }

        }
    }
}
