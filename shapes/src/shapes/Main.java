/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shapes;

/**
 *
 * @author Meyic
 * @version 1.5
 */
public class Main {

    public static void main(String[] args) {
       Rectangle r1 = new Rectangle(4, 6);
       r1.diplayAreaRectangle();
       r1.displayCircumRectangle();
       Square s1 = new Square(4);
        System.out.println(s1);
       s1.displayCircumSquare();
    }
    
}
