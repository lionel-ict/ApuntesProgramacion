/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * Ejercicio 10: Programa que lee dos números, calcula y muestra 
 *               el valor de su suma, resta, producto y división. 
 *              (Ten en cuenta la división por cero ).
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numero1, numero2, suma, resta, producto, division;

        System.out.print("Introduce el primer número: ");
        numero1 = entrada.nextFloat();
        
        System.out.print("Introduce el segundo número: ");
        numero2 = entrada.nextFloat();
        
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        producto = numero1 * numero2;
        
        System.out.println("Los resultados son:");
        System.out.println(numero1 + " + " + numero2 + " = " + suma);
        System.out.println(numero1 + " - " + numero2 + " = " + resta);
        System.out.println(numero1 + " * " + numero2 + " = " + producto);
        
        if(numero2 == 0)
            System.out.println(numero1 + " / " + numero2 + " = ERROR! DIVISIÓN POR 0");
        else
        {
            division = numero1 / numero2;
            
            System.out.println(numero1 + " / " + numero2 + " = " + division);
        }
        
        
    }
    
}
