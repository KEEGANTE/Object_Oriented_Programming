/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package keegan;

//import java.awt.TextArea;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner; 
//import javax.swing.JOptionPane;

/**
 *
 * @author kmboya
 */
public class TestPerson {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
       //TextArea output = new TextArea(10, 10);
       
        FileWriter output = new FileWriter("Person.xls",true);
        
         for (int n =0; n<3; n++){
        Person obj = new Person();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter First Name, Second name and age of students: ");
        obj.firstname = input.next();
        obj.secondname = input.next();
        obj.age = input.nextInt();
        
        output.append(obj.toString());
         
        }
         output.close();
         //JOptionPane.showMessageDialog(null, output);
    }
    
}
