/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author OEM
 */
public class Flower extends Item{
    private int flowerCount;
    private String flowerColor;
    private String packageColor;
    private static double totalPriceOfFlower=0;
    private int bonusFlower;

    public Flower(int flowerCount, String flowerColor, String packageColor, int bonusFlower, String type, int price) {
        super(type, price);
        this.flowerCount = flowerCount;
        this.flowerColor = flowerColor;
        this.packageColor = packageColor;
        this.bonusFlower = bonusFlower;
        totalPriceOfFlower+=price;
    }
    
    @Override
    public void calculateBonus() {
      if(flowerCount >=20){
          bonusFlower+=5;
          
      }
      else if(flowerCount >=15){
          bonusFlower+=2;
      }
        
    }
    
}
