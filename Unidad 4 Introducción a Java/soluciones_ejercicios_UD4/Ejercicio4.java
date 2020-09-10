/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * Ejercicio 4: Programa que lee dos números, calcula y muestra 
 *              el valor de sus suma, resta, producto y división. 
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float numero1, numero2, suma, resta, producto, division;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce el primer número: ");
        numero1 = entrada.nextFloat();
        
        System.out.print("Introduce el segundo número: ");
        numero2 = entrada.nextFloat();
        
        suma = numero1 + numero2;
        resta = numero1 + numero2;
        producto = numero1 * numero2;
        division = numero1 / numero2; // No controlamos la división entre 0
        
        System.out.println("La suma es " + suma);
        System.out.println("La resta es " + resta);
        System.out.println("El producto es " + producto);
        System.out.println("La división es " + division);
    }
    
}
