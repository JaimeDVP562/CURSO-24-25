package EjerciciosJavaT4;

import java.util.Scanner;

public class T4PruebaSentenciasEncadenadas {
    public static void main(String[] args) {

        Scanner entradaScanner = new Scanner(System.in);
        System.out.println("Introduzca una longitud en metros: "); // Esta linea nos pide por pantalla que introduzcamos
                                                                   // un numero
        int nota = Integer.parseInt(entradaScanner.nextLine());

        // Sentencias de seleccion encadenadas
        if (nota < 5) {
            System.out.println("Suspenso");
        } else if (nota == 5) {
            System.out.println("Aprobado");
        } else if (nota == 6) {
            System.out.println("Bien");
        } else if (nota == 7) {
            System.out.println("Notable");
        } else if (nota == 8) {
            System.out.println("Notable");
        } else if (nota == 9) {
            System.out.println("Sobresaliente");
        } else if (nota == 10) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("Nota inválida. ");
        }

        System.out.println("Vamos a empezar con las pruebas del repositorio");

        entradaScanner.close();
    }
}
