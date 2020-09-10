
import java.io.*;
import java.util.*;

public class UD11_Ejercicio_B4 {

    public static void main(String[] args) {

        int numPersonas;
        String ruta;

        Scanner teclado = new Scanner(System.in);

        try {

            System.out.print("Número de nombres de personas a generar: ");
            numPersonas = teclado.nextInt();
            teclado.nextLine();

            System.out.print("Ruta donde quiere guardar el archivo generado: ");
            ruta = teclado.nextLine();

            // Ficheros para lectura
            File fileNombres = new File("Documentos/usa_nombres.txt");
            File fileApellidos = new File("Documentos/usa_apellidos.txt");

            // ArrayList con los datos de los ficheros de lectura         
            ArrayList listaNombres = leerDatosFichero(fileNombres);
            ArrayList listaApellidos = leerDatosFichero(fileApellidos);

            // FileWriter para escritura
            FileWriter writer = new FileWriter(new File(ruta));

            // Generamos el nombre y apellido aleatoriamente y lo escribimos en el fichero
            for (int i = 0; i < numPersonas; i++) {
                int indexNom = (int) (Math.random() * listaNombres.size());
                int indexApe = (int) (Math.random() * listaApellidos.size());
                writer.write(listaNombres.get(indexNom) + " " + listaApellidos.get(indexApe) + "\n");
            }

            // Cerramos FileWriter y mensaje final
            writer.close();
            System.out.println("Fichero generado correctamente: " + ruta);

        } catch (FileNotFoundException e) {
            System.out.println("Error: El fichero no existe");
        } catch (IOException e) {
            System.out.println("Error: " + e);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    // Devuelve un ArrayList con los datos leidos del fichero
    public static ArrayList leerDatosFichero(File f) throws FileNotFoundException {
        Scanner lector = new Scanner(f);
        ArrayList lista = new ArrayList();
        while (lector.hasNext()) {
            lista.add(lector.nextLine());
        }
        lector.close();
        return lista;
    }
}
