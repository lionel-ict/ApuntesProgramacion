/*
 * To change this license header, choose License Headers sc Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template sc the editor.
 */
import java.util.Scanner;

/**
 * Ceedcv
 * 
 * Ejercicio B-02: Crea un programa que pida dos cadenas de texto por 
 * teclado y luego indique si son iguales, además de si son iguales
 * sin diferenciar entre mayúsculas y minúsculas
 * 
 * @author javier
 */
public class B_02 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe una cadena de texto: ");
        String cadena1 = sc.nextLine();
        System.out.print("Escribe otra cadena de texto: ");
        String cadena2 = sc.nextLine();

        if (cadena1.equals(cadena2)) {
            System.out.println("Las dos cadenas son iguales");
        } else if (cadena1.equalsIgnoreCase(cadena2)) {
            System.out.println("Las dos cadenas son iguales, sin diferenciar entre mayúsculas/minúsculas");
        } else {
            System.out.println("Son cadenas diferentes");
        }
        System.out.println();
    }

}
