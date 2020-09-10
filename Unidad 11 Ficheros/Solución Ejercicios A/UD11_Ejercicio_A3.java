import java.io.File;
import java.util.Arrays;

public class UD11_Ejercicio_A3 {

    public static void main(String[] args) {

        ///////////////////////
        // RENOMBRA CARPETAS
        
        File docOrigen = new File("Documentos");
        File docDestino = new File("DOCS");
        docOrigen.renameTo(docDestino);
        
        File fotOrigen = new File("DOCS/Fotografias");
        File fotDestino = new File("DOCS/FOTOS");
        fotOrigen.renameTo(fotDestino);
        
        File libOrigen = new File("DOCS/Libros");
        File libDestino = new File("DOCS/LECTURAS");
        libOrigen.renameTo(libDestino);

        
        /////////////////////////////////////////
        // QUITA EXTENSIÓN DE ARCHIVOS EN 'FOTOS'
        
        // Imprime la lista de archivos ordenada antes de quitar las extensiones
        System.out.println("Listado de archivos de " + fotDestino + " antes de quitar extensiones: ");
        imprimirListaArchivos(fotDestino);
        System.out.println("");

        // Renombra los archivos quitándoles la extensión
        quitarExtensionArchivos(fotDestino);

        // Imprime la lista de archivos ordenada después de quitar las extensiones
        System.out.println("Listado de archivos de " + fotDestino + " después de quitar extensiones: ");
        imprimirListaArchivos(fotDestino);
        System.out.println("");

        
        ////////////////////////////////////////////
        // QUITA EXTENSIÓN DE ARCHIVOS EN 'LECTURAS'
        
        // Imprime la lista de archivos ordenada antes de quitar las extensiones
        System.out.println("Listado de archivos de " + libDestino + " antes de quitar extensiones: ");
        imprimirListaArchivos(libDestino);
        System.out.println("");

        // Renombra los archivos quitándoles la extensión
        quitarExtensionArchivos(libDestino);

        // Imprime la lista de archivos ordenada después de quitar las extensiones
        System.out.println("Listado de archivos de " + libDestino + " después de quitar extensiones: ");
        imprimirListaArchivos(libDestino);
        System.out.println("");
    }

    // Renombra los archivos quitándoles la extensión
    public static void quitarExtensionArchivos(File ruta) {
        // Recorre el listado de archivos
        for (File f : ruta.listFiles()) {
            // trocea el nombre del archivo en base al punto
            String[] trozosArchivo = f.getName().split("\\.");
            File fDestino = new File(f.getParent() + "/" + trozosArchivo[0]);
            // Renombra el archivo
            f.renameTo(fDestino);
        }
    }

    // Imprime la lista de archivos ordenada
    public static void imprimirListaArchivos(File ruta) {
        File[] lista = ruta.listFiles();
        // Ordena la lista alfabéticamente
        Arrays.sort(lista);
        // Recorre la lista mostrando el nombre de los archivos
        for (File f : lista) {
            if (f.isFile()) {
                System.out.println(f.getName());
            }
        }
    }
}
