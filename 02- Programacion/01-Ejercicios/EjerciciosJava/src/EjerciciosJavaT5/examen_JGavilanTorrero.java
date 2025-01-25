
package EjerciciosJavaT5;

import java.util.Random;
import java.util.Scanner;

public class examen_JGavilanTorrero {

    // Declaramos todas las variables que vamos a utilizar
    public static final String RESET = "\033[0m";
    public static final String RED_CELL = "\033[41m"; // Rojo para 5 y 6
    public static final String GREEN_CELL = "\033[42m"; // Verde para 7 y 8
    public static final String BLUE_CELL = "\033[44m"; // Azul para 0-4
    public static final String PURPLE_CELL = "\033[45m"; // Púrpura para 9

    public static final String TOP_LEFT = "\u2554";
    public static final String TOP_RIGHT = "\u2557";
    public static final String BOTTOM_LEFT = "\u255A";
    public static final String BOTTOM_RIGHT = "\u255D";
    public static final String HORIZONTAL = "\u2550";
    public static final String VERTICAL = "\u2551";
    public static final String T_TOP = "\u2566";
    public static final String T_BOTTOM = "\u2569";
    public static final String T_LEFT = "\u2560";
    public static final String T_RIGHT = "\u2563";
    public static final String CROSS = "\u256C";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar valores de entrada
        System.out.println("Introduce el valor mínimo del rango (mayor a 0):");
        int min = scanner.nextInt();

        System.out.println("Introduce el valor máximo del rango (mayor al mínimo):");
        int max = scanner.nextInt();

        if (min <= 0 || max <= min) {
            System.out.println("Error: los valores introducidos no son válidos.");
            // return;
        }

        // Generar un número aleatorio en el rango
        Random random = new Random();
        int numero = random.nextInt(max - min + 1) + min;

        System.out.println("Número generado: " + numero);
        System.out.println("Dibuja el gráfico en blanco y negro o en color (B/C):");
        char opcion = scanner.next().toUpperCase().charAt(0);

        String numStr = Integer.toString(numero);

        int maximoValor = 0;

        // Encontrar el dígito máximo para dimensionar el gráfico
        for (int i = 0; i < numStr.length(); i++) {
            char digito = numStr.charAt(i);
            int valor = Character.getNumericValue(digito);

            if (maximoValor < valor) {
                maximoValor = valor;
            }
        }

        // creamos el borde superior
        String bordeSuperior = "";
        if (opcion == 'C') {
            bordeSuperior += TOP_LEFT + HORIZONTAL;
            for (int j = 0; j < maximoValor; j++) {
                bordeSuperior += T_TOP + HORIZONTAL;
            }
            bordeSuperior += TOP_RIGHT;
        } else {
            bordeSuperior = "----";
            for (int j = 0; j < maximoValor; j++) {
                bordeSuperior += "----";
            }
        }
        System.out.println(bordeSuperior);

        // Procesamos cada dígito del número generado
        for (int i = 0; i < numStr.length(); i++) {

            char digito = numStr.charAt(i);
            int valor = Character.getNumericValue(digito);
            int tempValor = valor;

            // Construimos la fila
            String fila = "";

            if (opcion == 'C') {
                fila += VERTICAL + valor;
                for (int j = 0; j < maximoValor; j++, tempValor--) {
                    fila += VERTICAL;

                    if (tempValor > 0) {
                        // Aplicar color
                        String color = "";

                        if (valor >= 0 && valor <= 4) {
                            color = BLUE_CELL;
                        } else if (valor >= 5 && valor <= 6) {
                            color = RED_CELL;
                        } else if (valor >= 7 && valor <= 8) {
                            color = GREEN_CELL;
                        } else if (valor == 9) {
                            color = PURPLE_CELL;
                        }

                        fila += color + " " + RESET; // Ajuste de ancho a 3 espacios
                    } else {
                        fila += "   "; // Mantener el ancho de la celda
                    }
                }
                fila += VERTICAL;
            } else {
                fila = "| " + valor + " |";

                tempValor = valor;
                for (int j = 0; j < maximoValor; j++, tempValor--) {

                    if (tempValor > 0) {
                        fila += " * |";
                    } else {
                        fila += "   |";
                    }
                }
            }

            System.out.println(fila);

            // Construimos el separador o borde inferior
            String separador = "";

            if (opcion == 'C') {
                if (i == numStr.length() - 1) {
                    // Si estamos en la última fila, usar borde inferior
                    separador += BOTTOM_LEFT + HORIZONTAL;
                    for (int j = 0; j < maximoValor; j++) {
                        separador += T_BOTTOM + HORIZONTAL;
                    }
                    separador += BOTTOM_RIGHT;
                } else {
                    // Separador entre filas
                    separador += T_LEFT + HORIZONTAL;
                    for (int j = 0; j < maximoValor; j++) {
                        separador += CROSS + HORIZONTAL;
                    }
                    separador += T_RIGHT;
                }
            } else {
                if (i == numStr.length() - 1) {
                    separador = "----";
                    for (int j = 0; j < maximoValor; j++) {
                        separador += "----";
                    }
                } else {
                    separador = "----";
                    for (int j = 0; j < maximoValor; j++) {
                        separador += "----";
                    }
                }
            }

            System.out.println(separador);
        }
        // Cerramos el Scanner
        scanner.close();
    }

}
