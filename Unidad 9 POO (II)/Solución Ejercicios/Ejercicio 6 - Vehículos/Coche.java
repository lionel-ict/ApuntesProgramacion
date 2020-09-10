package ud9_e6_vehiculos;

public class Coche extends Terrestre {
    
    // Atributo
    private boolean tieneAA;
    
    // Constructor
    public Coche (String matricula, String modelo, int numeroRuedas, boolean tieneAA)
    {
        super(matricula, modelo, numeroRuedas);
        this.tieneAA = tieneAA;
    }
    
    // Getters y setters
    public boolean getTieneAA()
    {
        return this.tieneAA;
    }
    
    public void setTieneAA(boolean tieneAA)
    {
        this.tieneAA = tieneAA;
    }
    
    // Sobrescritura del método imprimir
    @Override
    public void imprimir()
    {
        super.imprimir();
        
        if(this.tieneAA)
        {
            System.out.println("Coche con aire accondicionado");
        }
        else
        {
            System.out.println("Coche sin aire acondicionado");
        }       
    }    
}
