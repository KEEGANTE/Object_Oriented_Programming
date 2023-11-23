/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package keegan;

import javax.swing.JOptionPane;

/**
 *
 * @author kmboya
 */
public class Addition2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b, sum;
        String s;
        
        s =JOptionPane.showInputDialog("Enter 1st Number: ");
        a = Integer.parseInt(s);
        s = JOptionPane.showInputDialog("Enter 2nd Number: ");
        b = Integer.parseInt(s);
        
        sum = a + b;
        JOptionPane.showMessageDialog(null, "The answer is: " + a+ "+" + b + "=" + sum);
        
    }
    
}
