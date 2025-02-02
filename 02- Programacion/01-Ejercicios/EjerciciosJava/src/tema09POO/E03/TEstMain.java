package tema09POO.E03;

public class TEstMain {

        public static void main(String[] args) {

                // Instanciamos las clases con los constructores
                Mamifero mamifero1 = new Mamifero("Rigoberto");
                Ave ave1 = new Ave("Piolin");
                Gato gato1 = new Gato("Felix", 3, "1111111", "persa", "blaco");

                // Instanciamos las clases con GETTERS y SETTERS
                Perro perro1 = new Perro(); // Creamos perro
                perro1.setNombre("Darta");
                perro1.setColor("camel");
                perro1.setRaza("cokel");

                Gato gato2 = new Gato(); // Creamos gato
                gato2.setNombre("Darta");
                gato2.setSexo("macho macho");

                // Llamamos a los metodos de las clases
                System.out.println("Nuestro mamífero que tenemos se llama " + mamifero1.nombre + " y "
                                + mamifero1.amamantar());
                System.out
                                .println(
                                                "Nuestro ave " + ave1.getNombre() + " " + ave1.volar()
                                                                + " y a la vez que "
                                                                + ave1.ponerHuevos());

                System.out.println("Mi gato " + gato1.getNombre() + " tiene " + gato1.getEdad() + " años, su DNI es "
                                + gato1.getDni() + " y es de raza " + gato1.raza + " y de color " + gato1.color);
                System.out.println("Mi perro  " + perro1.getNombre() + " es de color " + perro1.getColor()
                                + " y es de raza " + perro1.getRaza());
                System.out.println("Mi gato " + gato2.getNombre() + " tiene " + gato2.getEdad() + " años ");
        }

}
