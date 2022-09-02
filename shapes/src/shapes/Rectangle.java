/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author OEM
 */
public class Rectangle extends Shape{
    
    
    public Rectangle(int base, int height){
       super(base,height);
        System.out.println("Rectangle Class initiated...");
    }
    
    public void diplayAreaRectangle(){
        System.out.println("Area of Rectangle: " + ImplementArea());
        
    }
    
    public void displayCircumRectangle(){
        System.out.println("Circumference of Rectangle: " + ImplementCircum());
    }
    
    
}
