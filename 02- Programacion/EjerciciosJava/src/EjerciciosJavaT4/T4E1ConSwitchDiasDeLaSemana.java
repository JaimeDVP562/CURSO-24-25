package EjerciciosJavaT4;

import java.util.Scanner;

public class T4E1ConSwitchDiasDeLaSemana {

    public static void main(String[] args) {

        // Inicializamos el Scanner
        Scanner sc = new Scanner(System.in);

        // Declaramos las variables de entrada y pedimos que ingrese un String
        System.out.println("Introduce un dia de la semana:");
        String dia = sc.nextLine();

        // String mensaje = "";

        switch (dia) {
            case "lunes":
                System.out.println("Entornos de desarrollo.");
                break;
            case "martes":
                System.out.println("Base de datos. ");
                break;
            case "miercoles":
                System.out.println("Lenguajes de marcas.");
                break;
            case "jueves":
                System.out.println("Programación.");
                break;
            case "viernes":
                System.out.println("Programación.");
                break;
            case "sabado":
                System.out.println("Ir a comprar al mercadona. ");
                break;
            case "domingo":
                System.out.println("Preparar la comida para la semana. ");
                break;
            default:
                System.out.println("El dia introducido es incorrecto, hasta luego maricarmen.");
                break;
        }

        // Cerramos el Scanner
        sc.close();
    }
}