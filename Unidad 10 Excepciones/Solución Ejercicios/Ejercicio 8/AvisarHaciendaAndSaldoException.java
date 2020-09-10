package ud10_ejercicio8;

public class AvisarHaciendaAndSaldoException extends Exception {
     // Atributos
    private String iban;
    private String titular;
    private String tipoOperacion;
    private double cantidad;
    private String msjSaldo;
    
    // Constructor
    public AvisarHaciendaAndSaldoException(String iban, String titular, String tipoOperacion, double cantidad, String msjSaldo) 
    {
        this.iban = iban;
        this.titular = titular;
        this.tipoOperacion = tipoOperacion;
        this.cantidad = cantidad;
        this.msjSaldo = msjSaldo;
    }
    
    @Override
    public String toString()
    {
        String msj = "Aviso: El titular " + this.titular + " de la cuenta " + this.iban + " ha realizado un/a " + this.tipoOperacion + " de " + this.cantidad + "\n";
        msj += this.msjSaldo;
        return "Excepción Avisar Hacienda y Saldo Negativo: \n" + msj;
    }  
    
}
