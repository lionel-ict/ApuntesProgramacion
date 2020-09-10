package ud9_e6_vehiculos;

public class Helicoptero extends Aereo{
    
    // Atributo
    private int numeroHelices;
    
    // Constructor
    public Helicoptero(String matricula, String modelo, int numeroAsientos, int numeroHelices)
    {
        super(matricula, modelo, numeroAsientos);
        this.numeroHelices = numeroHelices;
    }
    
    // Getters y setters
    public int getNumeroHelices()
    {
        return this.numeroHelices;
    }
    
    public void setNumeroHelices(int numeroHelices)
    {
        this.numeroHelices = numeroHelices;
    }
    
    // Sobrescritura del método imprimir
    @Override
    public void imprimir()
    {
        super.imprimir();
        
        System.out.println("Helicóptero tiene " + this.getNumeroHelices() + " hélices");
        
    }
    
}
