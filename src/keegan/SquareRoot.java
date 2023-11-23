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
public class SquareRoot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a, squareroot;
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a number: ");
        a = input.nextInt();
 
        
        squareroot = Math.sqrt(a);
        
        
        System.out.print("The Square Root of the number is: " + squareroot);
        
        
        
    }
    
}
