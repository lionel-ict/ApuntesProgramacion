import java.io.*;
import java.util.*;

public class UD11_Ejercicio_B5 {

    public static void main(String[] args) {

        // Instanciamos a la clase File con la ruta relativa
        File dirDiccionario = new File("Documentos/Diccionario");

        // Creamos la carpeta 'Diccionario'        
        boolean resultado = dirDiccionario.mkdir();

        if (resultado) {
            try {
                // ArrayList donde vamos a almacenar todas las palabras del archivo diccionario.txt
                ArrayList<String> alDiccionario = new ArrayList();

                // Lectura de diccionario.txt
                File fileDiccionario = new File("Documentos/diccionario.txt");
                Scanner reader = new Scanner(fileDiccionario);

                // Recorremos el archivo y vamos añadiendo las palabras al ArrayList
                while (reader.hasNext()) {
                    alDiccionario.add(reader.nextLine());
                }

                // Cerramos archivo
                reader.close();

                // Creamos dentro de la carpeta 'Diccionario' tantos archivos como letras del abecedario (A.txt, B.txt, C.txt,...)
                for (int i = 65; i <= 90; i++) {
                    // Escritura
                    FileWriter writer = new FileWriter(new File(dirDiccionario.getParent() + "/" + dirDiccionario.getName() + "/" + (char) i + ".txt"));

                    // Recorremos las palabras del ArrayList
                    for (String palabra : alDiccionario) {
                        // Escribimos en cada archivo las palabras que empiecen por el nombre del archivo
                        if (palabra.toUpperCase().startsWith(Character.toString((char) i))) {
                            writer.write(palabra + "\n");
                        }
                    }

                    // Cerramos archivo
                    writer.close();
                }
            } catch (FileNotFoundException e) {
                System.out.println("Error: El fichero no existe");
            } catch (IOException e) {
                System.out.println("Error: " + e);
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        } else {
            System.out.println("La carpeta " + dirDiccionario.getName() + " no se ha podido crear");
        }
    }
}
