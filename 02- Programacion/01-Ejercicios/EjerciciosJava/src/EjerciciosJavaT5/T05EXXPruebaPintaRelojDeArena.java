package EjerciciosJavaT5;

import java.util.Scanner;

public class T05EXXPruebaPintaRelojDeArena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca por pantalla un numero: ");
        int entrada = sc.nextInt();
        sc.nextLine();
        System.out.println("\n");
        int altura = entrada / 2;

        // Pinta piramide invertida
        for (int i = 1; i <= altura; i++) {

            String piramide = "";
            String espacioBlanco = "";

            for (int j = 1; j <= (altura - i); j++) {
                piramide += "*";
            }
            for (int j = 1; j < i; j++) {
                espacioBlanco += " ";
            }
            // System.out.println(" porque no imprime esta linea ");
            System.out.println(espacioBlanco + "*" + piramide + piramide);

        }

        // Pinta piramide
        for (int i = 1; i <= altura; i++) {

            String piramide2 = "";
            String espacioBlanco2 = "";

            for (int j = 1; j <= (altura - i); j++) {
                espacioBlanco2 += " ";
            }
            for (int j = 1; j < i; j++) {
                piramide2 += "*";
            }

            System.out.println(espacioBlanco2 + "*" + piramide2 + piramide2);
        }
        sc.close();
    }
}
