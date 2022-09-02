/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author OEM
 */
public abstract class Gift implements ShoppingInfo{
    protected int price;

    public Gift(int price) {
        this.price = price;
    }
    
    @Override
    public String toString(){
        return "Price: "+ price;
    } 
    
}
