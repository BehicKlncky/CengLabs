/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luggage;

/**
 *
 * @author Behic
 */
public class LuggageList {
    private static final int MAX_KILOS=50;
    private static final int MAX_COUNT=5;
    Luggage myLuggages[]= new Luggage[MAX_COUNT];
    private int total_Kilo=0;
    public int total_LuggageCount=0;
    public int a=500;
    public boolean addLuggage(Luggage l){
        if(total_LuggageCount<MAX_COUNT && total_Kilo<MAX_KILOS){
            myLuggages[total_LuggageCount]=l;
            myLuggages[total_LuggageCount].setLuggage_ID(a);
           total_Kilo = l.getWeight_kilo()+total_Kilo;
            System.out.println("The Luggage Belonging to "+myLuggages[total_LuggageCount].getBelongsTo() + " is added to the list."); 
            total_LuggageCount++;
            a++;
            
            return true;
        }
        else{
            System.out.println("Error: Max size of (kilo or/and count) is reached! Cannot add any more luggage!!");
            return false;
        }
    }
    public boolean removeLuggage(String luggage_ID){
        int ID = Integer.parseInt(luggage_ID);
        for(int i=0;i<total_LuggageCount;i++){
            if(myLuggages[i].getLuggage_ID()==ID && myLuggages.length>i){
                System.out.println("The Luggeage belonging to "+myLuggages[i].getBelongsTo()+" is removed...");
                myLuggages[i]=myLuggages[total_LuggageCount-1];
                total_LuggageCount--;
               
                return true;
                
            }
        }
        return false;
    }
    public Luggage getLuggage(String belongs_to){
        for(int i=0;i<MAX_COUNT;i++){
            if(myLuggages[i].getBelongsTo().equals(belongs_to)){
                return myLuggages[i];
            }
        }
        
        return null;
    }
    public Luggage[] getAll(){
        return myLuggages;
    }
    public Luggage getHighestCapacityLuggage(){
           double max=0;
           Luggage maxCapacityOne=null;
           for(int i=0;i<total_LuggageCount;i++){
           if(myLuggages[i].getCapacity_lt()>max){
                max=myLuggages[i].getCapacity_lt();
                maxCapacityOne=myLuggages[i];
            }
            
            
        }
       
        return maxCapacityOne;
    }
    public void display(){
        for (int i=0;i<total_LuggageCount;i++){
            System.out.println(myLuggages[i].toString());
        }
        /*System.out.println(myLuggages[0].toString()); 
        System.out.println(myLuggages[1].toString()); 
        System.out.println(myLuggages[2].toString()); 
        System.out.println(myLuggages[3].toString()); 
        System.out.println(myLuggages[4].toString());*/ 
    }

    public static int getMAX_KILOS() {
        return MAX_KILOS;
    }

    public static int getMAX_COUNT() {
        return MAX_COUNT;
    }
    
}
