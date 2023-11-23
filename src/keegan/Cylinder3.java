/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keegan;

import java.text.DecimalFormat;

/**
 *
 * @author kmboya
 */
public class Cylinder3 {
    //attributes
    double radius, height, volume;
    
    //methods 

    public Cylinder3() {
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public String getVolume() {
        volume = Math.PI*getRadius()*getRadius()*getHeight();
        DecimalFormat df = new DecimalFormat("0.00");
        
        return df.format(volume);
    }

    @Override
    public String toString() {
        return  getRadius() + "\t"+ 
                getHeight() + "\t"+ 
                getVolume() + "\n";
    }
    
}
