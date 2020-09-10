package ud6_ejercicio_a_18;

import java.util.Arrays;

/**
 * Crea un programa que cree un array de tamaño 30 y lo rellene con valores
 * aleatorios entre 0 y 9 (utiliza Math.random()*10). Luego ordena los valores
 * del array y los mostrará por pantalla.
 */
public class UD6_Ejercicio_A_18 {

    public static void main(String[] args) {

        // Creamos el vector
        int vector[] = new int[30];

        // Introducimos valores aleatorios en el rango [0,9]
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        
        // Ordenamos el vector
        Arrays.sort(vector);
        
        // Mostramos el vector
        String vectorStr = Arrays.toString(vector);
        System.out.println(vectorStr);

    }

}
