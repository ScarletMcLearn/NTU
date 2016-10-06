package Testers;

import Logics.Rectangle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mac
 */
public class RectangleTester {
    
    
    public static void main(String[] args) {
        
        
        Rectangle r1 = new Rectangle();
        r1.setWidth(2);
        System.out.println("r1's width : " + r1.getWidth());
        r1.setLength(6);
        System.out.println("r1's length : " + r1.getLength());
        System.out.println("r1's area : "+ r1.getArea());
        System.out.println("r1's perimeter : "+ r1.getPerimeter());
        System.out.println(r1.toString());
    }
    
}
