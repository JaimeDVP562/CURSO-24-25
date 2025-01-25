package tema7Arrays;

import java.util.Random;
import java.util.Scanner;

public class T07E14 {

    /**
     * 
     * Escribe un programa que pida 8 palabras y las almacene en un array. A
     * continuación, las palabras correspondientes a colores se deben almacenar al
     * comienzo y las que no son colores a continuación. Puedes utilizar tantos
     * arrays auxiliares como quieras. Los colores que conoce el programa deben
     * estar en otro array y son los siguientes: verde, rojo, azul, amarillo,
     * naranja, rosa, negro, blanco y morado.
     */
    public static void main(String[] args) {

        // Inicializamos el Scanner
        Scanner sc = new Scanner(System.in);

        // Declaramos las variables
        String indice = "";
        String arrayOriginal = "";
        String arrayModificado = "";
        String arrayModificado2 = "";

        // Declaramos un array de enteros
        String[] palabras = new String[8];

        // Declaramos un array para comprobar los colores
        String[] coloresStrings = new String[9];

        // Rellenamos el array de String para la comprobación de colores
        coloresStrings[0] = "verde";
        coloresStrings[1] = "rojo";
        coloresStrings[2] = "azul";
        coloresStrings[3] = "amarillo";
        coloresStrings[4] = "naranja";
        coloresStrings[5] = "rosa";
        coloresStrings[6] = "negro";
        coloresStrings[7] = "blanco";
        coloresStrings[8] = "morado";

        // Pedimos al usuario que introduzca los valores
        System.out.println("Introduzca 8 palabras (vaya pulsando [INTRO] entre una y otra.\n");

        // Rellenamos el array con palabras
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Introduzca la palabra " + (i + 1));
            palabras[i] = sc.nextLine();
        }

        // Creamos el indice
        System.out.println("Índice: ");
        for (int i = 0; i < palabras.length; i++) {
            indice += i + " ";
        }
        System.out.println(indice);

        // Pintamos por pantalla el array original
        System.out.println("Array original: ");
        for (int i = 0; i < palabras.length; i++) {
            arrayOriginal += palabras[i] + " ";
        }
        System.out.println(arrayOriginal);

        // Comprobamos si las palabras introducidas coinciden con los colores
        for (int i = 0; i < palabras.length; i++) {

            boolean esColor = false;
            boolean noEsColor = false;

            for (int j = 0; j < coloresStrings.length; j++) {
                if (palabras[i].equalsIgnoreCase(coloresStrings[j])) {
                    esColor = true;
                    arrayModificado += palabras[i] + " ";
                    break; // Salimos del bucle interno porque ya sabemos que es un color
                } else {
                    arrayModificado2 += palabras[i] + " ";
                    noEsColor = true;
                    break;
                }

            }

        }
        // Pintamos el array modificado
        System.out.println("Array modificado");
        System.out.println(arrayModificado + arrayModificado2);

        // Cerramos el Scanner
        sc.close();
    }
}
