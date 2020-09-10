package ud11_casopractico_a;

import java.io.*;
import java.util.*;

public class MiniFileManager {

    // Ruta actual
    private File currentPath;

    // Constructor. La ruta inicial es el directorio de trabajo
    public MiniFileManager() {
        currentPath = new File(System.getProperty("user.dir"));
    }

    // Devuelve la ruta actual
    public File getCurrentPath() {
        return currentPath;
    }

    // Devuelve una cadena con la carpeta actual
    public String getPWD() {
        return getCurrentPath().getAbsolutePath();
    }

    // Cambia la carpeta actual al directorio 'dir'
    public boolean changeDir(String path) throws FileNotFoundException {
        if (path.equals("..")) {
            if (getCurrentPath().getParent() != null) {
                currentPath = new File(getCurrentPath().getParent());
            }
            return true;

        } else {
            File newFile = new File(getCurrentPath().getAbsolutePath() + "/" + path);
            // Si la ruta no existe lanza una excepción
            if (!newFile.exists()) {
                throw new FileNotFoundException("La ruta introducida no existe");
            } else { // Si existe asignamos la nueva ruta
                currentPath = newFile;
            }
            return true;
        }
    }

    // Muestra una lista con los directorios y archivos de la carpeta actual.
    // Si info=true muestra también su tamaño y fecha de modificación
    public void printList(boolean info) {
        // Obtenemos lista de archivos de la carpeta actual
        File[] lista = getCurrentPath().listFiles();

        // Ordena la lista alfabéticamente
        Arrays.sort(lista);

        // Recorre la lista y muestra las carpetas ordenadas
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].isDirectory()) {
                if (info) {
                    System.out.println("[*] " + lista[i].getName() + "\t" + lista[i].length() + " bytes\t" + new Date(lista[i].lastModified()));
                } else {
                    System.out.println("[*] " + lista[i].getName());
                }
            }
        }

        // Recorre la lista y muestra los archivos ordenados
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].isFile()) {
                if (info) {
                    System.out.println("[A] " + lista[i].getName() + "\t" + lista[i].length() + " bytes\t" + new Date(lista[i].lastModified()));
                } else {
                    System.out.println("[A] " + lista[i].getName());
                }
            }
        }
    }

    // Crea el directorio 'dir' en la carpeta actual 
    public boolean makeDir(String dir) {
        File newDir = new File(getCurrentPath().getAbsolutePath() + "/" + dir);
        return newDir.mkdir();
    }

    // Borra 'ruta'. Si es una carpeta, borra primero sus archivos y luego la carpeta.
    // Si tienes subcarpetas también las borra
    public boolean removeFile(String ruta) throws FileNotFoundException {
        File rmFile = new File(ruta);

        // Si no existe la ruta muestra una excepcion
        if (!rmFile.exists()) {
            throw new FileNotFoundException("La ruta introducida no existe");
        }

        // Si es un archivo lo borra
        if (rmFile.isFile()) {
            return rmFile.delete();
        }

        // Si es una carpeta, borra su contenido y la carpeta
        if (rmFile.isDirectory()) {
            // Recorre los elementos y los borra
            for (File f1 : rmFile.listFiles()) {
                if (f1.isFile()) {
                    f1.delete();
                } else if (f1.isDirectory()) {
                    removeFile(f1.getAbsolutePath());
                }
            }
            // Borra la carpeta
            return rmFile.delete();
        }

        // No debería llegar aquí
        return false;
    }

    // Mueve o renombra 'file1' a 'file2'
    public boolean moveFile(String file1, String file2) throws FileNotFoundException {
        File fileOrigen = new File(this.getCurrentPath().getAbsolutePath() + "/" + file1);
        File fileDestino = new File(this.getCurrentPath().getAbsolutePath() + "/" + file2);

        if (!fileOrigen.exists()) {
            throw new FileNotFoundException("La ruta de origen no existe");
        }

        return fileOrigen.renameTo(fileDestino);
    }

    // Muestra una breve ayuda
    public void help() {
        System.out.println();
        System.out.println("pwd                      muestra el directorio actual");
        System.out.println("cd <dir>                 cambia al directorio especificado, '..' para volver a la carpeta anterior");
        System.out.println("ls                       muestra los archivos y carpetas del directorio actual");
        System.out.println("ll                       muestra los archivos y carpetas del directorio actual con info extendida");
        System.out.println("mkdir <dir>              crea el directorio especificado");
        System.out.println("rm <file>                borra el archivo, o carpeta si está vacía");
        System.out.println("mv <fileOri> <fileDes>   mueve el archivo o carpeta de origen a destino");
        System.out.println("help                     muestra información sobre las ordenes integradas");
        System.out.println("exit                     salir del intérprete de ordenes");
        System.out.println();
    }
}
