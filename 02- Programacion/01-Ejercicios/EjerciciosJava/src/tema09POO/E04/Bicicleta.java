package tema09POO.E04;

public class Bicicleta extends Vehiculo {

    public int kilometrosRecorridos = 0;

    public int getKilometrosRecorridos(int kilometros) {
        kilometrosRecorridos += kilometros;
        System.out.println("La bicicleta lleva recorridos " + kilometrosRecorridos);
        return 0;
    }

    void hacerCaballito() {
        System.out.println("Estoy haciendo el caballito que chuchuchuli");
    }

    void kilometrosTotales() {
        System.out.println("He recorrido " + kilometrosRecorridos + " kilómetros");
    }

}