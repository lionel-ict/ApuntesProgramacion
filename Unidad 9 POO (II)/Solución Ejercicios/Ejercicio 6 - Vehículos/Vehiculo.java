package ud9_e6_vehiculos;

public abstract class Vehiculo {
    
    // Atributos    
    private final String matricula;
    private final String modelo;
    
    // Constructor    
    public Vehiculo(String matricula, String modelo)
    {
        this.matricula = matricula;
        this.modelo = modelo;
    }
    
    // Getters    
    public String getMatricula() 
    {
        return matricula;
    }

    public String getModelo() 
    {
        return modelo;
    }
    
    // Método abstracto para imprimir. Debe implementarse en todas las clases hijas.    
    public abstract void imprimir();    
    
}
