package ud9_e6_vehiculos;

public class Barco extends Acuatico {
    
    // Atributo
    private boolean tieneMotor;
    
    // Constructor
    public Barco(String matricula, String modelo, double eslora, boolean tieneMotor)
    {
        super(matricula, modelo, eslora);
        this.tieneMotor = tieneMotor;
    }
    
    // Getters y setters
    public boolean getTieneMotor()
    {
        return this.tieneMotor;
    }
    
    public void setTieneMotor(boolean tieneMotor){
        this.tieneMotor = tieneMotor;
    }    
    
    // Sobrescritura del método imprimir
    @Override
    public void imprimir()
    {
        super.imprimir();
        
        if(this.tieneMotor)
        {
            System.out.println("Barco con motor");
        }
        else
        {
            System.out.println("Barco sin motor");
        }        
    }    
    
}
