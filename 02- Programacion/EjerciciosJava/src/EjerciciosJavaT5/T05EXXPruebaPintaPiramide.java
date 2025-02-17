package EjerciciosJavaT5;

import java.util.Scanner;

public class T05EXXPruebaPintaPiramide {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca por pantalla un numero: ");
        int entrada = sc.nextInt();
        sc.nextLine();
        System.out.println("\n");

        for (int i = 1; i <= entrada; i++) {

            String piramide = "";
            String espacioBlanco = "";

            for (int j = 1; j <= (entrada - i); j++) {
                espacioBlanco += " ";
            }
            for (int j = 1; j < i; j++) {
                piramide += "*";
            }
            // System.out.println(" porque no imprime esta linea ");
            System.out.println(espacioBlanco + "*" + piramide + piramide);

        }
        sc.close();
    }
}
