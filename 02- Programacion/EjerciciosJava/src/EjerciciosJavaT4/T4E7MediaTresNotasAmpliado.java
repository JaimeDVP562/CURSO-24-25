package EjerciciosJavaT4;

import java.util.Scanner;

public class T4E7MediaTresNotasAmpliado {

    public static void main(String[] args) {

        /**
         * 
         * Escribe un programa que calcule la media de tres notas introducidas por
         * teclado e introduzca en el boletin si es: insuficiente, aprobado, bien,
         * notable, sobresaliente.
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

        if (resultado <= 4) {
            System.out.println("Suspenso;(");
        } else if (resultado == 5) {
            System.out.println("Aprobado;)");
        } else if (resultado == 6) {
            System.out.println("Bien;)");
        } else if (resultado > 7 && resultado < 8) {
            System.out.println("Notable;)");
        } else if (resultado <= 9 && resultado >= 10) {
            System.out.println("Sobresaliente;)");
        } else {
            System.out.println("\033[1mLa nota introducida es incorrecta;(\033[0m");
        }

        System.out.printf("La media es de %.2f ", resultado); // Imprimimos el dato con dos decimales
        sc.close();

    }

}
