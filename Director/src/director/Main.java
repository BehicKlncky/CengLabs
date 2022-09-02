/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package director;

/**
 *
 * @author Behic
 * @version 4th Question 
 */
public class Main {
    public static void main(String[] args) {
       //create object
    Director d1 = new Director( );
// set the name
    d1.setName("Evren Aykac");
//display the Directorinfo
    d1.display();
//display information on console
    //System.out.println(d1.getName() + d1.getInfo() + ", earns "+d1.earningsPerMovie()+ "$ per film"); 
    Director d2 = new Director ("Steven Spielberg", 161, 17," is well known with Schindler’s Listand Saving Private Ryan") ; 
    d2.display();
    
    }
}
