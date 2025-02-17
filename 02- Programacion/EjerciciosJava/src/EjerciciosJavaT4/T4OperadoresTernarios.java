package EjerciciosJavaT4;

import java.util.Scanner;

public class T4OperadoresTernarios {
    public static void main(String[] args) {

        String edadTernario;

        // Lee la edad numérica del teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la edad numérica: ");
        int edadNumerica = sc.nextInt();

        // Con if-else
        if (edadNumerica >= 18) {
            System.out.println("Es mayor de edad."); // Mensaje corregido
        } else {
            System.out.println("Es menor de edad."); // Mensaje corregido
        }

        // Con operador ternario
        edadTernario = (edadNumerica >= 18) ? "El usuario es mayor de edad." : "El usuario es menor de edad."; // Corregido
                                                                                                               // el
                                                                                                               // operador
                                                                                                               // ternario
        System.out.println(edadTernario);
        System.out.println(edadTernario);

        sc.close();
    }
}
