/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * Ejercicio 5: Programa que lee un número positivo N y calcule y visualice su
 * factorial N!
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, fact;

        System.out.print("Introduce el número para calcular su factorial: ");
        num = entrada.nextInt();

        fact = 1;

        while (num > 1) {
            fact = fact * num;
            num--;
        }

        System.out.println("Su factorial es " + fact);
    }

}
