
import java.util.Scanner;

/**
 * Ceedcv Ejercicio C_05 Necesitamos crear un programa para registrar sueldos de
 * hombres y mujeres de unaempresa y detectar si existe brecha salarial entre
 * ambos. El programa pedirá por teclado lainformación de N personas distintas
 * (valor también introducido por teclado). Para cadapersona, pedirá su género
 * (0 para varón y 1 para mujer) y su sueldo. Esta información debeguardarse en
 * una única matriz. Luego se mostrará por pantalla el sueldo medio de
 * cadagénero
 */
public class C_05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime el número de personas ");
        int n = sc.nextInt();
        int nvarones = 0, nmujeres = 0, sumavarones = 0, sumamujeres = 0;

        float sueldos[][] = new float[n][2];

        for (int i = 0; i < sueldos.length; i++) {
            for (int j = 0; j < sueldos[0].length; j++) {
                if (j == 0) {
                    System.out.print("Dime el género (0 para varón y 1 para mujer) de la persona " + (i + 1) + ": ");
                    sueldos[i][j] = sc.nextFloat();
                }
                if (j == 1) {
                    System.out.print("Dime el sueldo: ");
                    sueldos[i][j] = sc.nextFloat();
                }
            }
        }

        for (int i = 0; i < sueldos.length; i++) {
            for (int j = 0; j < sueldos[0].length; j++) {
                System.out.print(sueldos[i][j] + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i < sueldos.length; i++) {
            if (sueldos[i][0] == 0.0) {
                nvarones++;
                sumavarones += sueldos[i][1];
            }
            if (sueldos[i][0] == 1.0) {
                nmujeres++;
                sumamujeres += sueldos[i][1];
            }
        }
        System.out.println("El sueldo medio de los varones es: " + (sumavarones / nvarones));
        System.out.println("El sueldo medio de las mujeres es: " + (sumamujeres / nmujeres));
    }

}
