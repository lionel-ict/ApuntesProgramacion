/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * Ejercicio 15: Programa que lea tres números distintos y nos diga 
 *               cuál es el mayor. 
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1, numero2, numero3;

        System.out.print("Introduce el primer número: ");
        numero1 = entrada.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        numero2 = entrada.nextInt();
        
        System.out.print("Introduce el tercer número: ");
        numero3 = entrada.nextInt();
        
        if(numero1 > numero2)
        {
            if(numero1 > numero3)
                System.out.println("El mayor es " + numero1);
            else
                System.out.println("El mayor es " + numero3);
        }
        else
        {
            if(numero2 > numero3)
                System.out.println("El mayor es " + numero2);
            else
                System.out.println("El mayor es " + numero3);
        }
    }
    
}
