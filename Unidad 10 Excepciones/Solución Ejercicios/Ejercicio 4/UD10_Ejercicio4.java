package ud10_ejercicio4;

import java.util.*;

public class UD10_Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        int N = (int)(Math.random() * 100 + 1);
        int[] vector = new int[N];
        
        for(int i = 0; i < N; i++)
        {
            vector[i] = (int)(Math.random() * 10 + 1);
        }
        
        int valor = 0;
        
        do{
            try
            {
                System.out.println("Introduce la posición del vector para mostrar: (número negativo para salir)");
                valor = in.nextInt();
                System.out.println("Valor en el vector: " + vector[valor]);  
                in.nextLine();                
            }
            catch(InputMismatchException e)
            {
                System.out.println("Valor introducido incorrecto");
                in.nextLine();                
            }
            catch(ArrayIndexOutOfBoundsException e) 
            {
                if(valor >= 0)
                {
                    System.out.println("Posición fuera de los límites del vector");   
                }                        
            }                    
            
        } while(valor >= 0);
        
        System.out.println("Salida del programa");
             
    }    
}
