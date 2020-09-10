package ud6_ejercicio_a_12;

import java.util.Scanner;

/**
 * Crea un programa que cree un array de 10 enteros y luego muestre el siguiente
 * menú con distintas opciones: (a) Mostrar valores. (b) Introducir valor. (c)
 * Salir. La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’
 * pedirá un valor V y una posición P, luego escribirá V en la posición P del
 * array. El menú se repetirá indefinidamente hasta que el usuario elija la
 * opción ‘c’ que terminará el programa
 */
public class UD6_Ejercicio_A_12 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int vector[] = new int[10];
        boolean continuar = true;
        String opcion;

        while (continuar) {
            System.out.println();
            System.out.println("MENU PRINCIPAL");
            System.out.println("a. Mostrar valores");
            System.out.println("b. Introducir valor");
            System.out.println("c. Salir");
            System.out.print("Elige una opción y presiona intro: ");
            opcion = entrada.nextLine();
            
            switch (opcion) {
                
                case "a":
                    for (int i = 0; i < vector.length; i++)
                        System.out.print(vector[i] + " ");
                    System.out.println();
                    break;
                    
                case "b":
                    int v, p;
                    System.out.print("Valor: ");
                    v = entrada.nextInt();
                    System.out.print("Posición: ");
                    p = entrada.nextInt();
                    if (p < 0 || p >= vector.length)
                        System.out.println("Posición fuera del límite");
                    else
                        vector[p] = v;
                    break;
                    
                case "c":
                    System.out.println("Fin del programa");
                    continuar = false;
                    break;
                    
                default:
                    System.out.println("Opción no válida");
                    break;
            }
            entrada.nextLine();
        }
    }
}