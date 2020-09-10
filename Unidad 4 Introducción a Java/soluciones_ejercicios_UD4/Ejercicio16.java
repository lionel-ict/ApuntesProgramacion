/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

import java.util.Scanner;



/**
 *
 * Ejercicio 16: Programa que lea una calificación numérica 
 *               entre 0 y 10 y la transforma en calificación alfabética, 
 *               escribiendo el resultado.
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)  {
             Scanner entrada = new Scanner(System.in);

        float nota;

        System.out.print("Introduce una nota entre 0 y 10: ");
        nota = entrada.nextFloat();
        
        if(nota >= 0 && nota < 3)
            System.out.println("Muy deficiente");
        else
            if(nota >= 3 && nota < 5) // A partir de aquí la primera expresión de los "if" no sería necesaria ya que nota seguro que es, en este caso, mayor o igual a 3.
                System.out.println("Insuficiente");
            else
                if(nota >= 5 && nota < 6)
                    System.out.println("Bien");
                else
                    if(nota >= 6 && nota < 9)
                        System.out.println("Notable");
                    else
                        if(nota >= 9 && nota <= 10)
                            System.out.println("Sobresaliente");
                        else
                            System.out.println("ERROR: La nota es incorrecta.");
    }
    
}
