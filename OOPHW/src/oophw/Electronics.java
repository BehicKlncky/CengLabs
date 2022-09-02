/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oophw;

import java.util.ArrayList;

/**
 *
 * @author OEM
 */
public class Electronics {
    protected String brand;
    protected int ID;
    protected double price;
    protected static int total;
    protected String type;
    protected static ArrayList<Electronics> elecList = new ArrayList();

   public Electronics(int ID ,String brand, String type ,double price) {
        this.brand = brand;
        this.ID = ID;
        this.price = price;
        this.type = type;
    }
    
    public boolean checkID(int id){
       /*for (Electronics e : elecList){
           if(e.ID==id){
               return true;
           }
       }*/
        return this.ID==id; 
    }

    public String getBrand() {
        return brand;
    }

    public int getID() {
        return ID;
    }

    public double getPrice() {
        return price;
    }

    public static int getTotal() {
        return total;
    }

    public String getType() {
        return type;
    }

    public static void setTotal(int total) {
        Electronics.total = total;
    }
    
    @Override
    public String toString(){
        return "Brand "+brand+"\n"+"ID "+ ID+"\n"+ "price "+ price+"\n"+"type "+type+"\n";
    }
    
}
