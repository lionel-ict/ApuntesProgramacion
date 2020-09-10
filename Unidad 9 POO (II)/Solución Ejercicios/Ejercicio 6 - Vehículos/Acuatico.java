package ud9_e6_vehiculos;

public class Acuatico extends Vehiculo {
    
    // Atributo
    private final double eslora;
       
    // Constructor
    public Acuatico(String matricula, String modelo, double eslora)
    {
        super(matricula, modelo);
        
        if(matricula.matches("[a-zA-Z]{3,10}")) 
        {
            this.eslora = eslora;
        }
        else
        {
            this.eslora = 0;
            System.out.println("ERROR: Matrícula no válida");
        }        
    }
    
    // Getters
    public double getEslora()
    {
        return eslora;
    }
    
    // Sobreescritura del método abstracto 
    @Override
    public void imprimir()
    {
        System.out.println("Vehículo acuático --> Matrícula: " + this.getMatricula() + " - Modelo: " + this.getModelo() + " - Eslora: " + this.getEslora());        
    }
    
}
