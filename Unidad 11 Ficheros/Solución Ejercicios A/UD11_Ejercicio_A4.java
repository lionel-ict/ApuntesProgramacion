import java.io.File;

public class UD11_Ejercicio_A4 {

    public static void main(String[] args) {

        // Instanciamos a la clase File con las rutas relativas de las carpetas a crear
        File misCosas = new File("Documentos/Mis Cosas");
        File alfabeto = new File("Documentos/Alfabeto");

        // Creamos las carpetas        
        boolean resultado1 = misCosas.mkdir();
        System.out.println("¿Se ha creado la carpeta 'Documentos/Mis Cosas'? " + resultado1);
        boolean resultado2 = alfabeto.mkdir();
        System.out.println("¿Se ha creado la carpeta 'Documentos/Alfabeto'? " + resultado2);

        // Instanciamos a la clase File con las rutas de origen y destino relativas
        File fotOrigen = new File("Documentos/Fotografias");
        File fotDestino = new File("Documentos/Mis Cosas/Fotografias");

        File libOrigen = new File("Documentos/Libros");
        File libDestino = new File("Documentos/Mis Cosas/Libros");

        // Movemos las carpetas 'Fotografias' y 'Libros' dentro de 'MisCosas'
        resultado1 = fotOrigen.renameTo(fotDestino);
        System.out.println("¿Se ha movido la carpeta 'Documentos/Fotografias' a 'Documentos/Mis Cosas/Fotografias'? " + resultado1);
        resultado2 = libOrigen.renameTo(libDestino);
        System.out.println("¿Se ha movido la carpeta 'Documentos/Libros' a 'Documentos/Mis Cosas/Libros'? " + resultado2);

        // Creamos dentro de la carpeta 'Alfabeto', una carpeta por cada letra del alfabeto (en mayúsculas)
        for (int i = 65; i <= 90; i++) {
            File nuevaCarpeta = new File(alfabeto.getParent() + "/" + alfabeto.getName() + "/" + (char) i);
            nuevaCarpeta.mkdir();
        }
    }
}