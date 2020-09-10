/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 * Ejercicio1: Programa que muestra por pantalla los 20 primeros números
 * naturales (1, 2, 3,…., 20).
 *
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int cont;

        for (cont = 1; cont <= 20; cont++) {
            System.out.print(cont + " ");
        }

        System.out.print("\n");
    }
}
