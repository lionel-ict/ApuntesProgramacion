/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * Ejercicio 13: Programa que lee dos números y los visualiza 
 *               en orden ascendente.
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero1, numero2;
        
        System.out.print("Introduce el primer número: ");
        numero1 = entrada.nextInt(); 
        
        System.out.print("Introduce el segundo número: ");
        numero2 = entrada.nextInt(); 
        
        System.out.print("El orden es: ");
        
        if(numero1 < numero2)
            System.out.println(numero1 + "," + numero2);
        else
            System.out.println(numero2 + "," + numero1);
    }
    
}
