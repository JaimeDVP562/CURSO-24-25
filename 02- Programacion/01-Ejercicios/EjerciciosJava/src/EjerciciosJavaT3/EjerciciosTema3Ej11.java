package EjerciciosJavaT3;

import java.util.Scanner;

public class EjerciciosTema3Ej11 {
    public static void main(String[] args) {

        Scanner floatScanner = new Scanner(System.in);

        System.out.println("Introduzca la cantidad de Kb que desea convertir a Mb: "); // Esta linea nos pide por
                                                                                       // pantalla que introduzcamos un
                                                                                       // numero
        float valueKb = floatScanner.nextFloat(); // Esta linea pasa a entero el numero que hemos introducido por
                                                  // pantalla

        int factor = 1024; // Fijamos el precio de la hora
        double totalValue = valueKb / factor;

        System.out.println("Ejercicio 10");
        System.out.println("---------------");
        System.out.println(valueKb + " Kb son " + totalValue + " Mb.");

        /*
         * System.out.println("---------------");
         * System.out.printf("%.2f",valueKb, " Mb son: ", "%.2f", totalValue, "Kb");
         */

        // Cerramos el scanner IMPORTANTE!!!
        floatScanner.close();
    }

}
