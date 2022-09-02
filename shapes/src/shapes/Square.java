/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author OEM
 */
public class Square extends Shape{
    Square(int wide){
        super(wide);
        System.out.println("Square Class initated...");
    }
    
    public void displayAreaSquare(){
        System.out.println("Area of Square: " + ImplementArea());
        
    }
    
    public void displayCircumSquare(){
        System.out.println("Circumference of Square: " + ImplementCircum());
    }
    
    
  
}
