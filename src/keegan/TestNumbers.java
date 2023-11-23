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
public class TestNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, i=1;
        Scanner input = new Scanner (System.in);
        System.out.print("How many numbers ");
        n = input.nextInt();
        
        int x;
        TextArea even = new TextArea(10, 10);
        even.append("EVEN Numbers \n");
        TextArea odd = new TextArea(10,10);
        even.append("ODD Numbers \n");
        
        System.out.print("Enter some values ");
        while (i<=n)
        {
            x = input.nextInt();
            if (x%2==0){
                even.append(x + "\n");
            }
            else
            {
            odd.append(x + "\n");
            }
            i++;
        }

        JOptionPane.showMessageDialog(null,even);
        JOptionPane.showMessageDialog(null,odd);
    }
    
}
