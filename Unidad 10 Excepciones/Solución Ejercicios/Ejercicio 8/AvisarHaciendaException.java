package ud10_ejercicio8;

public class AvisarHaciendaException extends Exception {
    // Atributos
    private String iban;
    private String titular;
    private String tipoOperacion;
    private double cantidad;
    
    // Constructor
    public AvisarHaciendaException(String iban, String titular, String tipoOperacion, double cantidad) 
    {
        this.iban = iban;
        this.titular = titular;
        this.tipoOperacion = tipoOperacion;
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString()
    {
        String msj = "Aviso: El titular " + this.titular + " de la cuenta " + this.iban + " ha realizado un/a " + this.tipoOperacion + " de " + this.cantidad;
        return "Excepción Avisar Hacienda: " + msj;
    }  
    
}
