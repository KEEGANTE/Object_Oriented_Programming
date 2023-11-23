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
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double b, h, area;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter base and height:");
        b=input.nextDouble();
        h=input.nextDouble();
        
        area = 0.5*b*h;
        
        //DecimalFormat df=new DecimalFormat("0.00");
        //DecimalFormat df=new DecimalFormat("0,000.00");
        //DecimalFormat df=new DecimalFormat("$0,000.00");
        DecimalFormat df=new DecimalFormat("#.##"); //you can format with any character
        System.out.print("area = " + df.format(area));
    }
    
}
