/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * Ejercicio 17: Programa que recibe como datos de entrada una hora 
 *               expresada en horas, minutos y segundos que nos calcula 
 *               y escribe la hora, minutos y segundos que serán 
 *               transcurrido un segundo. 
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horas, minutos, segundos;

        // No hay comprobación de errores.
        
        System.out.print("Introduce las horas: ");
        horas = entrada.nextInt();
        
        System.out.print("Introduce los minutos: ");
        minutos = entrada.nextInt();
        
        System.out.print("Introduce los segundos: ");
        segundos = entrada.nextInt();
        
        if(segundos == 59)
        {
            segundos = 0;
            
            if(minutos == 59)
            {
                minutos = 0;
                
                if(horas == 23)
                {
                    horas = 0;
                }
                else
                    horas++;
            }
            else
                minutos++;
        }
        else
            segundos++;
        
            
        System.out.println("Son las " + horas + ":" + minutos + ":" + segundos);
    }
    
}
