/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package luggage;

import java.util.Scanner;

/**
 *
 * @author Behic
 */
public class Cargo {

    
    
    
    
    public static void main(String[] args) {
        int lug_ID=0;
        String belonTo;
        int kilo; 
        double cap_lt; 
        int lastUsd_ID=500; 
        String volume;
    Scanner scan= new Scanner(System.in);
    int i=0;  
    
        Luggage l1 = new Luggage(" ",0,0.0); 
        Luggage l2 = new Luggage(" ",0,0.0);
        Luggage l3 = new Luggage(" ",0,0.0);
        Luggage l4 = new Luggage(" ",0,0.0);
        Luggage l5 = new Luggage(" ",0,0.0);
        Luggage[] L= new Luggage[5];
        L[0]=l1;
        L[1]=l2;
        L[2]=l3;
        L[3]=l4;
        L[4]=l5;
        LuggageList l_List=new LuggageList();   
       
      do{
        if(l_List.total_LuggageCount==5){
            break;
        }   
        
        System.out.println("Luggage no: "+(++lug_ID));
        System.out.printf("Belongs to: ");
        belonTo=scan.next();
        System.out.println("Enter weight in kilos: ");
        kilo=scan.nextInt();
        System.out.println("Enter capacity like Width:Height:Length");
        volume=scan.next();
        cap_lt=capacityCalculator(volume);
        L[i].setBelongsTo(belonTo);
        L[i].setCapacity_lt(cap_lt);
        L[i].setWeight_kilo(kilo);
        
        
          
      }while(l_List.addLuggage(L[i++])==true);
       
        System.out.println("-----------------");
        System.out.println("Here is a list of the luggages (using toString() method of list object)...");
        l_List.display();
        System.out.println("-----------------");
        System.out.println("Which Lauggage would you like to delete?\nEnter an ID: ");
        String ID;
        ID=scan.next();
        l_List.removeLuggage(ID);
        
        l_List.display();
        System.out.println("-----------------");
        System.out.println("Whose Luggage would you like to search?");
        String str = scan.next();
        System.out.println("Here is the Luggage you were looking for...\n"+"ID: "+l_List.getLuggage(str).getLuggage_ID()+"\nBelongs to: "+l_List.getLuggage(str).getBelongsTo()+"\nWeight of the lagguage: " + l_List.getLuggage(str).getWeight_kilo()+"\nCapacity of the Lagguage: "+l_List.getLuggage(str).getCapacity_lt()+" Liters");
        System.out.println("-----------------");
        System.out.println("The luggage belonging to: "+l_List.getHighestCapacityLuggage().getBelongsTo()+ " has the highest capacity of "+ l_List.getHighestCapacityLuggage().getCapacity_lt()+" Liters");
    }
    private static double capacityCalculator(String vol){
       
        String[] ar_str = vol.split(":",5);
        double a=Double.parseDouble(ar_str[0]);
        double b=Double.parseDouble(ar_str[1]);
        double c=Double.parseDouble(ar_str[2]);
        return(a*b*c)/1000;
        
        
    }
}
