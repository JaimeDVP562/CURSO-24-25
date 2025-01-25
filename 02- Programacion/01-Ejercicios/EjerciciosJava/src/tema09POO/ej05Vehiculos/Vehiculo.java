package tema09POO.ej05Vehiculos;

public class Vehiculo {

    // Vehiculos de clase(estaticos)
    public static int vehiculosCreados = 0;
    public static int kilometrosTotales = 0;

    // Atributos de instancia
    public int kilometrosRecorridos;

    // Constructor
    public Vehiculo() {
        vehiculosCreados++;

    }

    public void andar(int kilometros) {
        kilometrosTotales += kilometros;
        kilometrosRecorridos += kilometros;
    }

    public void getkilometrajetotales() {
        System.out.println("Los vehiculos llevan recorridos " + kilometrosTotales);
    }

}
