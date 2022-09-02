/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cars;

/**
 *
 * @author OEM
 */
public class Car {
    private String brand;
    private String model;
    private char segment;
    private int price;
    
    Car(){
       this.brand="X-Brand";
       this.model="New-Model";
       this.segment='C';
       this.price=380000;
    }
    
    Car(String brand, String model, char segment, int price){
       this.brand=brand;
       this.model=model;
       this.segment=segment;
       this.price=price;
    }
    Car(String brand, String model,int price){
       this.brand=brand;
       this.model=model;
       this.price=price;
    }
    Car(String brand, String model){
       this.brand=brand;
       this.model=model;
       this.price=870000;
       
    }
    Car(String brand, int price){
       this.brand=brand;
       this.price=price;
    }
    
    public void display(){
        System.out.println("Brand: " +brand +", "+ "Model: "+ model+ ", "+ "Segment: "+ segment + ", "+"Price: "+price +" TL");
    }
}
