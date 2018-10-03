/*
 * Jessica Qiao
 * AreaOfCircle.java
 * This program calculates the area of a Circle of radius 15 cm
 * September 18,2018
 */

package areaofacircle;

/**
 *
 * @author shqia0005
 */
public class Areaofacircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radius = 15.0;
        double pi = 3.14;
        double area = 0.0;
        // algorithm for area calc
        area = pi * radius * radius;
        System.out.println("the area is " + area + " cm squared");
    }
    
}
