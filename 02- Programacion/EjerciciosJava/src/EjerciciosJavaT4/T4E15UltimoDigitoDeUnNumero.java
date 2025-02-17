package EjerciciosJavaT4;

import java.util.Scanner;

public class T4E15UltimoDigitoDeUnNumero {
    public static void main(String[] args) {
        // Inicializamos el Scanner
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce un número: ");
            int numero = sc.nextInt();// Leer número entero
            int ultimoDigito = numero % 10; // Obtener el último dígito con el módulo
            System.out.println("El último dígito del número introducido es: " + Math.abs(ultimoDigito)); // Asegurarse
                                                                                                         // de que sea
                                                                                                         // positivo
        } catch (Exception e) {
            System.out.println("Error: Por favor, introduce un número válido.");
        } finally {
            sc.close(); // Cerrar el Scanner
        }

    }
}
