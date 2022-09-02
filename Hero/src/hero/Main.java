/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hero;

/**
 *
 * @author E.B.A.X. Company
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("Hero:");
        Hero h = new Hero();
        h.fight();
        h.fly();
        h.swim();
        System.out.println("Action Charachter:");
        ActionCharachter a = new ActionCharachter();
        a.fight();
    }
}
