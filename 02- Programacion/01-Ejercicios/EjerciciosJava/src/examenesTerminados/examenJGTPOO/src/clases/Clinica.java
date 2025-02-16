package clases;

public class Clinica implements interfaces.ClinicaInterfaz {

    // Array para almacenar las mascotas
    private final Mascota[] mascotas;
    private int contadorPerros = 0;
    private int contadorGatos = 0;

    public Clinica() {
        mascotas = new Mascota[100];
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void agregar(Mascota mascota) {
        // Primero buscamos que tengamos hueco
        for (int i = 0; i < mascotas.length; i++) {
            if (mascotas[i] == null) {
                mascotas[i] = mascota;

                // Si es un Perro, aumentas el contador de perros si no es un gato y aumentamos
                // el contador de gatos
                if (mascota instanceof Perro) {
                    contadorPerros++;
                } else if (mascota instanceof Gato) {
                    contadorGatos++;
                }
                break;
            }
        }
    }

    @Override
    public Mascota buscarChip(String chip) {
        for (Mascota mascota : mascotas) {
            if (mascota != null && mascota.getChip().equals(chip)) {
                return mascota;
            }
        }
        return null; // Si no se encuentra la mascota
    }

    @Override
    public boolean esLlena() {
        return totalMascotas() == mascotas.length;
    }

    @Override
    public boolean esVacia() {
        return totalMascotas() == 0;
    }

    @Override
    public void listar() {
        for (Mascota mascota : mascotas) {
            if (mascota != null) {
                System.out.println(mascota);
            }
        }
    }

    @Override
    public int totalGatos() {
        return contadorGatos;
    }

    @Override
    public int totalPerros() {
        return contadorPerros;
    }

    @Override
    public int totalMascotas() {
        return contadorPerros + contadorGatos;
    }

}
