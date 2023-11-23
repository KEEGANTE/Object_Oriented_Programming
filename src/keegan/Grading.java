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
public class Grading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int scores;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your marks below: \n");
        
        scores = input.nextInt();
        
        if (scores > 100 || scores < 0)
        {
          System.out.print("invalid scores");
          System.exit(0);
        }
                
                
        else if (scores>=90){
        System.out.print(" A ");
        }
        else if (scores >= 80) {
        System.out.print(" B ");
        }
        else if (scores >= 70) {
            System.out.print(" C ");
        }
        else if (scores >= 60){
            System.out.print(" D ");
        }
        else {
            System.out.print(" F ");
        }
               
    }
    
}
