package EjerciciosJavaT5;

import java.util.Random;
import java.util.Scanner;

public class T05EXXpruebaNumeroRamdon {

    public static void main(String[] args) {

        // Inicializamos Scanner y el numero Ramdon

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Introducimos el primer numero
        System.out.println("Introduzca dos numeros por teclado: ");
        int numero1 = 0;
        int numero2 = 0;

        // Controlamos la segunda entrada por teclado
        while (numero1 <= 0) {
            try {
                System.out.println("Introduzca el primer numero:");
                numero1 = sc.nextInt();
                sc.nextLine();
                if (numero1 <= 0) {
                    System.out.println("ERROR: Introduzca un número entero positivo.");
                }
            } catch (Exception e) {
                System.out.println("ERROR: Introdzca un numero entero positivo.");
                sc.nextLine();
            }

        }

        // Controlamos la segunda entrada por teclado
        while (numero2 <= 0) {

            try {
                System.out.println("Introduzca el segundo numero:");
                numero2 = sc.nextInt();
                sc.nextLine();
                if (numero2 <= 0) { // Controlamos que el numero sea positivo
                    System.out.println("ERROR: Introdzca un numero entero positivo.");
                } else if (numero1 >= numero2) { // Controlamos que el segundo numero introducido no sea menor que el
                                                 // primero
                    System.out.println("ERROR: El segundo numero introducido es mayor que el primero.");
                }

            } catch (Exception e) {
                System.out.println("Ha entrado en la excepcion. .");
                sc.nextLine();
            }

            // Declaramos la variable del numero aleatorio
            int numeroRamdon = random.nextInt(numero2 - numero1 + 1) + numero1;

            String caracter = "";
            for (int i = 0; i < numeroRamdon; i++) {
                caracter += " * ";

            }
            System.out.println(caracter);

        }
        sc.close();
    }
}
