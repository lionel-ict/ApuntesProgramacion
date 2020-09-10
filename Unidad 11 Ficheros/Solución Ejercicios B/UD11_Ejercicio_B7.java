import java.io.*;
import java.util.*;

public class UD11_Ejercicio_B7 {

    public static void main(String[] args) {

        System.out.println("ESTADÍSTICAS DE LIBROS");
        System.out.println("----------------------");
        System.out.println("");

        try {
            // Obtenemos la lista de archivos de la carpeta Libros
            File rutaLibros = new File("Documentos/Libros");
            File[] listaLibros = rutaLibros.listFiles();

            // Para cada archivo
            for (File libro : listaLibros) {
                
                // Lector de archivo
                Scanner lector = new Scanner(libro);
                
                // Inicializamos contadores y Hashtable
                int numLin = 0, numPal = 0, numCar = 0;
                Hashtable<String, Integer> hashPalabras = new Hashtable<String, Integer>();
                
                // Procesamos líneas mientras quede algo por leer
                while (lector.hasNext()) {
                    // Línea
                    String linea = lector.nextLine();
                    numLin++;

                    // Palabras
                    String[] palabras = linea.split(" ");
                    numPal += palabras.length;

                    // Para cada palabra actualizamos numCar y metemos en la Hashtable
                    for (String palabra : palabras) {
                        char[] letras = palabra.toCharArray();
                        numCar += letras.length;

                        // Si ya existe la palabra aumentamos su valor, si no existe la guardamos
                        if (hashPalabras.containsKey(palabra)) {
                            hashPalabras.put(palabra, hashPalabras.get(palabra) + 1);
                        } else {
                            hashPalabras.put(palabra, 1);
                        }
                    }
                }
                
                // Mostramos estadísticas del libro
                System.out.println("Libro: " + libro.getName());
                System.out.println("Lineas totales: " + numLin);
                System.out.println("Número de palabras: " + numPal);
                System.out.println("Número de carácteres: " + numCar);
                System.out.println("Las 10 palabras más comunes son: ");
                
                // Muestra las 10 palabras más comunes
                muestraPalabrasMasComunes(hashPalabras);
                
                System.out.println("");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: El fichero no existe");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    // Muestra las 10 palabras más comunes
    public static void muestraPalabrasMasComunes(Hashtable<String, Integer> t) {

        // Obtenermos una lista ordenada por nº de palabras
        ArrayList<Map.Entry<String, Integer>> l = new ArrayList(t.entrySet());
        Collections.sort(l, Collections.reverseOrder(new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        }));

        // Imprime las 10 palabras más comunes
        for (int i = 0; i < 10; i++) {
            System.out.println(l.get(i));
        }
    }
}
