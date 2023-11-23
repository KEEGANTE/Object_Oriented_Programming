/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package keegan;

import java.util.Scanner;



/**
 *
 * @author kmboya
 */
public class Adding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,sum;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: \t");
        a=input.nextInt();
        b=input.nextInt();
        
        sum=a+b;
        System.out.print("The sum is:" + a + b + sum);
    }
    
}
