package EjerciciosJavaT2;

public class EjerciciosTema2Ej1 {
    public static void main(String[] args) {
        int x, y;
        x = 144;
        y = 999;

        int suma = x + y;
        int resta = x - y;
        int multiplicacion = x * y;
        double division = (double) x / (double) y;

        // Suma
        System.out.println("Podemos representar la suma de esta manera = " + suma);
        System.out.println("Podemos representar la suma de esta manera = " + (x + y));

        // Resta
        System.out.println("Podemos representar la resta de esta manera = " + resta);
        System.out.println("Podemos representar la resta de esta manera = " + (x - y));

        // Multiplicacion
        System.out.println("Podemos representar la multiplicacion de esta manera = " + multiplicacion);
        System.out.println("Podemos representar la multiplicacion de esta manera = " + (x * y));

        // Division
        System.out.println("Podemos representar la division de esta manera = " + division); // Como podemos observar en
                                                                                            // esta línea si nos
                                                                                            // devuelve los decimales
                                                                                            // porque antes de la
        System.out.println("Podemos representar la division de esta manera = " + (x / y));
    }
}
