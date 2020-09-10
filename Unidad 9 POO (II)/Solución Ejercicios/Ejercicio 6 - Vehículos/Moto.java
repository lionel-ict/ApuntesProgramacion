package ud9_e6_vehiculos;

public class Moto extends Terrestre{
    
     // Atributo
    private String color;
    
    // Constructor
    public Moto (String matricula, String modelo, int numeroRuedas, String color)
    {
        super(matricula, modelo, numeroRuedas);
        this.color = color;
    }
    
    // Getters y setters
    public String getColor()
    {
        return this.color;
    }
    
    public void setTieneAA(String color)
    {
        this.color = color;
    }
    
    // Sobrescritura del método imprimir
    @Override
    public void imprimir()
    {
        super.imprimir();
        
        System.out.println("Moto de color " + this.getColor());               
    }
    
}
