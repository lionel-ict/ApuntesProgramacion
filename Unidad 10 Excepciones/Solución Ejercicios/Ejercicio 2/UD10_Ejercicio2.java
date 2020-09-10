package ud10_ejercicio2;

import java.util.*;

public class UD10_Ejercicio2 {
    
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        int A,B, result;       
        
        try
        {
            System.out.println("Introduce el numerador: ");
            A = in.nextInt();
            
            System.out.println("Introduce el denominador: ");
            B = in.nextInt();
            
            result = A / B;
            
            System.out.println(A + " / " + B + " = " + result);         
            
        }
        catch (InputMismatchException e)
        {
            System.out.println("Valor introducido incorrecto");
            e.printStackTrace();             
        }
        catch (ArithmeticException e) 
        {
            System.out.println("División entre cero: " + e); 
            e.printStackTrace(); 
        }
        
        System.out.println("Fin del programa");
    }
}
