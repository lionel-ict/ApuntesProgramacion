/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * Ejercicio 4: Programa que muestra los números desde el 1 hasta un número N
 * que se introducirá por teclado.
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int max, cont;

        System.out.print("Hasta qué número listamos?: ");
        max = entrada.nextInt();

        for (cont = 1; cont <= max; cont++) {
            System.out.print(cont + " ");
        }

        System.out.print("\n");

    }

}
