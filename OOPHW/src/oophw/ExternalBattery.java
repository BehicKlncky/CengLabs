/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oophw;

/**
 *
 * @author OEM
 */
public class ExternalBattery extends Electronics {
    private int cablelength;
    private int capacity;

    public ExternalBattery(int ID, String brand, String type, double price, int capacity, int cablelength) {
        super(ID, brand, type, price);
        this.capacity = capacity;
        this.cablelength = cablelength;
    }

    

    public int getCablelength() {
        return cablelength;
    }

    public int getCapacity() {
        return capacity;
    }

   @Override
     public String toString(){
        return "Brand "+brand+"\n"+"ID "+ ID+"\n"+ "price "+ price+"\n"+"type "+type+"\n"+"Cable Length: "+cablelength+"\nCapacity: "+capacity;
    }
    
    
    
    
}
