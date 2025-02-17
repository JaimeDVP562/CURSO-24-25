package EjerciciosJavaT3;

import java.util.Scanner;

public class EjerciciosTema3Ej9 {
    public static void main(String[] args) {

        Scanner floatScanner = new Scanner(System.in);

        System.out.println("Introduzca la altura: "); // Esta linea nos pide por pantalla que introduzcamos un numero
        float altura = floatScanner.nextFloat();
        // Esta linea pasa a entero el numero que hemos introducido por pantalla
        System.out.println("Introduzca el radio de la base: "); // Esta linea nos pide por pantalla que introduzcamos un
                                                                // numero
        float radioBase = floatScanner.nextFloat(); // Esta linea pasa a entero el numero que hemos introducido por
                                                    // pantalla

        double numeroPi = 3.14;
        double total = (1.d / 3.d) * (numeroPi) * (radioBase * radioBase) * altura;

        System.out.println("El volumen del cono es: " + total + " cm cuadrados");

        System.out.printf("El volumen del cono es: %.2f", total, " cm cuadrados");

        floatScanner.close();
    }

}
