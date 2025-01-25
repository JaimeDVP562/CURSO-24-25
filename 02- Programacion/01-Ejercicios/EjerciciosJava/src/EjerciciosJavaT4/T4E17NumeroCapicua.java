package EjerciciosJavaT4;

import java.util.Scanner;

public class T4E17NumeroCapicua {
    public static void main(String[] args) {

        // Inicializamos el Scanner
        Scanner sc = new Scanner(System.in);

        // Declaramos las variables para el primer y último dígito
        int primerNumero = -1;
        int ultimoDigito = -1;

        try {
            System.out.print("Introduce un número entero (de 5 cifras como máximo): ");
            int numero = sc.nextInt();
            numero = Math.abs(numero); // Ignorar signo negativo

            // Validamos si el número introducido tiene más de 5 cifras
            if (numero > 99999) {
                System.out.println("Error: El número introducido tiene más de cinco cifras.");
            } else {
                // Obtener el primer dígito
                primerNumero = numero;
                while (primerNumero >= 10) {
                    primerNumero /= 10;
                }

                // Obtener el último dígito
                ultimoDigito = numero % 10;
            }
        } catch (Exception e) {
            System.out.println("Error: Por favor, introduce un número válido.");
        } finally {
            // Comprobamos si el número es capicúa
            if (primerNumero != -1 && ultimoDigito != -1) {
                if (primerNumero == ultimoDigito) {
                    System.out.println("El número introducido es capicúa.");
                } else {
                    System.out.println("El número introducido no es capicúa.");
                }
            }
        }

        sc.close(); // Cerrar el Scanner
    }
}
