package tema09POO.E04;

public class Coche extends Vehiculo {

    public int kilometrosRecorridos = 0;

    public Coche() {
        Vehiculo.vechiculosCreados++;
    }

    public void getKilometrosRecorridos() {
        System.out.println("El coche lleva recorridos " + kilometrosRecorridos + " kilometros");
    }

    public int andar(int kilometros) {
        this.kilometrosRecorridos += kilometros;
        Vehiculo.kilometrosTotales += kilometros;
        return kilometrosRecorridos;
    }

    public void quemarRueda() {
        System.out.println("Estoy quemando rueda con el coche me creo suuuper guay");
    }

}
