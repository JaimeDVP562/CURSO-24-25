package clases;
//Ignacio Lopez calderon


public class Clinica implements interfaces.ClinicaInterfaz {
    private static final int MAX = 100;

    Mascota[] listado = new Mascota[MAX];


        /**
     * Comprueba si el listado de mascotas está o no vacío devolviendo 
     * true o false en cada caso.
     * @return
     */
    public boolean esVacia(){
        boolean vacia = true;

        for(int i = 0; i < listado.length && vacia == true; i++){
            if (listado[i] != null) {
                vacia = false;
            }
        }

        return vacia;
    }
    


    /**
     * Comprobará si el listado de mascotas está completo o no. En el 
     * primer caso devolverá true y en el segundo false.
     * @return
     */
    public boolean esLlena(){
        boolean llena = true;
        for(int i = 0; i < listado.length && llena; i++){
            if (listado[i] == null) {
                llena = false;
            }
        }

        return llena;
    }

    /**
     * Devuelve el número total de perros que se han dado de alta en 
     * la aplicación.
     * @return
     */
    public int totalPerros(){
        for(int i = 0; i < listado.length; i++){
            if () {
                
            }
        }
    }

    /**
     * Devuelve el número total de gatos que se han dado de alta en 
     * la aplicación.
     * @return
     */
    public int totalGatos(){}

    /**
     * Devuelve el número total de mascotas que se han dado de alta en 
     * la aplicación.
     * @return
     */
    public int totalMascotas(){
        return Mascota.totalMascotas;
    }

    /**
     * Busca una mascota por el valor de la propiedad chip y la devuelve 
     * si se encuentra en el listado; en otro caso, devuelve null.
     * @return
     */
    public Mascota buscarChip(String chip){
        Mascota buscada = null;

        for(int i = 0; i < listado.length;i++){
            if(listado[i].getChip() == chip){
                buscada = listado[i];
            }
        }

        return buscada;

    }

    /**
     * Agrega una mascota, bien sea perro o gato, al listado de la clínica.
     * @param mascota
     * @return
     */
    public void agregar(Mascota mascota){
        boolean hueco = false;
        for(int i = 0; i < listado.length && !hueco; i++){
            if(listado[i] == null){
                listado[i] = mascota;
                hueco = true;
                mascota.totalMascotas++;

                
            }
        }
    }
    /**
     * Muestra un listado de mascotas 
     */
    public void listar(){
        for(int i = 0; i < listado.length; i++){
            if (listado[i] != null) {
                System.out.println("[" + listado[i].getChip() + "]: " + listado[i].getNombre() +", " + listado[i].getEdad() + " años");
            }
        }
    }

}
