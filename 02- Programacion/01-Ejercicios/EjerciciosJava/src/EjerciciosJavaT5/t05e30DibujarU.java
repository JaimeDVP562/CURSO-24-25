package EjerciciosJavaT5;

import java.util.Scanner;

public class t05e30DibujarU {
    public static void main(String[] args) {
        // Declaraciones
        int altura = 0;
        Scanner sc = new Scanner(System.in);
        // Lee altura de teclado
        System.out.print("Introduzca altura de la L: ");
        altura = sc.nextInt();
        // Longitud palo horizontal
        int longPaloHorizontal = (altura / 2) + 1;
        int espacioHorizontal = (altura / 2) + 1;
        // Creamos palo horizontal
        String sPaloHorizontal = "";
        for (int i = 0; i < longPaloHorizontal; i++) {
            sPaloHorizontal += "* ";
            // espacioHorizontal += "";
        }
        // Pintamos el palo vertical
        for (int i = 0; i < altura - 1; i++) {
            System.out.println("*" + espacioHorizontal + "*");
        }
        // Pintamos el palo horizonal
        System.out.println(sPaloHorizontal);
        // Cerramos Scanner
        sc.close();
    }
}
