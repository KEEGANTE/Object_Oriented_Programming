/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package keegan;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author kmboya
 */
public class TriangleArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double b, h, area;
        
        String s;
        
        s = JOptionPane.showInputDialog("Enter base: ");
        b = Double.parseDouble(s);
        s = JOptionPane.showInputDialog("Enter Height: ");
        h = Double.parseDouble(s);
        
        area = 0.5*b*h;
        
        DecimalFormat df = new DecimalFormat("0.00");
        JOptionPane.showMessageDialog(null, "The area of the triangle is: "+df.format(area)); 
        
    }
    
}
