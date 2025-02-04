package tema09POO.E04;

public class Vehiculo {
    public static int vechiculosCreados = 0;
    public static int kilometrosTotales = 0;

    public static int getKilometrosTotales() {
        return kilometrosTotales;
    }

    public static int getVechiculosCreados() {
        System.out.println("Los vehículos creados son " + vechiculosCreados);
        return vechiculosCreados;
    }

}
