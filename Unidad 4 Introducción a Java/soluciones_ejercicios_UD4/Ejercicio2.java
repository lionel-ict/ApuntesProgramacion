/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * Ejercicio 2: Programa que calcula y muestra el área de un cuadrado de lado igual a 5. 
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solución sin usar una constante
        int areaCuadrado;
        
        areaCuadrado = 5 * 5;
        
        System.out.println("(sin constante)El área del cuadradado es " + areaCuadrado);
        
        // Solución usando una constante
        final int lado = 5;
        
        areaCuadrado = lado * lado;
        
        System.out.println("(con constante)El área del cuadradado es " + areaCuadrado);
        
        
    }
    
}
