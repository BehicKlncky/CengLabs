/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library;

/**
 *
 * @author Behic
 */
public class Library {

    
    public static void main(String[] args) {
     Book b1 = new Book();
     Book b2 = new Book("The Java Tutorial");
     Book b3 = new Book("Accounting Principles", 2005, 135.8);
     Book b4 = new Book("Algorithms in C", 2008, 45.5);

      b1.display();
      b2.display();
      b3.display();
      b4.display();
    }
    
}
