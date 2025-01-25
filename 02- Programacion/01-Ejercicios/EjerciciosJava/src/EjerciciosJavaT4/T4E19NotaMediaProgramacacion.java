package EjerciciosJavaT4;

import java.util.Scanner;

public class T4E19NotaMediaProgramacacion {
    public static void main(String[] args) {
        /**
         * 
         * Calcula la nota de un trimestre de la asignatura Programación. El programa
         * pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
         * Si la media de los dos controles da un número mayor o igual a 5, el alumno
         * está aprobado y se mostrará la media. En caso de que la media sea un número
         * menor que 5, el alumno habrá tenido que hacer el examen de recuperación que
         * se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
         * ha sido el resultado de la recuperación? (apto/no apto). Si el resultado de
         * la recuperación es apto, la nota será un 5; en caso contrario, se mantiene la
         * nota media anterior.
         * 
         * 
         * Ejemplo I:
         * Nota del primer examen: 7
         * Nota del segundo examen: 10
         * Tu nota en programación es 8.5
         * 
         * Ejemplo II:
         * Nota del primer examen: 6
         * Nota del segundo examen: 3
         * ¿Cuál ha sido el resultado de la recuperación? (apto/no apto): no apto
         * Tu nota en programación es 4.5
         *
         */

        // Inicializamos el Scanenr
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario que introduzca los datos
        System.out.println("Nota del primer examen: ");
        float primerExamen = sc.nextFloat();
        System.out.println("Nota del segundo examen: ");
        float segundoExamen = sc.nextFloat();

        // Limpiar el buffer
        sc.nextLine(); // Consume el salto de línea sobrante -----IMPORTANTE LIMPIAR EL CARÁCTER
                       // SOBRANTE

        // Declaramos las variables
        float media = (primerExamen + segundoExamen) / 2;

        // Creamos la sentencia de seleccion
        if (media >= 5) {
            System.out.println(" Tu nota en programación es " + media);
        } else {

            // Pide al usuario la nota de la recuperación
            System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            String recuperacion = sc.nextLine().trim().toLowerCase();

            // Declaracion de variables
            String apto = "apto";
            String noApto = "no apto";
            // Sentencia de seleccion
            if (recuperacion.equals(apto)) {
                System.out.println(" Enhorabuena has aprobado en la recuperación.");
                System.out.println("Enhorabuena tu nota en programación es 5. ");
            } else if (recuperacion.equals(noApto)) {
                System.out.println("Nos vemos en las recuperaciones, tu nota es " + media);
            }
        }
        sc.close();
    }
}
