package EjerciciosJavaT4;

import java.util.Scanner;

public class T4E3SueldoSemanal {
    public static void main(String[] args) {
        /**
         * 
         * 3. Ampliamos un ejercicio de la relación anterior para considerar las horas
         * extras.
         * Escribe un programa que calcule el salario semanal de un trabajador teniendo
         * en cuenta que las horas ordinarias (40 primeras horas de trabajo) se pagan a
         * 12 euros la hora.
         * A partir de la hora 41, se pagan a 16 euros la hora.
         */

        // Inicializamos el Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero de horas trabajadas durante la semana: ");
        int horaTrabajadas = sc.nextInt();

        // Declaramos las variables
        int sueldoSemanal;

        if (horaTrabajadas <= 40) {
            sueldoSemanal = (horaTrabajadas * 12);
        } else {
            sueldoSemanal = (12 * 40) + (horaTrabajadas - 40) * 16;

        }

        // Mostramos el mensaje resultante
        System.out.println("El sueldo semanal que le corresponde es " + sueldoSemanal + " €");
        sc.close();

    }

}
