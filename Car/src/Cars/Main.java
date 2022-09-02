/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cars;

/**
 *
 * @author OEM
 */
public class Main {
    public static void main(String[] args) {
        //Car c = new Car(); 
        Car c1= new Car("Audi", "A3",'C', 450000); 
        Car c2= new Car("Mercedes", "C200",'D', 650000); 
        Car c3 = new Car(); 
        Car c4 = new Car("BMW", "5.20i");
        Car c5 = new Car("Volvo", 350000); 
        c1.display();
        c2.display();
        c3.display();
        c4.display();
        c5.display();
    }
}
