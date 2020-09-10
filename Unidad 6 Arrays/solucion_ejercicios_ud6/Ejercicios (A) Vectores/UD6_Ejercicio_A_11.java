package ud6_ejercicio_a_11;

/**
 * Crea un programa que cree dos arrays de enteros de tamaño 100. Luego
 * introducirá en el primer array todos los valores del 1 al 100. Por último,
 * deberá copiar todos los valores del primer array al segundo array en orden
 * inverso, y mostrar ambos por pantalla.
 */
public class UD6_Ejercicio_A_11 {

    public static void main(String[] args) {
        int length = 100;
        int v1[] = new int[length];
        int v2[] = new int[length];

        // V1: Valores del 1 al 100
        for (int i = 0; i < length; i++)
            v1[i] = i + 1;
        
        // Copiamos V1 en V2 en orden inverso
        for (int i = 0; i < length; i++)
            v2[i] = v1[length - i - 1];

        // Mostramos Vector 1
        System.out.print("Vector 1: ");
        for (int i = 0; i < length; i++) {
            System.out.print(v1[i] + " ");
        }
        System.out.println();
        
        // Mostramos Vector 2
        System.out.print("Vector 2: ");
        for (int i = 0; i < length; i++) {
            System.out.print(v2[i] + " ");
        }

    }

}
