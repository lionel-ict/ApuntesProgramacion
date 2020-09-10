
public class Producto {

    // Atributos
    private String nombre;
    private int cantidad;

    // Constructor
    public Producto(String nom, int cant) {
        this.nombre = nom;
        this.cantidad = cant;
    }

    // GETTERS Y SETTERS
    ;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
