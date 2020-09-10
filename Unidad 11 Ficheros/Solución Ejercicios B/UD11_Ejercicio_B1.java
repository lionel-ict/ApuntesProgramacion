import java.io.*;
import java.util.*;

public class UD11_Ejercicio_B1 {

    public static void main(String[] args) {
        // Declaramos e inicializamos las variables
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int numero = 0;

        try {
            // Intentamos abrir el fichero
            File f = new File("Documentos/numeros.txt");
            Scanner lector = new Scanner(f);

            // Mientras queden elementos vamos leyendo los enteros 
            while (lector.hasNext()) {
                numero = lector.nextInt();

                // Comprobamos si numero leido es mayor que máximo
                if (numero > maximo) {
                    // Asignamos nuevo máximo
                    maximo = numero;
                }

                // Comprobamos si numero leido es menor que mínimo
                if (numero < minimo) {
                    // Asignamos nuevo mímino
                    minimo = numero;
                }
            }

            // Cerramos el Scanner
            lector.close();

            // Mostramos por pantalla el valor máximo y mínimo
            System.out.println("El valor máximo es " + maximo);
            System.out.println("El valor mínimo es " + minimo);

        } catch (FileNotFoundException e) {
            System.out.println("Error: El fichero no existe");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
