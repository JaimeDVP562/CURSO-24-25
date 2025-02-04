package clases;

//Ignacio Lopez calderon
public class Perro extends Mascota {
    
    private String raza;
    public int totalPerros = 0;

    Perro(){}

    public Perro(String chip){
        super();
        this.chip = chip;
    }

    public Perro(String chip, String nombre){
        super();
        this.chip = chip;
        this.nombre = nombre;
    }



    //getters/

    public String getRaza(){
        return this.raza;
    }

    //Setters/
    public void setRaza(String raza){
        this.raza = raza;
    }

    //La damos valor a la funcion de la clase abstracta "mascotas"
    public void jugar(){
        int opcion = 0;

        opcion = (int) (Math.random() * 8 + 1);

        switch (opcion) {
            case 1:
            System.out.println(getNombre() + " Corre tras una pelota y la trae de vuelta");
                break;
            case 2:
            System.out.println(getNombre() + " juega con su mordedor");
                break;
            case 3:
            System.out.println(getNombre() + " Muerde un juguete de goma y lo sacude con fuerza");
                break;
            case 4:
            System.out.println(getNombre() + " Escarba en la tierra buscando algo interesante");
                break;
            case 5:
            System.out.println(getNombre() + " Encuentra un palo y lo mastica felizmente");
                break;
            case 6:
            System.out.println(getNombre() + " Salta sobre el sofá y espera que le lancen su juguete favorito");
                break;
            case 7:
            System.out.println(getNombre() + " Juega con otros perros en el parque y mueve la cola emocionado ");
                break;
            case 8:
            System.out.println(getNombre() + " Rueda por el suelo pidiendo más juego");
                break;
        }
    }



    



    public void ladrar(){
        System.out.println("¡Guau! ¡Guau!");
    }

    public void gruñir(){
        System.out.println("Grrrrrr....");
    }


    

    public void pasear(){
        String nombre;

        System.out.println("Introduce el nombre de la mascota:");
        nombre = System.console().readLine();
        if (getNombre().equals(nombre)) {
            if (getVacunada() == false) {
                System.out.println(nombre + " no puede pasear hasta ser vacunado/a.");
                vacunar();
            } else{
                ladrar();
                jugar();
            }
        }
    }



    @Override
    public void vacunar() {
        if (getVacunada() == false) {
            setVacunada(true);
            gruñir();
        } else{System.out.println(getNombre() + " ya ha sido vacunado/a");}
        
    }



}
