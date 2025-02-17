package EjerciciosJavaT3;

import java.util.Scanner;

public class EjerciciosTema3Ej7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un numero de años: "); // Esta linea nos pide por pantalla que introduzcamos un
                                                              // numero
        float baseImponible = sc.nextFloat(); // Esta linea pasa a entero el numero que hemos introducido por pantalla

        double porcentajeIVA = 0.21;
        double iva = porcentajeIVA * baseImponible;
        double total = iva + baseImponible;

        System.out.println("Ejercicio 07");
        System.out.println("---------------");
        System.out.println("Total factura:");
        System.out.println(("Base imponible\t" + baseImponible));
        System.out.println(("IVA\t\t") + iva);
        System.out.println("---------------");
        System.out.println(("Total\t\t") + total + ("\n"));

        System.out.println("Ejercicio 07");
        System.out.println("---------------");
        System.out.println("Ejemplo:");
        System.out.printf("Base imponible:\t\t%.2f\n", baseImponible);
        System.out.printf("IVA (21%%):\t\t%.2f\n", iva);
        System.out.println("---------------");
        System.out.printf("Total:\t\t%.2f\n", total);

        sc.close();
    }

}
