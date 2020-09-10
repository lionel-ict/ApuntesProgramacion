package ud9_e6_vehiculos;

public class Terrestre extends Vehiculo {
    
    // Atributo
    private final int numeroRuedas;
    
    // Constructor
    public Terrestre(String matricula, String modelo, int numeroRuedas)
    {                
        super(matricula, modelo);
        
        if(matricula.matches("[0-9]{4}[a-zA-Z]{3}")) 
        {
           this.numeroRuedas = numeroRuedas;  
        }
        else
        {
            this.numeroRuedas = 0;
            System.out.println("ERROR: Matrícula no válida");
        }     
    }
    
    // Getters
    public int getNumeroRuedas()
    {
        return this.numeroRuedas;
    }  
    
    // Sobreescritura del método abstracto
    @Override
    public void imprimir()
    {
        System.out.println("Vehículo terrestre --> Matrícula: " + this.getMatricula() + " - Modelo: " + this.getModelo() + " - Nº ruedas: " + this.getNumeroRuedas());
    }
    
}
