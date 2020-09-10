package ud6_ejercicio_a_14;

/**
 * Crea un programa que cree un array de enteros e introduzca la siguiente
 * secuencia de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta
 * introducir 10 diez veces, y luego la muestre por pantalla.
 */
public class UD6_Ejercicio_A_14 {

    public static void main(String[] args) {
        
        // Calculamos cuantos números tiene la secuencia
        int cuantos = 0;
        for (int i = 1; i <= 10; i++) {
            cuantos += i;
        }

        // Creamos el vector
        int valores[] = new int[cuantos];
        
        // Índice para recorrer el vector
        int posicion = 0;
        
        // Para cada número i del 1 al 10
        for (int i = 1; i <= 10; i++) {
            
            // Repetimos i veces
            for (int j = 0; j < i; j++) {
                
                // Guardar el valor en 'posición'
                valores[posicion] = i;
                
                // Actualizamos posición
                posicion++;
            }
        }

        // Mostramos el array
        System.out.print("Array: ");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + " ");
        }

    }

}
