package ud10_ejercicio7;

import java.util.*;

public class UD10_Ejercicio7 {
  
    public static void main(String[] args) {
        
        // Creamos el ArrayList de tipo Gato
        ArrayList<Gato> listaGatos = new ArrayList<Gato>();
        
        Scanner in = new Scanner(System.in);
        
        String nombre = "";
        int edad = 0;
        
        do
        {            
            try
            {
                // Pedimos por teclado el nombre y la edad del gato
                System.out.print("Introduce el nombre del gato: ");
                nombre = in.nextLine();
                
                System.out.print("Introduce la edad del gato: ");
                edad = in.nextInt();
                in.nextLine();
                
                // Creamos el objeto Gato
                Gato g = new Gato(nombre, edad);
                
                // Añadimos el objeto Gato al ArrayList
                listaGatos.add(g);
                
            }
            catch(Exception e)
            {
                System.out.println(e);                
            }
            
        }while(listaGatos.size() < 5);
        
        // Recorre el ArrayList de tipo Gato e imprime por pantalla la información del Gato
        for(int i = 0; i < listaGatos.size(); i++)
        {
            System.out.println("Gato " + i);
            Gato g = listaGatos.get(i);
            g.imprimir();
        }        
    }    
}
