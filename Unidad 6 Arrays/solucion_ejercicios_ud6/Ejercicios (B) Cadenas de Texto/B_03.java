/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * Ejercicio B_03: Programa que nos pida el nombre y los dos apellidos de una
 * persona y devolver un código de usuario formado por las tres primeras letras
 * del primer apellido, las tres primeras letras del segundo apellido y las tres
 * primeras letras del nombre.
 */
public class B_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String nombre, apellido1, apellido2, codigo;

        System.out.print("Introduce el nombre: ");
        nombre = in.nextLine();

        System.out.print("Introduce el primer apellido: ");
        apellido1 = in.nextLine();

        System.out.print("Introduce el segundo apellido: ");
        apellido2 = in.nextLine();
        codigo = nombre.substring(0, 3) + apellido1.substring(0, 3) + apellido2.substring(0, 3);

        System.out.println("El código es " + codigo);

    }

}
