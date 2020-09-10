/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * Ejercicio 14: Programa que lee dos números y nos dice cuál es el mayor o si
 * son iguales.
 */
public class Ejercicio14 {

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

        if (numero1 > numero2) {
            System.out.println(numero1 + " es mayor que " + numero2);
        } else {
            if (numero1 == numero2) {
                System.out.println("Los números son iguales");
            } else {
                System.out.println(numero2 + " es mayor que " + numero1);
            }
        }
    }

}
