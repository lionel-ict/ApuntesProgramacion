package ud10_ejercicio3;

import java.util.*;

public class UD10_Ejercicio3 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        double[] vector = new double[5];       
        
        
        for(int i = 0; i < vector.length; i++)
        {
            try
            {            
                System.out.println("Introduce el valor de la posición " + i);
                vector[i] = in.nextDouble();
            }
            catch(InputMismatchException e)
            {
                System.out.println("Valor introducido incorrecto. Vuelve a introducir el valor...");
                e.printStackTrace(); 
                in.nextLine();
                i--;
            }             
        }
        
        mostrarVector(vector);
        
    }
    
    public static void mostrarVector(double[] v)
    {
       System.out.print("Datos del vector [ ");

        for(int j = 0; j < v.length; j++)
        {
            System.out.print(v[j] + ", ");
        }

        System.out.println("\b\b ]"); 
    }
    
}
