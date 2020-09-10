
abstract class Ave extends Mascota {

    // Atributos
    private String pico;
    private boolean vuela;

    // Constructor
    Ave(String nombre, int edad, String estado, String fechaNac, String pico, boolean vuela) {
        super(nombre, edad, estado, fechaNac);
        this.pico = pico;
        this.vuela = vuela;
    }

    // MÉTODOS ABSTRACTOS
    
    abstract void muestra();

    abstract void habla();

    abstract void volar();

    // GETTERS Y SETTERS
    
    public String getPico() {
        return pico;
    }
    
    public void setPico(String pico) {
        this.pico = pico;
    }

    public boolean getVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }
}
