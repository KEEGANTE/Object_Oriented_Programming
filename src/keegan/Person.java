/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keegan;

/**
 *
 * @author kmboya
 */
public class Person {
    //atributes
    String firstname;
    String secondname;
    int age;
    
    //methods
    public Person () //all methods are public
    {
        
    }
    
    public String getfirstname()
    {
        return firstname;
    }
    
    public String getsecondname() 
    {
        return secondname;
    }
    
    public int getage() 
    {
        return age;
    }
    
    public String toString() //it is overiding, and the only worry is when it is red so its okay.
    {
        return getfirstname() + "\t" + getsecondname() + "\t" + getage() + "\n";
    }
    
    
}
