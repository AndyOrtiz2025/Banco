public class Cliente {
    private String nombre; // Nombre del cliente
    private boolean esPrioritario; // Si el cliente es prioritario o no

    // Constructor para crear un nuevo cliente
    public Cliente(String nombre, boolean esPrioritario) {
        this.nombre = nombre;
        this.esPrioritario = esPrioritario;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean esPrioritario() {
        return esPrioritario;
    }

    @Override
    public String toString() {
        return nombre + (esPrioritario ? " (PROPIETARIO)" : "");
    }
}