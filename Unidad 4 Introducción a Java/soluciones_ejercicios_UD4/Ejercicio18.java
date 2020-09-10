/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;

import java.util.Scanner;

/**
 *
 * Ejercicio 18: Programa que calcula el salario neto semanal de un trabajador
 * en función del número de horas trabajadas y la tasa de impuestos.
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombre;
        int horas;
        double tarifa, salario, impuesto, salarioNeto;

        impuesto = 0;

        System.out.print("Introduce el nombre: ");
        nombre = entrada.nextLine();

        System.out.print("Introduce las horas trabajadas: ");
        horas = entrada.nextInt();

        System.out.print("Introduce el precio de la tarifa normal: ");
        tarifa = entrada.nextDouble();

        if (horas <= 35) {
            salario = horas * tarifa;
        } else {
            salario = 35 * tarifa + (horas - 35) * 1.5;
        }

        if (salario > 900) {
            impuesto = (400 * 0.25) + (salario - 900) * 0.45;
        } else if (salario > 500) {
            impuesto = (salario - 500) * 0.25;
        }

        salarioNeto = salario - impuesto;

        System.out.println("Informe del empleado " + nombre + ":");
        System.out.println("Salario bruto: " + salario + "€");
        System.out.println("Salario neto: " + salarioNeto + "€");
        System.out.println("Impuestos: " + impuesto + "€");

    }

}
