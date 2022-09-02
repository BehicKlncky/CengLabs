/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musvedde;


public class Circle {
    private static int numofCircles;
    private Double radius;
    
    Circle(Double radius){
        this.radius=radius;
        numofCircles++;
    }
    
    public Double implementArea(){
        return 3.14*(Math.pow(radius, 2));
    }
    
    public Double implementCircum(){
        return 2*(3.14)*radius;
    }
    public static void displayNumsofCircles(){
        System.out.println("You have "+numofCircles +" circles");
    }
}
