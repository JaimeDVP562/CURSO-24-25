package tema7Arrays;

import java.util.Random;

public class PruebaRellenoRandom {
    public static void main(String[] args) {

        // Declaramos un Array de enteros
        int[] lista = new int[10];
        Random rand = new Random();

        // Declaramos el tamaño del Array
        int[] array9 = new int[9];

        // Declaramos el tamaño del Array bidimensional
        String[][] tresEnRaya = new String[3][3];

        // Declaramos los valores del Array bidimensional
        tresEnRaya[0][0] = "O";
        tresEnRaya[2][2] = "X";

        // Recorremos el Array de la lista para ver sus valores con los valores random
        // que le hemos introducido

        for (int i = 0; i < lista.length; i++) {
            lista[i] = rand.nextInt();
        }

        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }

        // Declaramos otro Array de enteros para crear una tabla
        /**
         * int fila;
         * int columna;
         * int[][] tabla = {
         * { 8, -12, 33 },
         * { 14, 1, -24 },
         * { 100, 51, 69 }
         * };
         *
         * System.out.println("El array tiene 3 filas y 3 columnas.");
         * System.out.print("Introduzca la fila de 0 a 2: ");
         * fila = Integer.parseInt(System.console().readLine());
         *
         * System.out.print("Introduzca la columna de 0 a 2: ");
         * columna = Integer.parseInt(System.console().readLine());
         *
         * System.out.printf("El elemento que se encuentra en la posición [%i,%i] es
         * %i\n",
         * fila, columna, tabla[fila][columna]);
         *
         */

    }
}