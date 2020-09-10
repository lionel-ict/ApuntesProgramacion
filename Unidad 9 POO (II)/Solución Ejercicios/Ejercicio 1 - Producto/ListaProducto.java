
import java.util.ArrayList;
import java.util.Iterator;

public class ListaProducto {

    public static void main(String args[]) {

        // Creamos 5 instancias de Producto
        Producto m = new Producto("Pan", 6);
        Producto n = new Producto("Leche", 2);
        Producto o = new Producto("Manzanas", 5);
        Producto p = new Producto("Brocoli", 2);
        Producto q = new Producto("Carne", 2);

        // Creamos un ArrayList de productos
        ArrayList<Producto> lista = new ArrayList<Producto>();

        // Añadimos los productos al ArrayList
        lista.add(m);
        lista.add(n);
        lista.add(o);
        lista.add(p);
        lista.add(q);

        // Imprimimos contenido de la lista
        imprimeLista(lista);

        // Eliminamos dos elementos y añadimos uno nuevo a la lista
        lista.remove(0);
        lista.remove(0);
        lista.add(0, new Producto("Pescado", 3));

        // Imprimimos contenido de la lista
        imprimeLista(lista);

        // Eliminar todos los valores del ArrayList
        lista.clear();

        // Imprimimos contenido de la lista
        imprimeLista(lista);
    }

    // Mostramos contenido de la lista
    public static void imprimeLista(ArrayList<Producto> lista) {
        System.out.println("LISTA DE PRODUCTOS CON " + lista.size() + " ELEMENTOS");
        for (Iterator<Producto> it = lista.iterator(); it.hasNext();) {
            Producto x = it.next();
            System.out.println(x.getNombre() + ": " + x.getCantidad());
        }
        System.out.println("");
    }
}
