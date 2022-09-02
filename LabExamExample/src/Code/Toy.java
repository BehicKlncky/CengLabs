/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author OEM
 */
public class Toy extends Item {
    private int toyAge;
    private int maxAge;
    private int warranity;
    private int bonus;
    private static double totalPriceOfToys=0;
    

    public Toy(int toyAge, int maxAge, int warranity, int bonus, String type, int price) {
        super(type, price);
        this.toyAge = toyAge;
        this.maxAge = maxAge;
        this.warranity = warranity;
        this.bonus = bonus;
        totalPriceOfToys+=price;
    }

    @Override
    public void calculateBonus() {
        
    }
    @Override
    public String toString(){
        return "Toy Age: "+ toyAge+ "\nMax Age: "+maxAge+"Warranity: "+warranity+"\nBonus: "+bonus;
    }
}
