

/**
 * Ceedcv
 * Ejercicio C_02 Crea un programa que cree una matriz de 10x10 e introduzca
 * los valores de las tablas de multiplicar del 1 al 10
 * (cada tabla en una fila). Luego mostrará la matriz por pantalla.
 */
public class C_02 {

    public static void main(String[] args) {

        int x = 1;
        int m[][] = new int[10][10];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = x * (j + 1);
                System.out.printf("%4d", m[i][j]);
            }
            x++;
            System.out.println("");

        }

    }

}
