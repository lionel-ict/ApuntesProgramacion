import java.io.*;

public class UD11_Ejercicio_A5 {

    public static void main(String[] args) {

        // Instanciamos a la clase File con las rutas relativas de las carpetas a borrar
        File fotografias = new File("Documentos/Fotografias");
        File libros = new File("Documentos/Libros");
        File documentos = new File("Documentos");

        boolean res = false;

        try {
            // Borramos la carpeta 'Fotografias' y todo su contenido
            res = borrarTodo(fotografias);
            if (res) {
                System.out.println("La carpeta 'Fotografias' ha sido borrada");
            }

            // Borramos la carpeta 'Libros' y todo su contenido
            res = borrarTodo(libros);
            if (res) {
                System.out.println("La carpeta 'Libros' ha sido borrada");
            }

            // Borramos la carpeta 'Documentos' y todo su contenido
            res = borrarTodo(documentos);
            if (res) {
                System.out.println("La carpeta 'Documentos' ha sido borrada");
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    // Borra los archivos y carpetas de una ruta
    public static boolean borrarTodo(File ruta) throws FileNotFoundException {
        // Si no existe la ruta muestra una excepcion
        if (!ruta.exists()) {
            throw new FileNotFoundException("La ruta introducida no existe");
        }

        // Si es un archivo lo borro
        if (ruta.isFile()) {
            return ruta.delete();
        }

        // Si es una carpeta primero borro sus archivos y luego borro la carpeta
        if (ruta.isDirectory()) {
            for (File f1 : ruta.listFiles()) {
                f1.delete();
            }
            return ruta.delete();
        }

        // No debería llegar aquí
        return false;
    }
}
