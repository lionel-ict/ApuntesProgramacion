package ud9_e7_figuras;

public class Circulo implements iFigura2D {
    
    // Atributos
    private double radio;
        
    // Constructor
    public Circulo(double radio)
    {
        this.radio = radio;               
    }
    
    // Getters y setters
    public double getRadio() 
    {
        return radio;
    }
    
    public void setRadio(double radio) 
    {
        this.radio = radio;
    }
            
    // Implementantación de los métodos de la interfaz
    public double perimetro() 
    {
        return 2 * Math.PI * radio;
    }
    
    public double area() 
    {
        return Math.PI * Math.pow(radio, 2);
    }
    
    public void escalar(double escala) 
    {
        if(escala > 0) 
        {
            radio *= escala;
        } 
        else 
        {
            System.out.println("ERROR: La escala debe ser mayor que cero.");
        }
    }
    
    public void imprimir()
    {
        System.out.println("CÍRCULO --> Radio: " + this.getRadio() + " Perímetro: " + this.perimetro() + " Área: " + this.area());
    }   
    
}
