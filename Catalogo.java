
package clases;

import java.util.ArrayList;
import java.util.List;

public class Catalogo<T> implements CatalogoInterface<T> {
    // voy a usar el ArrayList porque es el que mas he usado en los ejercicios.

    private List<T> coleccion;

    public Catalogo() {
        this.coleccion = new ArrayList<>();
    }

    @Override
    public boolean aniadir(T elemento) {
        if (coleccion.contains(elemento)) {
            return false;
        } else {
            coleccion.add(elemento);
            return true;
        }
    }

    @Override
    public void eliminar(T elemento) {
        coleccion.remove(elemento);
    }

    @Override
    public ArrayList<T> recuperarElementos() {
        List<T> copiaColeccion = new ArrayList<>(coleccion);
        return (ArrayList<T>) copiaColeccion;
    }

}
