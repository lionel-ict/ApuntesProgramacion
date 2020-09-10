package ud10_ejercicio6;

public class UD10_Ejercicio6 {
   
    public static void main(String[] args) {
        
        try
        {            
            // Creamos varios objetos de tipo Gato
            Gato g1 = new Gato("Cati", 5);
            Gato g2 = new Gato("Miau",3);
            Gato g3 = new Gato("Milú", 2);
            
            // Modificamos los datos de los objetos
            g1.imprimir();
            g1.setNombre("Gatito");
            g1.setEdad(10);
            g1.imprimir();
            
            g2.imprimir();
            //g2.setNombre("Do");
            //g2.imprimir();
            
            g3.imprimir();
            //g3.setEdad(-5);
            //g3.imprimir();
            
        }
        catch(Exception e)
        {
            System.out.println(e);            
        }
        
        System.out.println("Fin del programa");            
        
    }    
}
