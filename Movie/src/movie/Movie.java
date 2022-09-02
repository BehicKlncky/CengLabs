/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movie;

/**
 *
 * @author Behic
 * @version 3rd Question
 */
public class Movie {
    private String title;
    private int year;
    private Double rating;

    Movie() {
         
    }
    
    Movie(String title, int year, Double rating){
        this.title=title;
        this.year=year;
        this.rating=rating;
    }

    Movie(String title) {
        this.title = title;
    }

    Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }
    
    public void display(){
        System.out.println(title+", "+year+", "+rating+" points"); 
        
    }
    
}


