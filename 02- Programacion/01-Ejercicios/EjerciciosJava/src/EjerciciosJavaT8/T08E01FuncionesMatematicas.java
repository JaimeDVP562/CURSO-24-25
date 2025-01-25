package EjerciciosJavaT8;

import java.util.Scanner;

public class T08E01FuncionesMatematicas {
    /**
     * Programa principal para probar la librería
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 15) {
            System.out.println("1. Capicúa");
            System.out.println("2. Es primo");
            System.out.println("3. Siguiente primo");
            System.out.println("4. Potencia");
            System.out.println("5. Digitos");
            System.out.println("6. Voltea un numero ");
            System.out.println("7. DigitoN");
            System.out.println("8. Posicion de un digito");
            System.out.println("9. Quita numeros por detras");
            System.out.println("10. Quita numeros por delante");
            System.out.println("11. Pega por delante ");
            System.out.println("12. Pega por detrás");
            System.out.println("13. Trozo de un número");
            System.out.println("14. Junta números");
            System.out.println("15. Salir");
            System.out.print("Introduzca opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    // Comprueba número capicúa
                    System.out.print("Introduzca número: ");
                    int numero = sc.nextInt();
                    if (MiLibreria.esCapicua(numero)) {
                        System.out.println("El numero " + numero + " es capicúa");
                    } else {
                        System.out.println("El numero " + numero + " NO es capicúa");
                    }
                    break;
                case 2:
                    // Comprueba número primo

                    System.out.print("Introduzca número: ");
                    numero = sc.nextInt();
                    if (MiLibreria.esPrimo(numero)) {
                        System.out.println("El numero " + numero + " es primo");
                    } else {
                        System.out.println("El numero " + numero + " NO es primo");
                    }
                    break;

                case 3:
                    // Introducimos un número y nos muestra el siguiente que sea primo
                    System.out.print("Introduzca número: ");
                    numero = sc.nextInt();
                    System.out.printf("El siguiente número primo a %d es %d\n", numero,
                            MiLibreria.siguientePrimo(numero));
                    break;
                case 4:
                    // Calcula potencias
                    int potencia = MiLibreria.calculaPotencias();
                    System.out.printf("El resultado de la potencia calculada es de %2d", potencia);
                    break;
                case 5:
                    // Cuenta el número de dígitos de un número entero
                    int numeroDigitos = MiLibreria.cuentaDigitos();
                    System.err.println("El número introducido tiene " + numeroDigitos);
                    break;
                case 6:
                    // Da la vuelta al número que se introduce por pantalla
                    System.out.println("Introduce un numero para invertirlo.");
                    int entrada = sc.nextInt();
                    sc.nextLine();

                    String numeroInvertido = MiLibreria.invertirEnteroConCerosIzquirda(entrada);

                    System.out.println("El número " + entrada + " volteado es " + numeroInvertido);
                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                case 10:

                    break;
                case 11:

                    break;
                case 12:

                    break;
                case 13:

                    break;
                case 14:
                    // Pega dos numeros uno detas de otro

                    System.out.println("introduce el primer numero entero: ");
                    int numero1 = sc.nextInt();
                    sc.nextLine();
                    System.out.println("introduce el segundo numero entero: ");
                    int numero2 = sc.nextInt();
                    sc.nextLine();

                    String numeroCompleto = MiLibreria.pegaDosNumeros(numero1, numero2);

                    System.out.println(" Juntando el " + numero1 + " y el " + numero2 + " da el " + numeroCompleto);

                    break;

                default:
                    break;
            }
            System.err.println("");
        }
        sc.close();
    }
}