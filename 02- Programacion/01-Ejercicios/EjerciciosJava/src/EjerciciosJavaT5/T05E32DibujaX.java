package EjerciciosJavaT5;

import java.util.Scanner;

public class T05E32DibujaX {

    public static void main(String[] args) {

        // Inicializamos el Scanenr
        Scanner sc = new Scanner(System.in);

        // Introducimos los parámetros por pantalla
        System.out.println("Introduzca la altura de la X: ");
        int altura = sc.nextInt();
        sc.nextLine();
        System.out.println("\n");

        // Declaramos variables

        int lonEspacioExterior = (altura / 2) + 1;
        String espacioExterior = "";
        String figuraX = "";

        // Pintamos espacios interiores
        for (int i = 1; i < lonEspacioExterior; i++) {
            espacioExterior += " ";
            figuraX += "*";
            System.out.println(espacioExterior + figuraX);
        }

        sc.close();
    }
}
