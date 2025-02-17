package EjerciciosJavaT4;

import java.util.Scanner;

public class T4E13PintaPiramides {
    public static void main(String[] args) {
        // Inicializamos el Scanner
        Scanner sc = new Scanner(System.in);

        // Declaramos las variable de entrada
        System.out.println("\033[1mEste programa pinta una pirámide.\033[0m\n");
        System.out.println("Introduzca el carácter de relleno: ");
        String entrada = sc.nextLine();

        // Elige el tipo de piramide
        System.out.println("Elija un tipo de pirámide: ");
        System.out.println("0. Salir del programa.");
        System.out.println("1. Con el vértice hacia arriba.");
        System.out.println("2. Con el vértice hacia abajo.");
        System.out.println("3. Con el vértice hacia la derecha.");
        System.out.println("4. Con el vértice hacia la izquierda.");
        int numeroEntrada = sc.nextInt();
        sc.nextLine();

        // Abrimos el swtich case
        switch (numeroEntrada) {
            case 1:
                System.out.println(" " + " " + entrada + " " + " ");
                System.out.println(" " + entrada + entrada + entrada + " ");
                System.out.println(entrada + entrada + entrada + entrada + entrada);
                break;
            case 2:
                System.out.println(entrada + entrada + entrada + entrada + entrada);
                System.out.println(" " + entrada + entrada + entrada + " ");
                System.out.println(" " + " " + entrada + " " + " ");
                break;
            case 3:
                System.out.println(entrada + " " + " ");
                System.out.println(entrada + entrada + " ");
                System.out.println(entrada + entrada + entrada);
                System.out.println(entrada + entrada + " ");
                System.out.println(entrada + " " + " ");
                break;
            case 4:
                System.out.println(" " + " " + entrada);
                System.out.println(" " + entrada + entrada);
                System.out.println(entrada + entrada + entrada);
                System.out.println(" " + entrada + entrada);
                System.out.println(" " + " " + entrada);
                break;
            default:
                System.out.println("Gracias por utilizar este magnífico programa.");

                break;
        }

        // Cerramos el Scanner
        sc.close();
    }
}
