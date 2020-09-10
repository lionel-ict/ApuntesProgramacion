/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * Ejercicio 2: Programa que muestra los números pares comprendidos entre el 1 y
 * el 200, sumando de 2 en 2.
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;

        for (i = 2; i <= 200; i = i + 2) {
            System.out.print(i + " ");
        }

        System.out.print("\n");
    }

}
