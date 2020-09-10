
import static java.lang.Math.abs;

public class CuentaBancaria {

    // Atributos constantes (final)
    private final String iban;
    private final String titular;

    // Atributos variables
    private double saldo;
    private double[] movimientos;
    private int nMovimientos; // Nº de movimientos

    // Atributos constantes de clase (static final)
    private static final int MAX_MOVIMIENTOS = 100;
    private static final double SALDO_MINIMO = -50.0;
    private static final double AVISAR_HACIENDA = 3000.0;

    // Cuenta válida
    private boolean valida;

    // Constructor
    public CuentaBancaria(String iban, String titular) {

        // Guardamos iban y titular
        this.iban = iban;
        this.titular = titular;

        // Inicilizamos saldo y movimientos
        this.saldo = 0.0;
        this.movimientos = new double[MAX_MOVIMIENTOS];
        this.nMovimientos = 0;

        // Comprobamos IBAN y registramos si es una cuenta válida o no
        if (!iban.matches("^[A-Z]{2}\\d{22}")) {
            System.err.println("ERROR: el formato del IBAN no es correcto");
            this.valida = false;
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

    // Intenta ingresar una cantidad. Devuelve true si pudo hacerlo, false si no
    public boolean ingresar(double cantidad) {
        if (cantidad <= 0) {
            return false;
        }
        return operar(cantidad);
    }

    // Intenta retirar una cantidad. Devuelve true si pudo hacerlo, false si no
    public boolean retirar(double cantidad) {
        if (cantidad <= 0) {
            return false;
        }
        return operar(-cantidad);
    }

    // Intenta operar sobre la cuenta (ingresos +vo y retiradas -vo)
    // Devuelve true si fue posible, false si no
    private boolean operar(double cantidad) {

        // No se permite llegar a un saldo inferior a SALDO_MINIMO
        // Ni registrar más de MAX_MOVIMIENTOS movimientos
        if ((saldo + cantidad < SALDO_MINIMO) || (nMovimientos >= MAX_MOVIMIENTOS)) {
            return false;
        }

        // Realizamos la operación: actualizamos saldo y movimientos
        saldo += cantidad;
        movimientos[nMovimientos] = cantidad;
        nMovimientos++;

        // Avisos
        if (saldo < 0.0) {
            System.err.println("AVISO: Saldo negativo");
        }
        if (abs(cantidad) > AVISAR_HACIENDA) {
            System.err.println("AVISO: Notificar a hacienda");
        }

        // La operación fué posible
        return true;
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
        System.out.println("Movimientos: " + nMovimientos);
        for (int i = 0; i < nMovimientos; i++) {
            System.out.println("#" + (i + 1) + ": " + movimientos[i]);
        }
    }
}
