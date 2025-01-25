package EjerciciosJavaT4;

import java.util.Scanner;

public class T4E4EcuacionPrimerGrado {
    public static void main(String[] args) {
        /**
         * Realiza un programa que resuelva una ecuacion de primer grado del tipo
         * (ax + b = 0)
         * 
         */
        // Inicializamos el Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("El programa resuelve ecuaciones de primer grado (ax + b = 0)\t");
        System.out.println("Ahora introduzca el valor de a: ");

        // Declaramos las variable a
        float valorDeA = sc.nextInt();

        System.out.println("Ahora introduzca el valor de b: ");

        // Declaramos las variable b
        float valorDeB = sc.nextInt();

        float resultado = -(valorDeB / valorDeA);

        System.out.println(resultado);
        sc.close();
    }

}
