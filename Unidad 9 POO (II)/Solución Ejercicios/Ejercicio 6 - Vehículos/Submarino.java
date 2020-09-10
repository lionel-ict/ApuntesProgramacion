package ud9_e6_vehiculos;

public class Submarino extends Acuatico {
    
    // Atributos
    private double profundidadMax;
    
    // Constructor
    public Submarino(String matricula, String modelo, double eslora, double profundidadMax) 
    {
        super(matricula, modelo, eslora);       
        this.profundidadMax = profundidadMax;       
    }
    
    // Getters y setters
    public double getProfundidadMax() 
    {
        return profundidadMax;
    }
    
    public void setProfundidadMax(double profundidadMax) 
    {
        this.profundidadMax = profundidadMax;
    }    
    
    // Sobrescritura del método imprimir
    @Override
    public void imprimir() 
    {
        super.imprimir();
        
        System.out.println("Submarino tiene una profundidad máxima de: " + this.getProfundidadMax());
    }
    
}
