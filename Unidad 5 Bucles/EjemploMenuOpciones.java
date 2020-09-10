/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomenuopciones;

import java.util.Scanner;

/**
 * Programa que muestra un menú de opciones para realizar operaciones. El menú
 * se repetirá hasta que se introduzca la opción 5.
 */
public class EjemploMenuOpciones {

    public static void main(String[] args) {
        int opcion, n1, n2, suma, resta, multiplicacion, division;
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("¿Qué quieres hacer? ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Introduce opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: // Sumar 
                    System.out.println("--Suma de dos enteros--");
                    System.out.print("Introduce un numero: ");
                    n1 = sc.nextInt();
                    System.out.print("Introduce otro numero: ");
                    n2 = sc.nextInt();

                    suma = n1 + n2;

                    System.out.println("La suma es: " + suma);
                    break;
                    
                case 2: // Restar
                    System.out.println("--Resta de dos enteros--");
                    System.out.print("Introduce un numero: ");
                    n1 = sc.nextInt();
                    System.out.print("Introduce otro numero: ");
                    n2 = sc.nextInt();

                    resta = n1 - n2;

                    System.out.println("La resta es: " + resta);
                    break;
                    
                case 3: // Multiplicar
                    System.out.println("--Multiplicación de dos enteros--");
                    System.out.print("Introduce un numero: ");
                    n1 = sc.nextInt();
                    System.out.print("Introduce otro numero: ");
                    n2 = sc.nextInt();

                    multiplicacion = n1 * n2;

                    System.out.println("La multiplicación es: " + multiplicacion);
                    break;
                    
                case 4: // Dividir
                    System.out.println("--División de dos enteros--");
                    System.out.print("Introduce un numero: ");
                    n1 = sc.nextInt();
                    System.out.print("Introduce otro numero: ");
                    n2 = sc.nextInt();

                    if (n2 != 0) {
                        division = n1 / n2;
                        System.out.println("La división es: " + division);
                    } else {
                        System.out.println("Error: División entre 0.");
                    }
                    break;
                    
                case 5: // Salir
                    System.out.println("Adios!");
                    break;
                default: // En otro caso
                    System.out.println("Error: opción incorrecta.");
            }

        } while (opcion != 5);
    }

}
