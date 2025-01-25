package EjerciciosJavaT3;

import java.util.Scanner;

public class EjerciciosTema3Ej10 {
    public static void main(String[] args) {

        Scanner floatScanner = new Scanner(System.in);

        System.out.println("Introduzca la cantidad de Mb que desea convertir a Kb: "); // Esta linea nos pide por
                                                                                       // pantalla que introduzcamos un
                                                                                       // numero
        float valueMb = floatScanner.nextFloat(); // Esta linea pasa a entero el numero que hemos introducido por
                                                  // pantalla

        int factor = 1024; // Fijamos el precio de la hora
        double totalValue = valueMb * factor;

        System.out.println("Ejercicio 10");
        System.out.println("---------------");
        System.out.println(valueMb + " Mb son " + totalValue + " Kb.");
        System.out.println("---------------");
        System.out.printf("%.2f", valueMb, " Mb son: ", "%.2f", totalValue, "Kb");

        // Cerramos el scanner IMPORTANTE!!!
        floatScanner.close();
    }

}
