/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package keegan;

import java.awt.TextArea;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author kmboya
 */
public class TestCylinder3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TextArea output = new TextArea(10, 10);
        for (int n =0; n<3; n++)
        {
        Cylinder3 cy = new Cylinder3();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter radius and height: ");
        cy.radius=input.nextDouble();
        cy.height=input.nextDouble();
        
        output.append(cy.toString());
        
        }
        JOptionPane.showMessageDialog(null, output);
    }
    
}
