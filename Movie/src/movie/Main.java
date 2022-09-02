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
public class Main {
    public static void main(String[] args) {
        Movie m1= new Movie("La La Land", 2016, 8.5);
        Movie m2= new Movie("The Godfather", 1972, 9.2);
        Movie m3 = new Movie();
        Movie m4 = new Movie("Night on Earth",1991);
        System.out.println("*********************\nMovies' Info");
        m1.display();
        m2.display();
        m3.display();
        m4.display();
    }
}
