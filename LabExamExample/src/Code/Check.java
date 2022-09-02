/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author OEM
 */
public class Check extends Gift{
    private String expireDate;
    private String storeName;
    private static int totalPriceOfCheck=0;
    private double bonus;

    public Check(String expireDate, String storeName, double bonus, int price) {
        super(price);
        this.expireDate = expireDate;
        this.storeName = storeName;
        this.bonus = bonus;
        totalPriceOfCheck+=price;
    }

    @Override
    public void calculateBonus() {
       
    }
    
    @Override
    public String toString(){
        return "Expire Date: "+ expireDate+ "\nStore Name: "+storeName+ "Bonus: "+bonus;
    }

    public static int getTotalPriceOfCheck() {
        return totalPriceOfCheck;
    }
    
}
