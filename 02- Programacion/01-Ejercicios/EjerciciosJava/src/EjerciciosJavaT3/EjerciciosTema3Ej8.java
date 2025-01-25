package EjerciciosJavaT3;

import java.util.Scanner;

public class EjerciciosTema3Ej8 {
    public static void main(String[] args) {

        Scanner floatScanner = new Scanner(System.in);

        System.out.println("Introduzca la cantidad de horas trabajadas: "); // Esta linea nos pide por pantalla que
                                                                            // introduzcamos un numero
        float horasTrabajadas = floatScanner.nextFloat(); // Esta linea pasa a entero el numero que hemos introducido
                                                          // por pantalla

        double precioHora = 12; // Fijamos el precio de la hora
        double precioTotal = horasTrabajadas * precioHora;

        System.out.println("Ejercicio 08");
        System.out.println("---------------");
        System.out.println("Su salario semanal es de: " + precioTotal + " euros.");

        // Cerramos el scanner IMPORTANTE!!!
        floatScanner.close();
    }

}
