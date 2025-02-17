package EjerciciosJavaT5;

import java.util.Scanner;

public class T05E36PruebaNumeroJuntoConSuFactorial {

    public static void main(String[] args) {
        /**
         * Escribe un programa que pida un número entero positivo por teclado y que
         * muestre a continuación los números desde el 1 al número introducido junto con
         * su factorial.
         * 
         * Ejemplo I:
         * Introduce un número entero positivo: 7
         * 1! = 1
         * 2! = 2
         * 3! = 6
         * 4! = 24
         * 5! = 120
         * 6! = 720
         * 7! = 5040
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero positivo: ");
        int entrada = sc.nextInt();
        sc.nextLine();
        System.out.println("\n");

        if (entrada < 0) {
            System.out.println("ERROR: El numero introducido no es entero.");
        } else {

            // Declara variable
            int resultado = 1;

            for (int i = 1; i <= entrada; i++) {
                // Declara variable
                resultado *= i;
                System.out.println(i + "! = " + resultado);
            }

        }
        sc.close();

    }
}
