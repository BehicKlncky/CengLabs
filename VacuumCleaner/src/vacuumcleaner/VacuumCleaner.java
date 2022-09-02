/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vacuumcleaner;


public class VacuumCleaner {
    
    private String state;
    private int speed;
    private int temp;

    public void setTemp(int temp) {
        System.out.println("Changing temperature to: "+temp);
        this.temp = temp;
        
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    VacuumCleaner(){
        this.state="Exploring";
        this.speed=2;
        this.temp=-60;
        
      }   
    
   public void displayAttributes(){
       
    System.out.println("State: " + state +"\n"+"Speed: "+speed+"\n"+"Temperature: " +temp);
               
       
   }
   
   public void controlTemp(){
       System.out.println("Checking the tempreature...");
       if(this.temp<-80){
           setSpeed(5);
           setState("Turn to home");
       }    
       
   }
    
}
