/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package keegan;

/**
 *
 * @author kmboya
 */
public class SumEven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int sum = 0;
        
        for(n = 1; n < 20; n++)
        {
            if(n % 2==0)
            {
             sum = sum + n;
             System.out.println(n + " + " + sum + " = " + sum);
            }
        }
        //System.out.print("The result is a sum:" + sum);
    }
    
    
}
