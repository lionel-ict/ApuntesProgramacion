import java.io.*;
import java.util.*;

public class UD11_Ejercicio_B6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        try {
            // Pedimos el numero entero a buscar
            System.out.print("Introduce el número entero a buscar: ");
            String numeroBuscar = teclado.nextLine();  
            
            // Intentamos abrir el fichero 'pi-million.txt'
            File fileNumeroPI = new File("Documentos/pi-million.txt");
            Scanner lector = new Scanner(fileNumeroPI);
            
            //Cogemos todos los decimales del número PI del fichero
            String decimalesPI = (lector.nextLine()).substring(2);
            lector.close();
            
            boolean encontrado = false;
            
            for (int i = 0; i < decimalesPI.length() - numeroBuscar.length(); i++) 
            {
                // Comparamos si 'numeroBuscar' está en el substring de 'decimalesPI' 
                if(numeroBuscar.equals(decimalesPI.substring(i, i+numeroBuscar.length())))
                {
                    encontrado = true;
                    break;
                }
            }
            
            if(encontrado)
            {
                System.out.println("El número " + numeroBuscar + " ha sido encontrado" );
            }
            else
            {
                System.out.println("El número " + numeroBuscar + " no ha sido encontrado" );
            }
            
        } catch (FileNotFoundException e){
            System.out.println("Error: El fichero no existe");
        }catch (Exception e) {
            System.out.println("Error: " + e);
        } 
    }    
}
