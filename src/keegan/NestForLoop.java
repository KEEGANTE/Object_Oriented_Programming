/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package keegan;

/**
 *
 * @author kmboya
 */
public class NestForLoop {


    public static void main(String[] args) {
        // TODO code application logic here
        int rows, cols;
        for(rows=1; rows <=10; rows++){
        for (cols=1; cols <10; cols++){
        System.out.print("\t" + rows*cols);
        }
        System.out.println();
        }
    }
    
}
