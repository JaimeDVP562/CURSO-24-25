package EjerciciosJavaT5;

import java.util.Scanner;

public class T05E16PiramideSolidaPrueba2 {
    public static void main(String[] args) {
        // Declaraciones
        String relleno = "";
        int altura = 0;
        Scanner sc = new Scanner(System.in);
        // Entrada po teclado de la altura
        while (altura <= 0) {
            try {
                System.out.print("Introduzca altura de la pirámide: ");
                altura = sc.nextInt();
                if (altura <= 0) {
                    System.out.println("ERROR: La altura debe ser un entero positivo");
                }
            } catch (Exception e) {
                System.out.println("ERROR: La altura debe ser un entero positivo");
            } finally {
                sc.nextLine();
            }
        }
        // Entrada por teclado del carácter de relleno
        while (relleno.length() != 1) { // Decaramos que la longitud del caracter introducido no supere la longitud que
                                        // hemos establecido
            System.out.print("Introduzca el carácter de relleno: ");
            relleno = sc.nextLine();
            if (relleno.length() != 1) {
                System.out.println("ERROR: El carácter de relleno debe ser de longitud 1");
            }
        }
        // Cerrar Scanner
        sc.close();

        // Lee de teclado hasta que el número sea negativo

        int i = 0;
        // int base = altura * 2;
        // int espacioBlanco = base / 2;

        while (i < altura) {
            // Declara variable

            i++;
            System.out.println(" ");
            System.out.println(relleno);
        }

    }

}
