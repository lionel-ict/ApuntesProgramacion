/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * Ejercicio 3: Programa que muestra los números pares comprendidos entre el 1 y
 * el 200 pero sumando de 1 en 1.
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;

        for (i = 1; i <= 200; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.print("\n");
    }

}
