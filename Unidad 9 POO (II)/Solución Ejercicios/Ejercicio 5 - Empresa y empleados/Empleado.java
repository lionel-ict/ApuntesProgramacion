package ud9_e5_programa;

public class Empleado {
    
    // Atributos
    
    private final String nombre;
    private final String dni;
    private double sueldoBruto;
    private int edad;
    private String  telefono;
    private String direccion;
    
    // Constructores
    
    public Empleado(String nombre, String dni, double sueldoBruto) 
    {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBruto = sueldoBruto;
        this.edad = 0;
        this.telefono = "";
        this.direccion = "";
    }    
    
    public Empleado(String nombre, String dni, double sueldoBruto, int edad, String telefono, String direccion)
    {        
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBruto = sueldoBruto;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;       
    }    
    
    // Getters y setters 
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public String getDNI()
    {
        return this.dni;
    } 
    
    public double getSueldoBruto()
    {
        return this.sueldoBruto;
    }
    
    public void setSueldoBruto(double sueldoBruto)
    {
        this.sueldoBruto = sueldoBruto;
    }
    
    public int getEdad()
    {
       return edad;       
    }
    
    public void setEdad(int edad)
    {
        this.edad = edad;
    }
    
    public String getTelefono()
    {
        return this.telefono;
    }
    
    public void setTelefono(String telefono)
    {
        this.telefono = telefono;        
    }
    
    public String getDireccion()
    {
        return this.direccion;
    }
    
    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }
    
    // Métodos
    
    // Método para calcular el sueldo neto del empleado
    
    public double calculaSueldoNeto()
    {
        double irpf = 0;        
        
        double sueldoBrutoAnual = this.getSueldoBruto() * 12;
        
        if(sueldoBrutoAnual < 12000)
        {
            irpf = 20.0;            
        }
        else if (sueldoBrutoAnual >= 12000 && sueldoBrutoAnual <= 25000)
        {
            irpf = 30.0;
        }
        else 
        {
            irpf = 40.0;
        }
        
        return this.sueldoBruto * (1 - irpf/100);
    }
    
    
    // Método para imprimir la información del empleado
    
    public void imprimeEmpleado() 
    {
        System.out.println("Empleado --> Nombre: " + this.getNombre() + "  DNI: " + this.getDNI() + "  Sueldo Bruto: " + this.getSueldoBruto() + "  Edad: " + this.getEdad() + "  Teléfono: " + this.getTelefono() + "  Dirección: " + this.getDireccion());
    }   
    
    
}
