/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musvedde;

import java.util.Scanner;

public class Main {
    
   
    
    public static void main(String[] args) {
     Double radius;
     Scanner scan = new Scanner(System.in);
     System.out.println("Please enter the radius of c1...");
     Double i=scan.nextDouble();
     while(i <= 0){
         System.out.println("Invalid radius!!");
         i=scan.nextDouble();
     }
     radius=i;
     System.out.println("Your Radius: " + radius);
     Circle c1 = new Circle(radius);
     System.out.println("C1's area and circumference are: " + c1.implementArea()+" "+c1.implementCircum());
     
     
     
     
      System.out.println("Please enter the radius of c2...");
     i=scan.nextDouble();
     while(i <= 0){
         System.out.println("Invalid radius!!");
         i=scan.nextDouble();
     }
     radius=i;
     System.out.println("Your Radius: " + radius);
     Circle c2 = new Circle(radius);
     System.out.println("C1's area and circumference are: " + c2.implementArea()+" "+c2.implementCircum());
     Circle.displayNumsofCircles();
    }

   

    
       
}  
        
        
           
            
               
            
               
            
            
            
        
    
            
    

