package clases;
//Ignacio Lopez calderon


public class Gato extends Mascota {

    private String pelaje;
    public int totalGatos = 0;


    Gato(){}

    Gato(String chip){
        chip = getChip();
    }

    public Gato(String chip, String nombre){
        chip = getChip();
        nombre = getNombre();
    }



    //Getters
    public String getPelaje(){
        return this.pelaje;
    }


    //Setters
    public void setPelaje(String pelaje){
        this.pelaje = pelaje;
    }


    //La damos valor a la funcion de la clase abstracta "mascotas"
    public void jugar(){
        
                System.out.println(getNombre() + " Se tumba con un ovillo de lana y lo araña");
    }



    //Como pongo las funciones abstractas en perro



    public void maullar(){
        System.out.println("Miaaauuuuu! Brrrrrr...");
    }

    public void bufar(){
        System.out.println("Fuuuuuuu....");
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
                maullar();
                jugar();
            }
        }
    }



    @Override
    public void vacunar() {
        if (getVacunada() == false) {
            setVacunada(true);
            bufar();
        } else{System.out.println(getNombre() + " ya ha sido vacunado/a");}
        
    }



}


