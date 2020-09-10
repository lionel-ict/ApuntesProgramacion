
public class CuentaAhorro extends CuentaBancaria {

    // Atributos
    final double saldoMinimo = 3000;

    // constructor
    public CuentaAhorro(String iban, double saldo) {
        super(iban, saldo);
    }

    // Calcula intereses y los ingresa en la cuenta
    public void calcularIntereses() {
        double interes;
        if (this.getSaldo() < saldoMinimo) {
            interes = this.getSaldo() * ((interesAnualBasico / 2.0) / 100.0);
        } else {
            interes = this.getSaldo() * ((interesAnualBasico * 2.0) / 100.0);
        }
        this.ingresar(interes);
    }

    public void mostrar() {
        System.out.println("Cuenta Ahorro    IBAN: " + this.getIban() + " Saldo: " + this.getSaldo());
    }
    
}
