package ud9_e7_figuras;

import java.util.ArrayList;
import java.util.Iterator;

public class UD9_E7_Figuras {

    public static void main(String[] args) {
        
        // Creamos la lista de figuras
        ArrayList<iFigura2D> listaFiguras = new ArrayList<iFigura2D>();
        
        // Creamos los objetos
        Cuadrado cuadrado1 = new Cuadrado(3);
        Rectangulo rectangulo1 = new Rectangulo(5,2);
        Triangulo triangulo1 = new Triangulo(3,3);
        Circulo circulo1 = new Circulo(5);
        
        // Añadimos los objetos a la lista
        listaFiguras.add(cuadrado1);
        listaFiguras.add(rectangulo1);
        listaFiguras.add(triangulo1);
        listaFiguras.add(circulo1);
        
                
        mostrarFiguras(listaFiguras);
        escalarFiguras(listaFiguras, 2);
        mostrarFiguras(listaFiguras);
        escalarFiguras(listaFiguras, 0.1);
        mostrarFiguras(listaFiguras);
        
    }   
    
    // Función para recorrer el ArrayList de iFigura2D y llamar al médoto imprimir() de cada objeto
    public static void mostrarFiguras(ArrayList<iFigura2D> figuras)
    {
         // Iteramos y mostramos datos
       for(Iterator it = figuras.iterator(); it.hasNext();) 
       {
           iFigura2D figura = (iFigura2D)it.next();
           figura.imprimir();
       } 
       
        System.out.println("");
    }
    
    // Función para recorrer el ArrayList de iFigura2D y llamar al método escalar() de cada objeto
    public static void escalarFiguras(ArrayList<iFigura2D> figuras, double escala)
    {
         // Iteramos y escalamos
       for(Iterator it = figuras.iterator(); it.hasNext();) 
       {
           iFigura2D figura = (iFigura2D)it.next();
           figura.escalar(escala);
       }    
    }
    
}
