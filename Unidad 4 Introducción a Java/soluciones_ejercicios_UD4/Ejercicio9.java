/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * Ejercicio 9: Programa que pide la edad por teclado y nos muestra
 *              el mensaje de “eres mayor de edad” o el mensaje de 
 *              “eres menor de edad”. 
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad;

        System.out.print("Introduce la edad: ");
        edad = entrada.nextInt();
        
        if(edad >= 18)
            System.out.println("Eres mayor de edad");
        else
            System.out.println("Eres menor de edad");
    }
    
}
