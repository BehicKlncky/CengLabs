/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author OEM
 */
public abstract class Item extends Gift{
    protected String type;

    public Item(String type, int price) {
        super(price);
        this.type = type;
    }
    
    
    @Override
    public String toString(){
        return "Price: " +price+"\nType: "+ type;
    }
    
}
