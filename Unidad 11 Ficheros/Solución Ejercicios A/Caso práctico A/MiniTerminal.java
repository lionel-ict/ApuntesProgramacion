package ud11_casopractico_a;

import java.io.*;
import java.util.Scanner;

public class MiniTerminal {

    public static void main(String[] args) {
        
        // Instanciamos a la clase MiniFileManager y a la clase Scanner
        MiniFileManager mfm = new MiniFileManager();
        Scanner in = new Scanner(System.in);
        
        // Inicializamos variables        
        String comando = "";
        String[] trozosComando;
        
        do{  
            System.out.print("user@machine:~ $ ");
            // Leemos por teclado una cadena de texto y troceamos la cadena en base al espacio
            trozosComando = (in.nextLine()).split(" ");
            // Cogemos el comando que está en la primera posicion del array
            comando = trozosComando[0];

            switch(comando.toLowerCase()){
                
                case "pwd": 
                    System.out.println(mfm.getPWD());
                    break;
                    
                case "cd":
                    try {
                        mfm.changeDir(trozosComando[1]);
                    } catch(FileNotFoundException e) {
                        System.out.println(e);
                    }
                    break;     
                    
                case "ls": 
                    mfm.printList(false);
                    break;
                    
                case "ll": 
                    mfm.printList(true);
                    break;
                    
                case "mkdir": 
                    if(!mfm.makeDir(trozosComando[1]))
                    {
                        System.out.println("No se ha podido crear la carpeta");
                    }
                    break;
                    
                case "rm":
                    try {
                        mfm.removeFile(mfm.getCurrentPath() + "/" +  trozosComando[1]);
                    } catch(FileNotFoundException e) {
                        System.out.println(e);
                    }                       
                    break;
                    
                case "mv": 
                    try {
                        if (!mfm.moveFile(trozosComando[1], trozosComando[2]))
                        {
                            System.out.println("El archivo o carpeta no se ha podido mover o renombrar");
                        }
                    } catch(FileNotFoundException e) {
                        System.out.println(e);
                    }      
                    break;
                    
                case "help": 
                    mfm.help();
                    break;
                    
                case "exit":
                    break;
                    
                default:
                    System.out.println("Comando <'" + comando + "'> no encontrado ('help' muesta la ayuda)");
                    break;
            }     
            
        } while(!comando.equals("exit"));        
    }    
}
