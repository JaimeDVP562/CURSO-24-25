package clases;


public abstract class Mascota {

    String chip;
    String nombre;
    int edad;
    boolean vacunada;
    public static int totalMascotas = 0;

    Mascota(){
        this.vacunada = false;
        totalMascotas++;
    }


    



    //Creamos getters para poder ver los atributos en otras clases
    public String getChip(){
        return this.chip;
    }

    public String getNombre(){
        return this.nombre;
    }


    public int getEdad(){
        return this.edad;
    }

    public boolean getVacunada(){
        return this.vacunada;
    }

    



    //Creamos los setters para poder modificar las variables

    public void setVacunada(boolean vacunada){
        this.vacunada = vacunada;
    }


    public void setEdad(int edad){
        this.edad = edad;
    }




//Creamos las 2 clases abstractas
    public abstract void pasear();

    public abstract void jugar();



    public void vacunar(){
        this.vacunada = true;
            
        }



    public boolean estado(){

        return vacunada;
    }
    
    
    public String toString(){
        return "[" + this.chip + "]: " + this.nombre +", " + this.edad + " años";
    }
}
