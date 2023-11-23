/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package keegan;

import java.util.Scanner;

//Global Variables 
public class AddingFunctions {

     double a, b, sum; 
     public void getvalues()
     {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter two Vlues: ");
         a = input.nextDouble();
         b = input.nextDouble();
     }
     
     public void compute()
     {
        sum = a + b;
     }
     
     public void display()
     {
         System.out.println(a + " + " + b + " = " + sum);
     }
    public static void main(String[] args) {
        // TODO code application logic here
    
        // you must call he constructor with the main class name.
        AddingFunctions obj = new AddingFunctions();
        obj.getvalues();
        obj.compute();
        obj.display();
        
    }
    
}
