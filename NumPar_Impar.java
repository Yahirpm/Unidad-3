/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numpar_impar;
import java.util.Scanner;
/**
 *
 * @author ederp
 */
public class NumPar_Impar {


    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Ingresa un numero entero ");
        int numero = num.nextInt();
        
        boolean espar = numero % 2 == 0;
        if (espar){
            System.out.println("El numero es par ");
        }else {
            System.out.println("El numero es impar ");
        }
    }
    
}
