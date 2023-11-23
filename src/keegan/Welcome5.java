/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keegan;

import java.awt.TextArea;
import javax.swing.JOptionPane;

/**
 *
 * @author kmboya
 */
public class Welcome5 {
    public static void main (String[] args){
        TextArea textarea = new TextArea(10, 3);
        textarea.append("Number\tSquare\tCube\n");
        for (int n=1; n<=100; n++)
    {
        textarea.append(n+ "\t" + Math.pow(n,2) + "\t" + Math.pow(n, 3) + "\n");
    }
      JOptionPane.showMessageDialog(null, textarea);  
    }
    
}
