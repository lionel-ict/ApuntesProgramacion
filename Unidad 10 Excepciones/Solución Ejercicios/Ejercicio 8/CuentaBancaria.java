package ud10_ejercicio8;

import java.lang.*;
import java.util.ArrayList;

public class CuentaBancaria {
    
    // Atributos constantes (final)
    private final String iban;
    private final String titular;

    // Atributos variables
    private double saldo;
    private ArrayList movimientos;
    
    // Atributos constantes de clase (static final)    
    private static final double SALDO_MINIMO = -50.0;
    private static final double AVISAR_HACIENDA = 3000.0;

    // Cuenta válida
    private boolean valida;

    // Constructor
    public CuentaBancaria(String iban, String titular) throws CuentaException {

        // Guardamos iban y titular
        this.iban = iban;
        this.titular = titular;

        // Inicilizamos saldo y movimientos
        this.saldo = 0.0;
        this.movimientos = new ArrayList();        

        // Comprobamos IBAN y registramos si es una cuenta válida o no
        if (!iban.matches("^[A-Z]{2}\\d{22}")) {
            this.valida = false;
            throw new CuentaException("El formato del IBAN no es correcto");            
        } else {
            this.valida = true;
        }
    }

    public String getIban() {
        return iban;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean getValida() {
        return valida;
    }

    // Intenta ingresar una cantidad. Devuelve true si pudo hacerlo y lanza una excepción si no
    public boolean ingresar(double cantidad) throws CuentaException, AvisarHaciendaException, Exception{
        if (cantidad <= 0) {
            throw new CuentaException("La cantidad a ingresar debe ser mayor que 0");
        }
        return operar(cantidad);
    }

    // Intenta retirar una cantidad. Devuelve true si pudo hacerlo y lanza una excepción si no
    public boolean retirar(double cantidad) throws CuentaException, AvisarHaciendaException, Exception{
        if (cantidad <= 0) {
            throw new CuentaException("La cantidad a retirar debe ser mayor que 0");
        }
        return operar(-cantidad);
    }

    // Intenta operar sobre la cuenta (ingresos +vo y retiradas -vo)
    // Devuelve true si fue posible y lanza una excepción si no
    private boolean operar(double cantidad) throws CuentaException, AvisarHaciendaException, AvisarHaciendaAndSaldoException, Exception
    {
        // No se permite llegar a un saldo inferior a SALDO_MINIMO        
        if (saldo + cantidad < SALDO_MINIMO) {
            throw new CuentaException("La operación no se puede realizar porque tendríamos un saldo inferior a SALDO_MINIMO");
        }

        // Realizamos la operación: actualizamos saldo y movimientos
        saldo += cantidad;
        movimientos.add(cantidad);       

        // Avisos
        // Lanzará una excepción avisando de que el saldo es negativo y de que la cantidad a ingresar/retirar es mayor que AVISAR_HACIENDA después de hacer la operación 
        if((saldo < 0.0) && (Math.abs(cantidad) > AVISAR_HACIENDA)){
            throw new AvisarHaciendaAndSaldoException(this.getIban(), this.getTitular(), tipoOperacion(cantidad), Math.abs(cantidad), "Aviso: Saldo en cuenta negativo"); 
        }
        else if (saldo < 0.0){ // Lanzará una excepción avisando de que el saldo es negativo después de hacer la operación            
            throw new Exception("Aviso: Saldo en cuenta negativo");
        } 
        else if (Math.abs(cantidad) > AVISAR_HACIENDA){ // Lanzará una excepción avisando de que la cantidad a ingresar/retirar es mayor que AVISAR_HACIENDA
            throw new AvisarHaciendaException(this.getIban(), this.getTitular(), tipoOperacion(cantidad), Math.abs(cantidad));
        }
        // La operación fué posible
        return true;
    }
    
    private String tipoOperacion(double cantidad)
    {
        String tipoOperacion = "";
            
        if(cantidad>0)
        {
            tipoOperacion = "INGRESO";
        }
        else if(cantidad<0)
        {
            tipoOperacion = "RETIRADA";
        }
        
        return tipoOperacion;
        
    }

    // Imprimir informacion de la cuenta
    public void imprimir() {
        imprimirDatos();
        imprimirMovimientos();
    }

    // Imprimir datos de la cuenta
    public void imprimirDatos() {
        System.out.println("IBAN: " + getIban() + " - Titular: " + getTitular() + " - Saldo: " + getSaldo());
    }

    // Imprimir movimientos realizados
    public void imprimirMovimientos() {
        System.out.println("Movimientos: " + movimientos.size());
        for (int i = 0; i < movimientos.size(); i++) {
            System.out.println("#" + (i + 1) + ": " + movimientos.get(i));
        }
    }
    
}
