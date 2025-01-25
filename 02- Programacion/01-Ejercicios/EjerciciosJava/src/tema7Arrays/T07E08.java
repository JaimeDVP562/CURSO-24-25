package tema7Arrays;

import java.util.Scanner;

public class T07E08 {
    /**
     * Realiza un programa que pida la temperatura media que ha hecho en cada mes de
     * un determinado año y que muestre a continuación un diagrama de barras
     * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
     * de asteriscos o cualquier otro carácter.
     */
    public static void main(String[] args) {

        // Inicializamos el Scanner
        Scanner sc = new Scanner(System.in);

        // Declaramos arrays de String para los meses
        String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
                "Octubre", "Noviembre", "Diciembre" };

        // Declaramos un array de enteros para las temperaturas
        int[] temperaturas = new int[12];

        // Dibujamos la barra de la temperatura
        String barra = "";
        // Pedimos que introduzca la temperatura de cada mes
        for (int i = 0; i < meses.length; i++) {
            System.out.println("Introduzca la temperatura media de " + meses[i] + " : ");
            temperaturas[i] = sc.nextInt();

        }
        // Imprimimos el diagrama de barras
        for (int i = 0; i < meses.length; i++) {
            for (int j = 0; j < temperaturas[i]; j++) {
                barra += "*";
            }
            System.out.println(meses[i] + " : " + barra);
            barra = "";
        }
        // Cerramos el Scanner
        sc.close();
    }
}
