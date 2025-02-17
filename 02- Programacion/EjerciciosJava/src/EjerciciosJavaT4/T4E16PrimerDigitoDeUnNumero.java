package EjerciciosJavaT4;

import java.util.Scanner;

public class T4E16PrimerDigitoDeUnNumero {
    public static void main(String[] args) {
        // Inicializamos el Scanner
        Scanner sc = new Scanner(System.in);

        // Declaramos el try-catch
        try {
            System.out.print("Introduce un número entero (de 5 cifras como máximo): ");
            int numero = sc.nextInt();
            numero = Math.abs(numero); // Ignorar signo negativo

            // Validamos si el número introducido es menor de 5 cifras
            if (numero > 99999) {
                System.out.println("Error el número introducido es mayor de cinco cifras");
            } else {
                // Dividir iterativamente hasta que el número tenga un solo dígito
                while (numero >= 10) {
                    numero /= 10;
                }
                System.out.println("El primer dígito es: " + numero);
            }
        } catch (Exception e) {
            System.out.println("Error: Por favor, introduce un número válido.");
        } finally {
            sc.close();
        }
    }
}
