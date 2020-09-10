/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * Ejercicio 14: Programa que dada una cantidad de euros (múltiplo de 5)
 * realizar el desglose de billetes (500,200,100,50,20,10,5), siempre intentando
 * dar el mínimo de billetes posible.
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidad, numBilletes, billete;

        billete = 500;

        System.out.print("Introduce una cantidad (múltiplo de 5) en €: ");
        cantidad = entrada.nextInt();

        while (cantidad > 0) {
            numBilletes = cantidad / billete;
            cantidad = cantidad % billete;

            System.out.println(numBilletes + " billetes de " + billete);

            switch (billete) {
                case 500:
                    billete = 200;
                    break;
                case 200:
                    billete = 100;
                    break;
                case 100:
                    billete = 50;
                    break;
                case 50:
                    billete = 20;
                    break;
                case 20:
                    billete = 10;
                    break;
                case 10:
                    billete = 5;
                    break;
            }

        }
    }

}
