
package clases;

import java.util.Objects;

public class Pelicula {
    private String codigo;
    private String titulo;
    private int estreno;
    private boolean vista;

    public Pelicula(String codigo, String titulo, int estreno) {
        if (codigo == null || titulo == null || estreno <= 0) {
            throw new IllegalArgumentException("ninguno de los valores puede ser nulo");
        }
        this.codigo = codigo;
        this.titulo = titulo;
        this.estreno = estreno;
        this.vista = false;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getEstreno() {
        return estreno;
    }

    public void setVista(boolean vista) {
        this.vista = vista;
    }

    public boolean getVista() {
        return vista;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Pelicula pelicula = (Pelicula) obj;
        return codigo.equals(pelicula.getCodigo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "Pelicula [codigo=" + codigo + ", titulo=" + titulo + ", estreno=" + estreno + "]";
    }
}
