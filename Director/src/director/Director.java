/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package director;

/**
 *
 * @author Behic
 * @version 4th Question
 */
public class Director {
    private String name;
    private int numberOfFilms;
    private int oscars;
    private String info;
    
    Director(){
        this.name=" Alejandro González Iñárritu";
        this.numberOfFilms=16;
        this.oscars=7;
        this.info=" is well known with the movies like: Birdman, The Revenant";
    }

    public Director(String name, int numberOfFilms, int oscars, String info) {
        this.name = name;
        this.numberOfFilms = numberOfFilms;
        this.oscars = oscars;
        this.info = info;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfFilms() {
        return numberOfFilms;
    }

    public int getOscars() {
        return oscars;
    }

    public String getInfo() {
        return info;
    }
    public int earningsPerMovie(){
        double i = numberOfFilms/oscars;
        if(i<5){
            return 10000000;
        }
        else if(i>=5 && i<10){
            return 5000000;
        }    
        else if(i>=10 && i<15){
            return 1000000;
        }
        else 
            return 500000;
        
    } 
    public void display(){
        System.out.println("Director information:\n--------------------\n"+"Name: "+name+"\n"+"Number of Films: "+numberOfFilms+"\n"+"Oscar films and Nominees: "+oscars+"\n"+name+info+", "+earningsPerMovie()+" per film.");
    }
    
    
}
