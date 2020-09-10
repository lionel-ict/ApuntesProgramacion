package ud9_e5_programa;

import java.util.ArrayList;

public class Empresa {
    
    // Atributos
    
    private final String nombre;
    private final String cif;
    private String telefono;
    private String direccion;
    ArrayList<Empleado> listaEmpleados;
    
    // Constructor
    
    public Empresa(String nombre, String cif, String telefono, String direccion)
    {
        this.nombre = nombre;
        this.cif = cif;
        this.telefono = telefono;
        this.direccion = direccion;
        listaEmpleados = new ArrayList<Empleado>();
    }
    
    // Getters y setters
    
    public String getNombre() 
    {
        return nombre;
    }
    
    public String getCIF() 
    {
        return cif;
    }
    
    public String getTelefono() 
    {
        return telefono;
    }
    
    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }
    
    public String getDireccion() 
    {
        return direccion;
    }
    
    public void setDireccion(String direccion) 
    {
        this.direccion = direccion;
    }
    
    public ArrayList getEmpleados() 
    {
        return listaEmpleados;
    }    
    
    // Métodos
    
    // Método para añadir un empleado
    
    public void añadirEmpleado (Empleado e)
    {
        listaEmpleados.add(e);
    }
    
    // Método para eliminar un empleado
    
    public void eliminarEmpleado (Empleado e)
    {
        listaEmpleados.remove(e);
    }
    
    // Método para imprimir la información de todos los empleados
    
    public void imprimeInformacionEmpleados()
    {
        System.out.println("*** INFORMACIÓN DE EMPLEADOS ***");
        
        for (int i = 0; i < listaEmpleados.size(); i++)
        {
            Empleado e = listaEmpleados.get(i);
            e.imprimeEmpleado();
        }
        
        System.out.println("");
    }
    
    
    // Método para imprimir los sueldos de todos los empleados
    
    public void imprimeSueldoEmpleados()
    {
        System.out.println("*** INFORMACIÓN DE SUELDOS DE EMPLEADOS ***");
        
        for (int i = 0; i < listaEmpleados.size(); i++)
        {
            Empleado e = listaEmpleados.get(i);
            System.out.println(e.getDNI() + " -- " + e.getSueldoBruto() + " -- " + e.calculaSueldoNeto());    
        }   
        
        System.out.println("");
    }
    
    // Método para calcular la suma total del sueldo bruto de todos los empleados
    
    public double calcularTotalSueldoBruto()
    {
        double totalSB = 0;
        
        for (int i = 0; i < listaEmpleados.size(); i++)
        {
            Empleado e = listaEmpleados.get(i);
            totalSB+=e.getSueldoBruto();
        }
        
        return totalSB;
        
    }
    
    // Método para calcular la suma total de sueldo neto de todos los empleados
    
    public double calcularTotalSueldoNeto()
    {
        double totalSN = 0;
        
        for (int i = 0; i < listaEmpleados.size(); i++)
        {
            Empleado e = listaEmpleados.get(i);
            totalSN+=e.calculaSueldoNeto();
        }
        
        return totalSN;
        
    }
    
}
