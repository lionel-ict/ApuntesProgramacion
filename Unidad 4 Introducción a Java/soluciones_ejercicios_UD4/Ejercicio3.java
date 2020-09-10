/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * Ejercicio 3: Programa que calcula el área de un cuadrado cuyo lado se introduce por teclado. 
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float areaCuadrado, lado;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce el lado: ");
        
        lado = entrada.nextFloat();
        
        areaCuadrado = lado * lado;
        
        System.out.println("El área del cuadrado es " + areaCuadrado);
    }
    
}
