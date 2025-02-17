package EjerciciosJavaT1;

public class SalidaFormateada {
  public static void main(String[] args) {
    System.out.printf("El número %d no tiene decimales.\n", 21);
    System.out.printf("El número %f sale con decimales.\n", 21.0);
    System.out.printf("El %.3f sale exactamente con %d decimales.\n", 21.0, 3);
    System.out.printf("Mostramos el segundo: %2$d; y después el primero: %1$d.\n", 23, 56);

    // Flags
    System.out.printf("%8d\n", 100); // rellena con espacios a la izquierda
    System.out.printf("%08d\n", 100); // rellena con ceros a la izquierda
    System.out.printf("%+d\n", 100); // muestra el signo del número
    System.out.printf("%-8d\n", 100); // rellena con espacios a la derecha

    // Precision
    System.out.printf("%.4f\n", 25.876532); // Muestra los cuatro primeros decimales
    System.out.printf("%.5s\n", "¡Hola mundo!"); // Muestra solo los cinco primeros caracteres de lo que imprimimos por
                                                 // pantalla
  }
}