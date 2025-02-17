package EjerciciosJavaT4;

import java.util.Scanner;

public class T4E6MediaTresNotas {
    public static void main(String[] args) {
        /**
         * 
         * Escribe un programa que calcule la media de tres notas introducidas por
         * teclado
         * 
         * 
         */

        // Inicializamos el Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca al primera nota: "); // Pedimos al usuario que introduzca el dato
        double nota1 = sc.nextDouble();

        System.out.println("Introduzca al segunda nota: "); // Pedimos al usuario que introduzca el dato
        double nota2 = sc.nextDouble();

        System.out.println("Introduzca al tercera nota: "); // Pedimos al usuario que introduzca el dato
        double nota3 = sc.nextDouble();

        // Declaramos las variables
        double resultado = (nota1 + nota2 + nota3) / 3;

        System.out.printf("La media es de %.2f ", resultado); // Imprimimos el dato con dos decimales
        sc.close();
    }

}
