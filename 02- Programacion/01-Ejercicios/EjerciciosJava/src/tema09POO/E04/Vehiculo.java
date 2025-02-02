package tema09POO.E04;

public class Vehiculo {
    protected static int vechiculosCreados = 0;
    protected static int kilometrosTotales = 0;

    public void getKilometrosTotales() {
        System.out.println("Los vehiculos llevan recorridos " + kilometrosTotales);
    }

    static int andar(int kilometros) {
        kilometrosTotales += kilometros;
        return kilometrosTotales;
    }

    public int getVechiculosCreados() {
        return vechiculosCreados;
    }

}
