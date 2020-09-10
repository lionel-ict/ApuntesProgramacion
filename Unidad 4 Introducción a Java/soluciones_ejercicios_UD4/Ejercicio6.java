/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * Ejercicio 6: Programa que dado el precio de un artículo y el precio de venta
 * real nos muestre el porcentaje de descuento realizado.
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float precioArticulo, precioVenta, descuento;

        System.out.print("Introduce el precio del articulo: ");

        precioArticulo = entrada.nextFloat();

        System.out.print("Introduce el precio de venta: ");

        precioVenta = entrada.nextFloat();

        // No se controla que el precio de venta sea mayor.
        descuento = ((precioArticulo - precioVenta) * 100) / precioArticulo;

        System.out.println("El descuento es " + descuento);
    }

}
