import java.io.*;
import java.util.*;

public class UD11_Ejercicio_B3 {

    public static void main(String[] args) {
        try {
            
            String strOrigen;
            String strDestino;
            
            // Pedimos nombres de ficheros para leer y escribir
            Scanner in = new Scanner(System.in);
            System.out.print("Fichero a leer: ");
            strOrigen = in.nextLine();
            System.out.print("Fichero a escribir: ");
            strDestino = in.nextLine();
            
            // Creamos los File
            File fileOrigen = new File(strOrigen);
            File fileDestino = new File(strDestino);
            
            // Comprobamos si el archivo de origen existe
            if (!fileOrigen.exists()) {
                throw new FileNotFoundException();
            }
            
            // Objetos para lectura y escritura
            Scanner reader = new Scanner(fileOrigen);
            FileWriter writer = new FileWriter(fileDestino);
            
            // Leemos el fichero de origen y almacenamos todo en un ArrayList
            ArrayList<String> nomPersonas = new ArrayList();
            while (reader.hasNext()) {
                nomPersonas.add(reader.nextLine());
            }
            
            // Ordenamos el ArrayList
            Collections.sort(nomPersonas);
            
            // Recorremos el ArrayList y vamos escribiendo en el fichero de destino
            for (String nom : nomPersonas) {
                writer.write(nom + "\n");
            }
            
            // Cerramo el Scanner y el FileWriter
            reader.close();
            writer.close();

            System.out.println("El fichero " + fileDestino.getName() + " ha sido creado correctamente");

        } catch (FileNotFoundException e) {
            System.out.println("Error: El fichero no existe");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
