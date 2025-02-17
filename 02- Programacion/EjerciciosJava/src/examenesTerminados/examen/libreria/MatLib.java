package libreria;

public class MatLib {

    // A. Suma de dos números
    public static int suma(int a, int b) {
        return a + b;
    }

    // B. Incremento de un número
    public static int inc(int a) {
        return suma(a, 1);
    }

    // C. Resta de dos números
    public static int resta(int a, int b) {
        return suma(a, -b);
    }

    // D. Decremento de un número
    public static int dec(int a) {
        return suma(a, -1);
    }

    // E. Comparar si un número es mayor que otro
    public static boolean esMayor(int a, int b) {
        int diferencia = resta(a, b);
        return diferencia > 0;
    }

    // F. Comparar si un número es menor que otro
    public static boolean esMenor(int a, int b) {
        int diferencia = resta(b, a);
        return diferencia > 0;
    }

    // G. Comparar si dos números son iguales
    public static boolean esIgual(int a, int b) {
        return !esMayor(a, b) && !esMenor(a, b);
    }

    // H. Multiplicación de dos números
    public static int multiplica(int a, int b) {
        int resultado = 0;
        int positivo = b > 0 ? 1 : -1;
        for (int i = 0; i < Math.abs(b); i++) {
            resultado = suma(resultado, positivo * a);
        }
        return resultado;
    }

    // I. División de dos números
    public static int divide(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("División por cero no permitida");
        int cociente = 0;
        int positivo = b > 0 ? 1 : -1;
        int absA = a > 0 ? a : resta(0, a); // Valor absoluto de a
        int absB = b > 0 ? b : resta(0, b); // Valor absoluto de b

        while (absA >= absB) {
            absA = resta(absA, absB);
            cociente = suma(cociente, 1);
        }
        return b > 0 ? cociente : resta(0, cociente);
    }

    // J. Resto de una división
    public static int resto(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("División por cero no permitida");
        int absA = a > 0 ? a : resta(0, a); // Valor absoluto de a
        int absB = b > 0 ? b : resta(0, b); // Valor absoluto de b

        while (absA >= absB) {
            absA = resta(absA, absB);
        }
        return a < 0 ? resta(0, absA) : absA;
    }

    // K. Potencia de dos números
    public static int potencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; !esMenor(exponente, suma(i, 1)); i = suma(i, 1)) {
            resultado = multiplica(resultado, base);
        }
        return resultado;
    }

    // L. Cuadrado de un número
    public static int cuadrado(int a) {
        return potencia(a, 2); // Multiplicamos dos veces
    }

    // M. Cubo de un número
    public static int cubo(int a) {
        return potencia(a, 3); // Multiplicamos tres veces
    }

    // N. Es múltiplo de un número
    public static boolean esMultiplo(int a, int b) {
        return resto(a, b) == 0;
    }

    // O. Es divisor de un número
    public static boolean esDivisor(int a, int b) {
        return resto(b, a) == 0;
    }

    // P. Es primo un número
    public static boolean esPrimo(int a) {
        if (!(a > 1))
            return false;
        for (int i = 2; !esMenor(a, suma(i, 1)); i = suma(i, 1)) {
            if (esMultiplo(a, i))
                return false;
        }
        return true;
    }

    // Q. Es un cuadrado perfecto
    public static boolean esCuadradoPerfecto(int a) {
        if (!(a > -1))
            return false; // Si los numeros son negativos no pueden ser cuadrados perfectos
        int i = 0;
        while (!esMenor(a, cuadrado(i))) {
            if (!esMenor(cuadrado(i), suma(a, 1)))
                return true; // Si cuadrado(i) == a
            i = suma(i, 1);
        }
        return false;
    }

    // R. Pirámide de números
    public static void piramide(int filas) {
        if (filas <= 0)
            return;
        int fila = 1;
        while (!esMenor(filas, suma(fila, 1))) {
            int num = 1;
            while (!esMenor(fila, suma(num, 1))) {
                System.out.print(num + " ");
                num = suma(num, 1);
            }
            System.out.println();
            fila = suma(fila, 1);
        }
    }
}
