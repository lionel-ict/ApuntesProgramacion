package ud9_e7_figuras;

public class Rectangulo implements iFigura2D {
    
    // Atributos
    private double ancho;
    private double alto;
    
    // Constructor
    public Rectangulo(double ancho, double alto)
    {
        this.ancho = ancho;
        this.alto = alto;        
    }
    
    // Getters y setters
    public double getAncho() 
    {
        return ancho;
    }
    
    public void setAncho(double ancho) 
    {
        this.ancho = ancho;
    }
    
    public double getAlto() 
    {
        return alto;
    }
    
    public void setAlto(double alto) 
    {
        this.alto = alto;
    }
    
    // Implementantación de los métodos de la interfaz
    public double perimetro() 
    {
        return (ancho + alto) * 2;
    }
    
    public double area() 
    {
        return ancho * alto;
    }
    
    public void escalar(double escala) 
    {
        if(escala > 0) 
        {
            ancho *= escala;
            alto *= escala;
        } 
        else 
        {
            System.out.println("ERROR: La escala debe ser mayor que cero.");
        }
    }
    
    public void imprimir()
    {
        System.out.println("RECTÁNGULO --> Ancho: " + this.getAncho() + " Alto: " + this.getAlto() + " Perímetro: " + this.perimetro() + " Área: " + this.area());
    }   
    
    
}
