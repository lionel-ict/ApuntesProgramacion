/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

/**
 * Ejercicio 11: Programa que suma independientemente los pares y los impares de
 * los números comprendidos entre 100 y 200.
 *
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        int pares, impares, cont;

        pares = 0;
        impares = 0;

        for (cont = 100; cont <= 200; cont++) {
            if (cont % 2 == 0) {
                pares = pares + cont;
            } else {
                impares += cont; //equivalente a impares = impares + cont;
            }
        }

        System.out.println("La suma total de los pares es " + pares);
        System.out.println("La suma total de los impares es " + impares);
    }

}
