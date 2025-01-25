package EjerciciosJavaT4;

import java.util.Scanner;

public class T4E8EcuacionSegundoGrado {

    public static void main(String[] args) {

        /**
         * 
         * Realiza un programa que resuelva una ecuación de segundo grado del tipo (ax2
         * + bx + c =0)
         * 
         * 
         * 
         */

        // Inicializamos el Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa resuelve ecuaciones de segundo grado.\nIntroduce los valores: ");
        System.out.println("Introduce el valor de a: ");
        double a = sc.nextDouble();

        System.out.println("Introduce el valor de b: ");
        double b = sc.nextDouble();

        System.out.println("Introduce el valor de c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.err.println("La ecuación no tiene solución.");
        } else {
            double discriminante = Math.pow(b, 2) - (4 * a * c);

            if (discriminante < 0) {
                System.err.println("La ecuación no tiene soluciones reales.");

            } else if (discriminante > 0) {
                double resultadoPositivo = (-b + Math.sqrt(discriminante)) / (2 * a);
                double resultadoNegativo = (-b - Math.sqrt(discriminante)) / (2 * a);

                // Imprimimos por pantalla el resultado en caso de que si tuviese solución real
                System.out.println("x1: " + resultadoPositivo);
                System.out.println("x2: " + resultadoNegativo);
            }

        }
        sc.close();
    }

}
