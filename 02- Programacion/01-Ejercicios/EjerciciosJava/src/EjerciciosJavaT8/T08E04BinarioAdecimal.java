package EjerciciosJavaT8;

import java.util.Scanner;

public class T08E04BinarioAdecimal {

    public static int binarioDecimal(int binario) {

        // Paso 1: Variable para guardar el resultado decimal
        int decimal = 0;
        int posicion = 0; // Posición desde la derecha

        // Paso 2: Procesar el número binario dígito por dígito
        while (binario > 0) {
            int bit = binario % 10; // Extraer el último dígito (0 o 1)
            binario /= 10; // Eliminar el último dígito

            if (bit == 1) {
                // Calcular la potencia de 2 manualmente
                int potencia = 1; // Comienza con 2^0 = 1
                for (int i = 0; i < posicion; i++) {
                    potencia *= 2; // Multiplica por 2 tantas veces como indique la posición
                }
                // Sumar la potencia calculada al resultado
                decimal += potencia;
            }

            posicion++; // Moverse a la siguiente posición
        }

        // Paso 3: Mostrar el resultado
        return decimal;

    }

    // ==============================================================================================

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número binario: ");
        int numero1 = sc.nextInt();
        sc.nextLine();
        sc.close();

        int numeroDecimal = MiLibreria.binarioDecimal(numero1);

        System.out.println("El numero binario introducido " + numero1 + " es " + numeroDecimal);
    }

}
