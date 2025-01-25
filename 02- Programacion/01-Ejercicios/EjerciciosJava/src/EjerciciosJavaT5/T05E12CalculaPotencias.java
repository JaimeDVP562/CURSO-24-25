package EjerciciosJavaT5;

import java.util.Scanner;

public class T05E12CalculaPotencias {

    public static void main(String[] args) {
        /**
         * 
         * 
         * Escribe un programa que dados dos números, saque por pantalla todas las
         * potencias con base el primer número y exponentes entre uno y el segundo
         * número introducido. No se deben utilizar funciones de exponenciación como
         * Math.pow().
         * 
         * 
         */
        // Inicializamos el Scanner
        Scanner sc = new Scanner(System.in);

        // Declaramos las variables a utilizar
        System.out.println(" Introduzca la base: ");
        int base = sc.nextInt();
        sc.nextLine();
        System.out.println(" Introduzca el exponente máximo: ");
        int exponente = sc.nextInt();
        sc.nextLine();

        int i = 1; // Variable de control de bucle
        int resultado = 1;

        // Añadimos un espacio entre medias
        System.out.println("\n");

        // Realizamos el bucle
        while (i <= exponente) {

            resultado = resultado * base;
            System.out.println(base + "^" + i + " = " + resultado);
            i++; // Declaramos que cada vez que se ejecute el bucle, se sume uno mas al valor de
                 // i
        }
        sc.close();

    }

}
