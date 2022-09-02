/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luggage;

/**
 *
 * @author Behic
 */
public class Luggage {
    private int luggage_ID;
    private String belongsTo;
    private int weight_kilo; 
    private double capacity_lt; 
    private int lastUsedId=500; 
   
   

    Luggage(String belongsTo, int weight_kilo, double capacity_lt) {
        this.belongsTo = belongsTo;
        this.weight_kilo = weight_kilo;
        this.capacity_lt = capacity_lt;
        luggage_ID=lastUsedId;
        lastUsedId++;
    }

    public int getLuggage_ID() {
        return luggage_ID;
    } 
    public double getCapacity_lt() {
        return capacity_lt;
    }

    public void setCapacity_lt(double capacity_lt) {
        this.capacity_lt = capacity_lt;
    }
    
    public String getBelongsTo() {
        return belongsTo;
    }

    public int getWeight_kilo() {
        return weight_kilo;
    }
     
    public String toString() {
        return "ID: "+luggage_ID+"\n"+"Belongs to: "+belongsTo+"\nWeight of the luggage: "+weight_kilo+"\nCapacity of the luggage: "+capacity_lt+" Liters\n";
         
    }

    public void setLuggage_ID(int luggage_ID) {
        this.luggage_ID = luggage_ID;
    }

    public void setBelongsTo(String belongsTo) {
        this.belongsTo = belongsTo;
    }

    public void setWeight_kilo(int weight_kilo) {
        this.weight_kilo = weight_kilo;
    }

    public void setLastUsedId(int lastUsedId) {
        this.lastUsedId = lastUsedId;
    }
    
    
    
}
