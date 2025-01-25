package examen1;

import java.util.Scanner;

public class ejercicio06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("TANGO MODAS");
        System.out.println("Introduce código de artículo: "); // Esta linea nos pide por pantalla que introduzcamos un
                                                              // numero
        float codArticulo = sc.nextFloat();

        System.out.println("Introduce precio: "); // Esta linea nos pide por pantalla que introduzcamos un numero
        float precio = sc.nextFloat();

        System.out.println("Introduce unidades vendidas: "); // Esta linea nos pide por pantalla que introduzcamos un
                                                             // numero
        float unidadesVendidas = sc.nextFloat();

        System.out.println("Introduce descuento (%): "); // Esta linea nos pide por pantalla que introduzcamos un numero
        float descuento = sc.nextFloat();

        // En esta linea declaramos las variables que vamos a utilizar

        double sinDescuento = precio * unidadesVendidas;
        double precioDescuento = sinDescuento * ((100 - descuento) / 100);
        double IVA = precioDescuento * 0.16;
        double total = precioDescuento + IVA;

        System.out.println("Su tiket: \n");
        System.out.println("TANGO MODAS");
        System.out.println("---------------");
        System.out.println("---------------\t");
        System.out.println(codArticulo + "\t\t" + precio + " euros");
        System.out.println((unidadesVendidas + " unidades\t\t " + sinDescuento) + " euros");
        System.out.println(" -" + descuento + " %\t\t" + "  -" + descuento + " euros");
        System.err.println("16% IVA\t\t " + IVA);
        System.out.println("---------------");
        System.out.println(("TOTAL\t\t") + "\033[48;5;7m" + total + " euros\033[0m\n");

        sc.close();
    }

}

/**
 * TANGO MODAS
 * ==============================
 * Introduce código de artículo: 235643
 * Introduce precio: 15.50
 * Introduce unidades vendidas: 3
 * Introduce descuento (%): 10
 * 
 * Su ticket:
 * 
 * TANGO MODAS
 * ==============================
 * 235643 15,50€
 * 3 unidades 46,50€
 * -10% -4,65€
 * 16% IVA +7,44€
 * TOTAL 49,29€
 * 
 * 
 * System.out.println("Ejercicio 07");
 * System.out.println("---------------");
 * System.out.println("Ejemplo:");
 * System.out.printf("Base imponible:\t\t%.2f\n", baseImponible);
 * System.out.printf("IVA (21%%):\t\t%.2f\n", iva);
 * System.out.println("---------------");
 * System.out.printf("Total:\t\t%.2f\n", total);
 * 
 */