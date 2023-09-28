/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author labcca
 */
public class scanner {
    
    public static void main(String[] args) {
        Scanner saldo = new Scanner(System.in);
        System.out.println("Bienvenido al cajero automatico");
        System.out.println("Selecciona una opcion");
        System.out.println("1.Consultar saldo");
        System.out.println("2.Depositar dinero");
        System.out.println("3.Retirar dinero");
        System.out.println("4.Salir");
        
        int opcion = saldo.nextInt();
        
        double saldoin = 2000.20;
        switch (opcion){
            case 1: 
                System.out.println("Tu saldo es de: " + saldoin);
                break;
            
            case 2:
                System.out.println("Ingrsa la cantidad a depositar");
                double dep = saldo.nextDouble();
                saldo.nextLine();
                
                double deposito = saldoin + dep;
                System.out.println("Deposito exitoso");
                System.out.println("Tu saldo es de $ " + deposito);
                break;
               
            case 3:
                System.out.println("Ingresa la cantidad a retirar"); 
                double ret = saldo.nextDouble();
                saldo.nextLine();
                
                if  (ret <= saldoin){
                    saldoin -=ret;
                    
                    System.out.println("Retiro exitoso.Saldo actual $ " + saldoin);
                } else {
                    System.out.println("Saldo insuficiente");
                }
                break;
            
            case 4:
                System.out.println("Gracias por usar el cajero");
                System.exit(0);
                break;
                
            default:
                System.out.println("pcion no valida.Vuelve a intentarlo");
                break;
        }
        
    }
}
