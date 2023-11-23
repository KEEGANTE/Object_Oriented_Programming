/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package keegan;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author kmboya
 */
public class TestWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        FileWriter output = new FileWriter("DisplayNumbers.xls", true);
        FileWriter output2 = new FileWriter("Numbers.doc", true);
        int n=10;
        output.append("Number\tSquare\tCube\n"); //dont put it inside the loop 
        while (n<=100){
        output.append(n + "\t" + n * n + "\t" + n * n * n +"\n");
         output2.append(n + "\t" + n * n + "\t" + n * n * n +"\n");
        n++;
        }
               output.close();
               output2.close();
    }
    
}
