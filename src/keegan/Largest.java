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
public class Largest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a, b, c, large;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three value: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        
        if (a>b){
            large = a;
        }
        
        else {
            large = b;
        }
        
        if (c>large){
            large = c;
        }
        
        System.out.print("The largest of " + a + " and " + b + " and " + c + " is " + large);
    }
    
}
