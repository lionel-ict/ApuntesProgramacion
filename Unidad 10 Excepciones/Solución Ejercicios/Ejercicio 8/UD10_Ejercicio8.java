package ud10_ejercicio8;

import java.util.*;

public class UD10_Ejercicio8 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        CuentaBancaria cuenta = null; 
        
        boolean errorCuenta;
             
        // Pedimos datos y creamos la cuenta. Repetimos mientras haya un error en la cuenta
        do {
            try
            {
                System.out.print("Introduzca numero IBAN: ");
                String iban = sc.nextLine();
                System.out.print("Introduzca titular de cuenta: ");
                String titular = sc.nextLine();
                cuenta = new CuentaBancaria(iban, titular);
                errorCuenta = false;
            }
            catch (CuentaException e)
            {
                System.out.println(e);
                e.printStackTrace();
                errorCuenta = true;
            }     

        } while (errorCuenta);

        int opcion;
        double cantidad;

        do {
            System.out.println("Elija una opción");
            System.out.println("1. Datos de la cuenta.");
            System.out.println("2. IBAN.");
            System.out.println("3. Titular.");
            System.out.println("4. Saldo.");
            System.out.println("5. Ingreso.");
            System.out.println("6. Retirada.");
            System.out.println("7. Movimientos.");
            System.out.println("8. Salir.");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    cuenta.imprimirDatos();
                    break;
                case 2:
                    System.out.println("IBAN: " + cuenta.getIban());
                    break;
                case 3:
                    System.out.println("Titular: " + cuenta.getTitular());
                    break;
                case 4:
                    System.out.println("Saldo: " + cuenta.getSaldo());
                    break;
                case 5:
                    System.out.print("Inserte cantidad a ingresar: ");
                    cantidad = sc.nextDouble();                    
                    try
                    {
                        cuenta.ingresar(cantidad);
                    }
                    catch(CuentaException e)
                    {
                        System.out.println(e);
                        e.printStackTrace();
                    }
                    catch(AvisarHaciendaException e)
                    {
                        System.out.println(e);
                        e.printStackTrace();
                    }
                    catch(AvisarHaciendaAndSaldoException e)
                    {
                        System.out.println(e);
                        e.printStackTrace();                        
                    }
                    catch(Exception e)
                    {
                        System.out.println(e);
                        e.printStackTrace();
                    }
                    break;
                case 6:
                    System.out.print("Inserte cantidad a retirar:");
                    cantidad = sc.nextDouble();                    
                    try
                    {
                        cuenta.retirar(cantidad);
                    }
                    catch(CuentaException e)
                    {
                        System.out.println(e);
                        e.printStackTrace();
                    }
                    catch(AvisarHaciendaException e)
                    {
                        System.out.println(e);
                        e.printStackTrace();
                    }
                    catch(AvisarHaciendaAndSaldoException e)
                    {
                        System.out.println(e);
                        e.printStackTrace();                        
                    }
                    catch(Exception e)
                    {
                        System.out.println(e);
                        e.printStackTrace();
                    }
                    break;
                case 7:
                    cuenta.imprimirMovimientos();
                    break;
                case 8:
                    System.out.println("GRACIAS POR USAR NUESTRA APLICACION");
                    break;
                default:
                    System.out.println("Opción elegida incorrecta.");
                    break;
            }
        } while (opcion != 8);  

        sc.close();           
    }    
}
