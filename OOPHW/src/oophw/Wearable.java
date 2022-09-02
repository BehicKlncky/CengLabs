/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oophw;

/**
 *
 * @author OEM
 */
public class Wearable extends Electronics{
    private String bodypart;

     public Wearable(int ID, String brand, String type, double price, String bodypart) {
        super(ID, brand, type, price);
        this.bodypart = bodypart;
    }

   

    public String getBodypart() {
        return bodypart;
    }
    
    @Override
     public String toString(){
        return "Brand "+brand+"\n"+"ID "+ ID+"\n"+ "price "+ price+"\n"+"type "+type+"\n"+"Body Part: "+bodypart+"\n";
    }
   
    
}
