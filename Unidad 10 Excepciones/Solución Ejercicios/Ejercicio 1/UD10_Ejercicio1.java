package ud10_ejercicio1;

import java.util.*;

public class UD10_Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int A;       
        
        try
        {
            System.out.print("Introduce un número entero: ");
            A = in.nextInt();
            
            System.out.println("Valor introducido: " + A); 

        }
        catch(InputMismatchException e)
        {
            System.out.println("Valor introducido incorrecto");
            e.printStackTrace();            
        }
        
        System.out.println("Fin del programa");
        
    }    

}
