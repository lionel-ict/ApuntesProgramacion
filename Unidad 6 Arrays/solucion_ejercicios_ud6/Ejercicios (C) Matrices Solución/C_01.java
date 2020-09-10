
/**
 * Ceedcv
 * Ejercicio C_01 Crea un programa que cree una matriz de tamaño 5x5 que almacene
 * los números del 1 al 25 y luego muestre la matriz por pantalla
 */
public class C_01 {

    public static void main(String[] args) {

        int x = 1;
        int m[][] = new int[5][5];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = x++;
                System.out.printf("%4d", m[i][j]);
            }
            System.out.println("");

        }

    }

}
