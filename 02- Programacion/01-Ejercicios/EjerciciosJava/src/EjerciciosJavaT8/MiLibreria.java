package EjerciciosJavaT8;

import java.util.Scanner;

public class MiLibreria {
    public static int leerValor() {

        /**
         * 
         * 
         */
        int numero;
        boolean ok = false;
        Scanner sc = new Scanner(System.in);

        do {
            numero = sc.nextInt();
            ok = (numero > 2);
            if (!ok) {
                System.out.println("Lo siento, el valor mínimo es 2");
                System.out.print("Introduzca un nuevo valor: ");
            }
        } while (!ok);

        sc.close();

        return numero;
    }

    public static int leerValorEnteroPositivo() {

        /**
         * 
         * 
         */
        int numero = 0;
        Scanner sc = new Scanner(System.in);

        do {
            numero = sc.nextInt();
            try {
                if (!(numero >= 0)) {
                    System.out.println("ERROR: Debe ser un valor numerico entero positivo");
                    System.out.print("Introduzca un nuevo valor: ");
                }
            } catch (Exception e) {
                System.out.println("ERROR: Debe ser un valor numerico entero positivo");
            }
        } while (!(numero >= 0));

        sc.close();

        return numero;
    }

    /**
     * Método que devuelve el inverso del número que se le pasa como parámetro
     * 
     * @param numero
     * @return
     */
    public static int invertirEntero(int numero) {
        // Declaraciones
        int numeroInvertido = 0;
        while (numero != 0) {
            // Obtener el último dígito del número
            int digito = numero % 10;
            // Añadir el dígito al número invertido
            numeroInvertido = numeroInvertido * 10 + digito;
            // Eliminar el último número del número original
            numero /= 10;
        }
        // Devuelve el número invertido
        return numeroInvertido;
    }

    /**
     * Función que devuelve si el número entero que se le pasa como parámetro es
     * capicúa.
     * 
     * @param numero
     * @return
     */
    public static boolean esCapicua(int numero) {
        return (numero == MiLibreria.invertirEntero(numero));
    }

    /**
     * Método que devuelve el inverso del número que se le pasa como parámetro
     * 
     * @param numero
     * @return
     */

    public static String invertirEnteroConCerosIzquirda(int numero) {
        // Declaraciones
        int numeroInvertido = 0;
        int ceros = 0;

        // Contar y eliminar ceros finales del número original
        while (numero % 10 == 0 && numero != 0) {
            ceros++;
            numero /= 10; // Eliminar ceros finales
        }

        // Invertir el número restante
        while (numero != 0) {
            int digito = numero % 10; // Extraemos el último dígito
            numeroInvertido = numeroInvertido * 10 + digito; // Construimos el número invertido
            numero /= 10; // Quitamos el último dígito del número original
        }

        // Construir el resultado con los ceros iniciales
        StringBuilder resultado = new StringBuilder();
        while (ceros > 0) {
            resultado.append("0"); // Agregar los ceros iniciales al resultado
            ceros--;
        }
        resultado.append(numeroInvertido); // Agregar el número invertido

        return resultado.toString(); // Devolver el número invertido como cadena
    }

    /**
     * Función que comprueba si el número entero que se le pasa como parámetro es
     * primo
     * 
     * @param numero
     * @return
     */
    public static boolean esPrimo(int numero) {
        // Declaraciones
        boolean esPrimo = true;
        int i = 2;

        // Valor absoluto
        while (esPrimo && i <= (numero / 2)) {
            esPrimo = (numero % i != 0);
            i++;
        }

        return esPrimo;
    }

    /**
     * Devuelve el siguiente número primo al que se le pasa como parámetro.
     * 
     * @param numero
     * @return
     */
    public static int siguientePrimo(int numero) {
        // Declaraciones
        int siguientePrimo = numero + 1;

        while (!esPrimo(siguientePrimo)) {
            siguientePrimo++;
        }

        return siguientePrimo;
    }

    /**
     * 
     * @return Este método pide al usuario que ingrese una base y una potencia,
     *         mostrando el resultado de la potencia calculada mediante un bucle
     */
    public static int calculaPotencias() {
        // Declaraciones
        int base = 0;
        int exponente = 0;
        int potencia = 1;
        Scanner sc = new Scanner(System.in);

        // Leemos base y exponente de teclado:
        System.out.print("Introduzca base: ");
        base = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduzca exponente: ");
        exponente = sc.nextInt();
        sc.nextLine();
        // calculamos la potencia
        for (int i = 1; i <= exponente; i++) {
            potencia *= base;
        }
        // Cerramos scanner
        sc.close();

        return potencia;

    }

    /**
     * 
     * @param args Este método retorna el número de dígitos que tiene un número
     *             entero positivo
     */
    public static int cuentaDigitos() {

        // Inicializamos el Scanner
        Scanner sc = new Scanner(System.in);

        try {
            // Declaramos las variable de entrada
            System.out.println("Introduzca un número entero: ");
            int entrada = sc.nextInt();
            sc.nextLine();

            int contador = 0;
            int numeroAbsoluto = Math.abs(entrada); // Con la funcion esta, lo que se busca es que imprima el valor del
                                                    // número eliminando el signo del numero y los decimales
                                                    // IMPORTANTE!!!

            // Contamos los dígitos usando divisiones sucesivas
            if (numeroAbsoluto == 0) {
                contador = 1;
            } else {
                while (numeroAbsoluto > 0) {
                    numeroAbsoluto = (numeroAbsoluto / 10); // Dividimos el númeroAbsoluto entre 10 para que en cada
                                                            // iteración del bucle le quite un decimal al numero
                                                            // introducido
                    contador++;
                }
            }
            return contador;

        } catch (Exception e) {
            System.out.println("Error: Por favor, introduce un número válido.");
            return -1;
        } finally {
            sc.close();
        }
    }

    /**
     * Introduce dos numeros y los pega uno detrás de otro
     * 
     * @param
     * @return
     */
    public static String pegaDosNumeros(int numero1, int numero2) {

        String snumero1 = "" + numero1;
        String snumero2 = "" + numero2;

        String snumeroCompleto = snumero1 + snumero2;
        return snumeroCompleto;
    }

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

    public static int decimalBinario(int decimal) {
        // Paso 1: Crear una variable para almacenar el binario como número entero
        int binario = 0;
        int posicion = 1; // Posición decimal inicial (unidades)

        // Paso 2: Convertir de decimal a binario
        while (decimal > 0) {
            int resto = decimal % 2; // Obtener el resto de la división por 2 (0 o 1)
            binario += resto * posicion; // Agregar el dígito binario en la posición correspondiente
            decimal /= 2; // Dividir el número decimal por 2
            posicion *= 10; // Avanzar a la siguiente posición decimal (decenas, centenas, etc.)
        }
        return binario;
    }

}
