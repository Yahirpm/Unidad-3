/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p3_fibonacci;
import java.util.Scanner;
/**
 *
 * @author ederp
 */
public class P3_Fibonacci {

    public static void main(String[] args) {
        Scanner serie = new Scanner(System.in);
        System.out.println("Ingresar cantidad deseada para la serie");
        int s = serie.nextInt();
        
        serie.close();
        
        int v1 = 0, v2 = 1;
        
        System.out.println("Tu serie con " + s + " numeros: ");
        
        for (int i = 1; i <= s; i++) {
            
            System.out.println(v1 + " ");
            
            int v3 = v1 + v2;
            v1 = v2;
            v2 = v3;
        }
        }
    }
    

