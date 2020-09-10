
abstract class Mascota {

    // Atributos
    private String nombre;
    private int edad;
    private String estado;
    private String fechaNac;

    // Constructor
    public Mascota(String nombre, int edad, String estado, String fechaNac) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNac = fechaNac;
    }

    // MÉTODOS ABSTRACTOS

    abstract void muestra();

    abstract void habla();

    // OTROS MÉTODOS
    
    public void cumpleaños() {
        this.edad = this.edad + 1;
    }

    public void morir() {
        this.estado = "Muerto";
    }

    // GETTERS Y SETTERS
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

}
