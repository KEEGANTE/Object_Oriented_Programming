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
public class TestReturnMethods {

   public double getvalues()
   {
       double n;
       Scanner input = new Scanner(System.in);
       System.out.print("Enter values ");
       n = input.nextDouble();
       
       return n;
   }
   
   public double compute(double a, double b)
   {
     double sum = a + b; //localized
     return sum; //computer forgets about it when returned
   }
    
    public void display (double a, double b, double sum)
    {
      System.out.println (a + " + " + b + " = " + sum); 
    }        
            
    public static void main(String[] args) {
        // TODO code application logic here
        
        TestReturnMethods obj = new TestReturnMethods();
        double a, b, sum;
        
        a = obj.getvalues();
        b = obj.getvalues();
        sum = obj.compute(a, b);
        
        obj.display (a, b, sum);
    }
    
}
