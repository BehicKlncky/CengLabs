/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

/**
 *
 * @author Behic
 * @since 1.11.21
 */
public class Book {
    private final String title;
    private final int publishYear;
    private final Double price;
    
    Book(){
        this.title="NobookTitle";
        this.publishYear=0;
        this.price=0.0;
        
    }
    Book(String title, int publishYear, Double price){
        this.title=title;
        this.publishYear=publishYear;
        this.price=price;
        
    }
    Book(String title, int publishYear){
        this.title=title;
        this.publishYear=publishYear;
        this.price=0.0;
        
    }
     Book(String title){
        this.title=title;
        this.publishYear=0;
        this.price=0.0;
        
    }

    public void display(){
        System.out.println(title+", "+publishYear+", "+price+" TL");
    }
    
    
    
}
