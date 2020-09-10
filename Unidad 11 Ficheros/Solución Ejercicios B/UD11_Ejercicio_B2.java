import java.io.*;
import java.util.*;

public class UD11_Ejercicio_B2 {

    public static void main(String[] args) {
        try {
            // Intentamos abrir el fichero
            File f = new File("Documentos/alumnos_notas.txt");
            Scanner lector = new Scanner(f);

            // ArrayList de alumnos
            ArrayList<String> alumnos = new ArrayList<String>();

            // Contador de número de líneas
            int nLinea = 1;

            // Recorremos el fichero. Para cada línea (alumno)
            while (lector.hasNextLine()) {
                // Troceamos la línea en palabras y cogemos la info del alumno
                String[] trozosLinea = (lector.nextLine()).split(" ");

                // Si la línea no tiene el formato correcto la saltamos
                if (trozosLinea.length < 2) {
                    System.err.println("Linea " + nLinea + " mal formateada. La ignoramos.");
                    continue;
                }

                // Cogemos la info del alumnos
                String nombre = trozosLinea[0];
                String apellido = trozosLinea[1];

                // Calculamos su nota media
                int suma = 0;
                for (int j = 2; j < trozosLinea.length; j++) {
                    suma += Integer.valueOf(trozosLinea[j]);
                }
                double media = (double) (suma) / (double) (trozosLinea.length - 2);

                // Creamos una cadena con nota media, nombre y apellido y la añadimos al ArrayList
                alumnos.add(String.format("%.2f %s", media, nombre + " " + apellido));

                // Actualizamos contador de líneas
                nLinea++;
            }

            // Ordenamos la lista en orden descendente
            Collections.sort(alumnos, Collections.reverseOrder());
            
            System.out.println("LISTADO DE NOTAS MEDIAS DE LOS ALUMNOS");
            System.out.println("--------------------------------------");
            
            // Mostramos primero alumnos con un 10 de media (si los hay)
            for (String a : alumnos) {
                if (a.split(" ")[0].equals("10.00"))
                    System.out.println(a);
            }
            
            // Mostramos el resto de alumnos
            for (String a : alumnos) {
                if (!a.split(" ")[0].equals("10.00"))
                    System.out.println(a);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: El fichero no existe");
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e);
        }
    }
}
