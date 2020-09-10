
import java.util.ArrayList;

class Planeta extends Astro {

    // Atributos
    private double distSol;
    private double orbSol;
    private boolean tieneSat;
    private ArrayList<Satelite> satelites;

    // Constructor
    Planeta(String nombre, double radio, double rotEje, double masa, double tempMedia, double gravedad, double distSol, double orbSol, boolean tieneSat, ArrayList<Satelite> satelites) {
        super(nombre, radio, rotEje, masa, tempMedia, gravedad);
        this.distSol = distSol;
        this.orbSol = orbSol;
        this.tieneSat = tieneSat;
        this.satelites = satelites;
    }

    // Constructor sin satélites (puede añadirse después con "añadirSatelite")
    Planeta(String nombre, double radio, double rotEje, double masa, double tempMedia, double gravedad, double distSol, double orbSol) {
        super(nombre, radio, rotEje, masa, tempMedia, gravedad);
        this.distSol = distSol;
        this.orbSol = orbSol;
        this.tieneSat = false;
        this.satelites = new ArrayList();
    }

    // Añadimos un satélite
    public void añadirSatelite(Satelite s) {
        satelites.add(s);
        this.tieneSat = true;
    }

    // Mostramos información del planeta
    public void muestra() {
        System.out.println("*** PLANETA " + this.getNombre() + " ***");
        System.out.println("Radio            : " + this.getRadio());
        System.out.println("Rotación eje     : " + this.getRotEje());
        System.out.println("Masa:            : " + this.getMasa());
        System.out.println("Temperatura media: " + this.getTempMedia());
        System.out.println("Gravedad         : " + this.getGravedad());
        System.out.println("Distancia al sol : " + this.getDistSol());
        System.out.println("Órbita al sol    : " + this.getOrbSol());
        System.out.println("Tiene satélites  : " + this.getTieneSat());
        if (tieneSat) {
            for (int i = 0; i < getSatelites().size(); i++) {
                System.out.println("  - Satélite " + i + ": " + this.getSatelites().get(i).getNombre());
            }
        }
    }

    // GETTERS Y SETTERS
    ;
    
    public double getDistSol() {
        return distSol;
    }

    public void setDistSol(double distSol) {
        this.distSol = distSol;
    }

    public double getOrbSol() {
        return orbSol;
    }

    public void setOrbSol(double orbSol) {
        this.orbSol = orbSol;
    }

    public boolean getTieneSat() {
        return tieneSat;
    }

    public void setTieneSat(boolean tieneSat) {
        this.tieneSat = tieneSat;
    }

    public ArrayList<Satelite> getSatelites() {
        return satelites;
    }

    public void setSatelites(ArrayList<Satelite> satelites) {
        this.satelites = satelites;
    }

}
