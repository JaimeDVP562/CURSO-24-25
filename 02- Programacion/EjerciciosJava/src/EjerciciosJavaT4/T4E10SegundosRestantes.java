package EjerciciosJavaT4;

import java.util.Scanner;

public class T4E10SegundosRestantes {

    public static void main(String[] args) {
        /**
         * Escribe un programa que dada una hora determinada (horas, minutos), calcule
         * los segundos que quedan para llegar a medianoche (00:00).
         */
        // Inicializamos el Scanner
        Scanner sc = new Scanner(System.in);

        // Declaramos las variables
        System.err.println("Introduzca la hora: ");
        int horas = sc.nextInt();
        sc.nextLine();

        System.err.println("Introduzca los minutos: ");
        int minutos = sc.nextInt();
        sc.nextLine();

        double segundosSuma = (horas * 3600) + (minutos * 60);
        double segundosDia = 24 * 3600;
        double segundosRestantes = segundosDia - segundosSuma;

        System.out
                .println("Desde las " + horas + ":" + minutos + " hasta medianoche faltan " + segundosRestantes
                        + " segundos.");

        sc.close();

    }

}
