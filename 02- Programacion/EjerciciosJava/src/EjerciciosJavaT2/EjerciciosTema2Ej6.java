package EjerciciosJavaT2;

public class EjerciciosTema2Ej6 {
    public static void main(String[] args) {
        double porcentajeIVA = 0.21;
        double baseImponible = 22.75;
        double iva = porcentajeIVA * baseImponible;
        double resultado = iva + baseImponible;

        System.out.println("Ejercicio 06");
        System.out.println("Ejemplo:");
        System.out.println(("Base imponible\t" + baseImponible));
        System.out.println(("IVA\t\t") + iva);
        System.out.println("---------------");
        System.out.println(("Total\t\t") + resultado + ("\n"));

        System.out.println("Ejercicio 06");
        System.out.println("Ejemplo:");
        System.out.printf("Base imponible:\t\t%.2f\n", baseImponible);
        System.out.printf("IVA (21%%):\t\t%.2f\n", iva);
        System.out.println("---------------");
        System.out.printf("Total:\t\t%.2f\n", resultado);
    }

}