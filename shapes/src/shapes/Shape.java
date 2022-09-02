/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

public class Shape extends Object{
    private final int height;
    private final int base;
    Shape(int base, int height){
     this.base=base;
     this.height=height;
     System.out.println("Shape class initiated.");
     
    }
    Shape(int wide){
      this.base=wide;
      this.height=wide;  
      System.out.println("Shape class initiated.");
    }
    
        
    
   /* public void setHeight(int height){
        this.height=height;
    }  
    
    public void setBase(int base){
        this.base=base;
        
    }
*/
    public int getHeight() {
        return height;
    }

    public int getBase() {
        return base;
    }
    
    public int ImplementArea(){
        return (getBase()*getHeight());
    }
    
    public int ImplementCircum(){
        return ((2*getBase())+(2*getHeight()));
    }

    @Override
    public String toString() {
        return ("Area of Square: " + ImplementArea());
       
    }
    
    
   
    
}
