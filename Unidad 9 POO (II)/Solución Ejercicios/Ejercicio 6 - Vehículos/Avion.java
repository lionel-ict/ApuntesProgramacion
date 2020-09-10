package ud9_e6_vehiculos;

public class Avion extends Aereo{
    
    // Atributo
    private double tiempoMaxVuelo;
    
    // Constructor
    public Avion(String matricula, String modelo, int numeroAsientos, double tiempoMaxVuelo)
    {
        super(matricula, modelo, numeroAsientos);
        this.tiempoMaxVuelo = tiempoMaxVuelo;
    }
    
    // Getters y setters
    public double getTiempoMaxVuelo()
    {
        return this.tiempoMaxVuelo;
    }
    
    public void setTiempoMaxVuelo(double tiempoMaxVuelo)
    {
        this.tiempoMaxVuelo = tiempoMaxVuelo;
    }
    
    // Sobrescritura del método imprimir
    @Override
    public void imprimir()
    {
        super.imprimir();
        
        System.out.println("Avión tiene un tiempo máximo de vuelo de: " + this.getTiempoMaxVuelo());
        
    }
}
