package ud9_e6_vehiculos;

public class Aereo extends Vehiculo {
    
    // Atributo
    private final int numeroAsientos;
    
    // Constructor
    public Aereo(String matricula, String modelo, int numeroAsientos)
    {
        super(matricula, modelo);
        
        if(matricula.matches("[a-zA-Z]{4}[0-9]{6}")) 
        {
            this.numeroAsientos = numeroAsientos;
        }
        else
        {
            this.numeroAsientos = 0;
            System.out.println("ERROR: Matrícula no válida");
        }
        
    }
    
    // Getters
    public int getNumeroAsientos()
    {
        return this.numeroAsientos;
    }
    
    // Sobreescritura del método abstracto      
    @Override
    public void imprimir()
    {
        System.out.println("Vehículo aéreo --> Matrícula: " + this.getMatricula() + " - Modelo: " + this.getModelo() + " - Nº asientos: " + this.getNumeroAsientos());        
    }
    
}
