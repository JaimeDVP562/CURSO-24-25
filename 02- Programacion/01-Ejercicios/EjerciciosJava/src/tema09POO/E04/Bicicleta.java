package tema09POO.E04;

public class Bicicleta extends Vehiculo {

    public int kilometrosRecorridos = 0;

    public Bicicleta() {
        Vehiculo.vechiculosCreados++;
    }

    public void getKilometrosRecorridos(int kilometros) {
        kilometrosRecorridos += kilometros;
        Vehiculo.kilometrosTotales += kilometros;
        System.out.println("La bicicleta lleva recorridos " + kilometrosRecorridos);
    }

    public void andar(int kilometros) {
        this.kilometrosRecorridos += kilometros;
        Vehiculo.kilometrosTotales += kilometros;
    }

    public void hacerCaballito() {
        System.out.println("Estoy haciendo el caballito que chuchuchuli");
    }

    public void kilometrosTotales() {
        System.out.println("He recorrido " + kilometrosRecorridos + " kilómetros");
    }

}