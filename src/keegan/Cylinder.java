/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package keegan;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author kmboya
 */
public class Cylinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double h, r, volume;
        Scanner input =new Scanner (System.in);
        System.out.print("Enter the Radius and Height: ");
        h = input.nextDouble();
        r= input.nextDouble();
        
        volume = Math.PI*r*r*h;
        
        
        
        DecimalFormat df=new DecimalFormat("#.##");
        System.out.print("The volume is: " + df.format(volume));
        
        
        
    }
    
}
