package ud9_e7_figuras;

public class Cuadrado implements iFigura2D {
    
    // Atributos
    private double lado;
    
    // Constructor
    public Cuadrado(double lado)
    {
        this.lado = lado;
    }
    
    // Getters y setters    
    public double getLado() 
    {
        return lado;
    }

    public void setLado(double lado) 
    {
        this.lado = lado;
    }
    
    // Implementantación de los métodos de la interfaz
    public double perimetro()
    {
        return lado * 4;
    }
    
    public double area()
    {
        return Math.pow(lado, 2);
    }
    
    public void escalar(double escala)
    {
        if(escala > 0)
        {
            lado *= escala;
        }
        else
        {
            System.out.println("ERROR: La escala debe ser mayor que 0.");
        }
    }
    
    public void imprimir()
    {
        System.out.println("CUADRADO --> Lado: " + this.getLado() + " Perímetro: " + this.perimetro() + " Área: " + this.area());
    }
    
    
    
    
}
