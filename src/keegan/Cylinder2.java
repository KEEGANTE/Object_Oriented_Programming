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
public class Cylinder2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double r, h, volume;
        
        String s;
        
        s = JOptionPane.showInputDialog("Enter Radius:");
        r = Double.parseDouble(s);
        s = JOptionPane.showInputDialog("Enter Height: ");
        h = Double.parseDouble(s);
        
        volume = Math.PI*r*r*h;
        
        DecimalFormat df = new DecimalFormat("0.00");
        JOptionPane.showMessageDialog(null, "The Volume is: " + df.format(volume));
    }
    
}
