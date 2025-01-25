package EjerciciosJavaT8;

import java.util.Scanner;

public class T08E06CalculadoraConversion {

    // Función principal para ejecutar el programa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char opcion;

        do {
            // Menú de opciones
            System.out.println("\nCalculadora de Conversiones:");
            System.out.println("A) Binario -> Octal");
            System.out.println("B) Binario -> Decimal");
            System.out.println("C) Binario -> Hexadecimal");
            System.out.println("D) Octal -> Binario");
            System.out.println("E) Octal -> Decimal");
            System.out.println("F) Octal -> Hexadecimal");
            System.out.println("G) Decimal -> Binario");
            System.out.println("H) Decimal -> Octal");
            System.out.println("I) Decimal -> Hexadecimal");
            System.out.println("J) Hexadecimal -> Binario");
            System.out.println("K) Hexadecimal -> Octal");
            System.out.println("L) Hexadecimal -> Decimal");
            System.out.println("M) Decimal -> Sistema de Palotes");
            System.out.println("T) Terminar");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.next().toUpperCase().charAt(0);
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 'A':
                    System.out.print("Ingrese un número binario: ");
                    String binarioAOctal = scanner.nextLine();
                    System.out.println("Resultado: " + binarioAOctalConBucles(binarioAOctal));
                    break;
                case 'B':
                    System.out.print("Ingrese un número binario: ");
                    String binarioADecimal = scanner.nextLine();
                    System.out.println("Resultado: " + binarioADecimalConBucles(binarioADecimal));
                    break;
                case 'C':
                    System.out.print("Ingrese un número binario: ");
                    String binarioAHexadecimal = scanner.nextLine();
                    System.out.println("Resultado: " + binarioAHexadecimalConBucles(binarioAHexadecimal));
                    break;
                case 'D':
                    System.out.print("Ingrese un número octal: ");
                    String octalABinario = scanner.nextLine();
                    System.out.println("Resultado: " + octalABinarioConBucles(octalABinario));
                    break;
                case 'E':
                    System.out.print("Ingrese un número octal: ");
                    String octalADecimal = scanner.nextLine();
                    System.out.println("Resultado: " + octalADecimalConBucles(octalADecimal));
                    break;
                case 'F':
                    System.out.print("Ingrese un número octal: ");
                    String octalAHexadecimal = scanner.nextLine();
                    System.out.println("Resultado: " + octalAHexadecimalConBucles(octalAHexadecimal));
                    break;
                case 'G':
                    System.out.print("Ingrese un número decimal: ");
                    int decimalABinario = scanner.nextInt();
                    System.out.println("Resultado: " + decimalABinarioConBucles(decimalABinario));
                    break;
                case 'H':
                    System.out.print("Ingrese un número decimal: ");
                    int decimalAOctal = scanner.nextInt();
                    System.out.println("Resultado: " + decimalAOctalConBucles(decimalAOctal));
                    break;
                case 'I':
                    System.out.print("Ingrese un número decimal: ");
                    int decimalAHexadecimal = scanner.nextInt();
                    System.out.println("Resultado: " + decimalAHexadecimalConBucles(decimalAHexadecimal));
                    break;
                case 'J':
                    System.out.print("Ingrese un número hexadecimal: ");
                    String hexadecimalABinario = scanner.nextLine();
                    System.out.println("Resultado: " + hexadecimalABinarioConBucles(hexadecimalABinario));
                    break;
                case 'K':
                    System.out.print("Ingrese un número hexadecimal: ");
                    String hexadecimalAOctal = scanner.nextLine();
                    System.out.println("Resultado: " + hexadecimalAOctalConBucles(hexadecimalAOctal));
                    break;
                case 'L':
                    System.out.print("Ingrese un número hexadecimal: ");
                    String hexadecimalADecimal = scanner.nextLine();
                    System.out.println("Resultado: " + hexadecimalADecimalConBucles(hexadecimalADecimal));
                    break;
                case 'M':
                    System.out.print("Ingrese un número decimal: ");
                    int numeroPalotes = scanner.nextInt();
                    System.out.println("Resultado en sistema de palotes: " + decimalAPalotesConBucles(numeroPalotes));
                    break;
                case 'T':
                    System.out.println("Terminando programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 'T');

        scanner.close();
    }

    // Métodos de conversión con bucles
    public static String binarioAOctalConBucles(String binario) {
        int decimal = binarioADecimalConBucles(binario);
        return decimalAOctalConBucles(decimal);
    }

    public static int binarioADecimalConBucles(String binario) {
        int decimal = 0;
        int potencia = 1; // 2^0

        for (int i = binario.length() - 1; i >= 0; i--) {
            int digito = binario.charAt(i) - '0'; // Convertir char a int
            decimal += digito * potencia;
            potencia *= 2; // Incrementar potencia de 2
        }

        return decimal;
    }

    public static String binarioAHexadecimalConBucles(String binario) {
        int decimal = binarioADecimalConBucles(binario);
        return decimalAHexadecimalConBucles(decimal);
    }

    public static String octalABinarioConBucles(String octal) {
        int decimal = octalADecimalConBucles(octal);
        return decimalABinarioConBucles(decimal);
    }

    public static int octalADecimalConBucles(String octal) {
        int decimal = 0;
        int potencia = 1; // 8^0

        for (int i = octal.length() - 1; i >= 0; i--) {
            int digito = octal.charAt(i) - '0'; // Convertir char a int
            decimal += digito * potencia;
            potencia *= 8; // Incrementar potencia de 8
        }

        return decimal;
    }

    public static String octalAHexadecimalConBucles(String octal) {
        int decimal = octalADecimalConBucles(octal);
        return decimalAHexadecimalConBucles(decimal);
    }

    public static String decimalABinarioConBucles(int decimal) {
        String binario = "";
        while (decimal > 0) {
            int residuo = decimal % 2;
            binario = residuo + binario;
            decimal /= 2;
        }
        return binario;
    }

    public static String decimalAOctalConBucles(int decimal) {
        String octal = "";
        while (decimal > 0) {
            int residuo = decimal % 8; // Obtener el residuo
            octal = residuo + octal; // Construir el resultado manualmente
            decimal /= 8; // Dividir entre 8
        }
        return octal;
    }

    public static String decimalAHexadecimalConBucles(int decimal) {
        String hexadecimal = "";
        char[] hexChars = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        while (decimal > 0) {
            int residuo = decimal % 16;
            hexadecimal = hexChars[residuo] + hexadecimal;
            decimal /= 16;
        }
        return hexadecimal;
    }

    public static String hexadecimalABinarioConBucles(String hexadecimal) {
        int decimal = hexadecimalADecimalConBucles(hexadecimal);
        return decimalABinarioConBucles(decimal);
    }

    public static String hexadecimalAOctalConBucles(String hexadecimal) {
        int decimal = hexadecimalADecimalConBucles(hexadecimal);
        return decimalAOctalConBucles(decimal);
    }

    public static int hexadecimalADecimalConBucles(String hexadecimal) {
        int decimal = 0;
        int potencia = 1; // 16^0

        for (int i = hexadecimal.length() - 1; i >= 0; i--) {
            char caracter = hexadecimal.charAt(i);
            int valor;

            if (caracter >= '0' && caracter <= '9') {
                valor = caracter - '0';
            } else {
                valor = 10 + (caracter - 'A');
            }

            decimal += valor * potencia;
            potencia *= 16; // Incrementar potencia de 16
        }

        return decimal;
    }

    public static String decimalAPalotesConBucles(int numero) {
        StringBuilder resultado = new StringBuilder();

        String numeroStr = String.valueOf(numero);
        for (int i = 0; i < numeroStr.length(); i++) {
            int digito = numeroStr.charAt(i) - '0';
            for (int j = 0; j < digito; j++) {
                resultado.append('|');
            }
            if (i < numeroStr.length() - 1) {
                resultado.append('-');
            }
        }

        return resultado.toString();
    }
}
