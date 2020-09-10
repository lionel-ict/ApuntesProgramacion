package ud6_ejercicio_a_16;

import java.util.Arrays;

/**
 * Crea un programa que cree un array de enteros e introduzca la siguiente
 * secuencia de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta
 * introducir 10 diez veces, y luego la muestre por pantalla. En esta ocasión
 * has de utilizar Arrays.fill().
 */
public class UD6_Ejercicio_A_16 {

    public static void main(String[] args) {
        
        // Calculamos cuantos números tiene la secuencia
        int cuantos = 0;
        for (int i = 1; i <= 10; i++) {
            cuantos += i;
        }

        // Creamos el vector
        int valores[] = new int[cuantos];

        // Posición donde insertar los números
        int pos = 0;
        
        // Para cada número n del 1 al 10
        for (int n = 1; n <= 10; n++) {
            
            // Introducimos n veces 'n' en la posición 'pos'
            Arrays.fill(valores, pos, pos + n, n);
            
            // Actualizamos pos
            pos += n;
        }

        // Mostramos el array
        String arrayStr = Arrays.toString(valores);
        System.out.println("Array: " + arrayStr);
    }

}
