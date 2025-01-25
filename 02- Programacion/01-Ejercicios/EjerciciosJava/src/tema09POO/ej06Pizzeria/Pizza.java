package tema09POO.ej06Pizzeria;

public class Pizza {

    // Atributos de clase
    protected static int TotalPedidos; // Total de pizzas ordenadas
    protected static int totalServidas; // Numero de pizzas pedidas

    // Atributos de instancia
    private String tipo; // Tipo de pizza 
    private String size; // Tamaño de pizza
    private String estado; // Estado de la pizza (pedida o servida) 

    // Constructor
    public Pizza(String tipo, String size) {
        this.tipo = tipo;
        this.size = size;
        this.estado = "pedida";
        TotalPedidos++;
    }

    // Método para servir la pizza
    public void sirve() {
        if (this.estado.equals("pedida")) {
            this.estado = "servida";
            totalServidas++;
        } else {
            System.out.println("Esa pizza ya se ha servido");
        }
    }

    // Getters y setters
    public static int getTotalPedidas() {
        return TotalPedidos;
    }

    public static int getTotalServidas() {
        return totalServidas = totalServidas;
    }

    public String getEstado() {
        return this.estado = estado;
    }

    public String setEstado() {
        return this.estado;
    }

    // Método toString
    @Override
    public String toString() {
        return "Pizza " + this.tipo + " " + this.size + ", " + this.estado;
    }
}
