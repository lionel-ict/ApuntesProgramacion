package ud10_ejercicio5;

import java.util.*;

public class UD10_Ejercicio5 {

    public static void main(String[] args) throws Exception{
        
        Scanner in = new Scanner(System.in);
        int num;        

        for(int i = 0; i < 5; i++)        
        {
            try
            {
                System.out.print("Introduce un entero positivo: ");
                num = in.nextInt();
                imprimePositivo(num);
                
                System.out.print("Introduce un entero negativo: ");
                num = in.nextInt();
                imprimeNegativo(num);
            }
            catch(InputMismatchException e)
            {
                System.out.println("Valor introducido incorrecto");
                in.nextLine();                
            }
            catch(Exception e)
            {
                System.out.println(e);            
            } 
        }
    }
    
    static void imprimePositivo(int p) throws Exception
    {
        if(p < 0)
        {
            throw new Exception ("Error: número negativo");
        }
        
        System.out.println("El número positivo es el: " + p);        
    }
    
    static void imprimeNegativo(int n) throws Exception
    {
        if(n >= 0)
        {
            throw new Exception("Error: número positivo");
        }
        
        System.out.println("El número negativo es el: " + n);
    }
}
