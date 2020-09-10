package ud9_e6_vehiculos;

import java.util.ArrayList;

public class UD9_E6_Vehiculos {

    public static void main(String[] args) {
        
        // Creamos los objetos
        Terrestre terrestre = new Terrestre("1234ABC", "Deportivo", 4);
        Acuatico acuatico = new Acuatico("ABC", "Fuera borda", 10.2);
        Aereo aereo = new Aereo("ABCD123456", "Supersónico", 2);
        
        Coche coche1 = new Coche("8524KSY", "Todo Camino", 5, true);
        Moto moto1 = new Moto("3585HFJ", "Custom", 2, "Negra");
        Barco barco1 = new Barco("jhfhhg", "Góndola", 100, false);
        Submarino submarino1 = new Submarino("abcdefghij", "Sumergible", 250, 520);
        Avion avion1 = new Avion("kkKK654852", "Jumbo", 150, 10000);
        Helicoptero helicoptero1 = new Helicoptero("BeAB987123", "Helicop99", 8, 2);
        
        // Creamos la lista de vehiculos
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
        
        // Añadimos los objetos a la lista
        listaVehiculos.add(terrestre);
        listaVehiculos.add(acuatico);
        listaVehiculos.add(aereo);
        listaVehiculos.add(coche1);
        listaVehiculos.add(moto1);
        listaVehiculos.add(barco1);
        listaVehiculos.add(submarino1);
        listaVehiculos.add(avion1);
        listaVehiculos.add(helicoptero1);
        
        // Recorremos la lista para ir llamando al método imprimir() de cada objeto
        for (int i = 0; i < listaVehiculos.size(); i++)
        {
            Vehiculo v = listaVehiculos.get(i);
            v.imprimir();
        }         
        
    }
    
}
