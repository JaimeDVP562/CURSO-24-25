package EjerciciosJavaT3;

import java.util.Scanner;

public class EjerciciosTema3Ej12 {
    public static void main(String[] args) {

        Scanner floatScanner = new Scanner(System.in);

        System.out.println("Introduzca la nota del primer examen: "); // Esta linea nos pide por pantalla que
                                                                      // introduzcamos un numero
        float nota1 = floatScanner.nextFloat();
        // Esta linea pasa a entero el numero que hemos introducido por pantalla
        System.out.println("¿Que nota quiere sacar en el trimestre?"); // Esta linea nos pide por pantalla que
                                                                       // introduzcamos un numero
        float notaEsperada = floatScanner.nextFloat(); // Esta linea pasa a entero el numero que hemos introducido por
                                                       // pantalla

        double notaPrimerExamen = nota1 * 0.40;
        double notaSegundoExamen = 0.60 * ((notaEsperada * 2) + notaPrimerExamen);

        System.out
                .println("Para obtener un " + notaEsperada + " en el trimestre necesita sacar un " + notaSegundoExamen);

        // Cerramos el scanner IMPORTANTE!!!
        floatScanner.close();
    }

}
