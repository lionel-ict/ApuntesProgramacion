/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * Ejercicio 9: Programa que calcula y escribe la suma y el producto de los 10
 * primeros números naturales.
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, suma, producto;

        suma = 0;
        producto = 1;

        for (i = 1; i <= 10; i++) {
            suma = suma + i;
            producto = producto * i;
        }

        System.out.println("La suma es " + suma + " y el producto es " + producto);
    }

}
