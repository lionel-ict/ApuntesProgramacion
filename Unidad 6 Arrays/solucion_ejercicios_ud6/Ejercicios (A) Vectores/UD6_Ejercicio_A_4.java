package ud6_ejercicio_a_4;

import java.util.Scanner;

/**
 * Crea un programa que pida veinte números enteros por teclado, los almacene en
 * un array y luego muestre por separado la suma de todos los valores positivos
 * y negativos.
 */
public class UD6_Ejercicio_A_4 {

    public static void main(String[] args) {
        int pos=0, neg=0;
        int valores[] = new int[20];
        Scanner entrada = new Scanner(System.in);
        
        // Introducimos todos los valores en el array
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Introduce valor " + i + ": ");
            valores[i] = entrada.nextInt();
        }
        
        // Sumamos positivos y negativos por separado
        for (int i = 0; i < valores.length; i++) {
               if (valores[i] > 0)
                   pos += valores[i];
               else
                   neg += valores[i];
        }
        
        System.out.println("Suma de Positivos: " + pos);
        System.out.println("Suma de Negativos: " + neg);

    }

}
