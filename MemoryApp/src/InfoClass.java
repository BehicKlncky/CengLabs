/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Behic
 */
import Memory.*;
import java.util.ArrayList;
public class InfoClass {
   public static ArrayList<MemoryDefict> memoryArrayList = new ArrayList();
   public static void addMemory(MemoryDefict def){
       memoryArrayList.add(def);
   }
   public static String getAllMemory(){
       StringBuilder sb = new StringBuilder();
       
       for(MemoryDefict mem : memoryArrayList){
           sb.append( mem.toString() ).append("\n");
          
       }
       return sb.toString();
   }
   public static String getAmnesia(){
      StringBuilder sb = new StringBuilder();
        for ( MemoryDefict mem : memoryArrayList ){
            if ( mem instanceof Amnesia )
                sb.append( mem.toString() ).append("\n");
        }
        return sb.toString();  
       
    
   }
   public static String getAlzheimer(){
        StringBuilder sb = new StringBuilder();
        for ( MemoryDefict mem : memoryArrayList ){
            if ( mem instanceof Alzheimer )
                sb.append( mem.toString() ).append("\n");
        }
        return sb.toString();
   }
 
    public static MemoryDefict searchMemory(String id){
        MemoryDefict result = null; 
        for(MemoryDefict mem : memoryArrayList){
            if(mem.getDeficitID().equals(id) ){
                 result=mem;
            } 
        }
        
        return result;
   }
  
    public static String showTotalMemory(){
    return ("Total Desificits: " + MemoryDefict.getTotalDeficit()+"\n"+"Total Amnestics: "+Amnesia.getTotalAmnesia() + "\n"+"Total Alzheimers: " + Alzheimer.getTotalAlzheimer());
   }
   
   /*public static String showImprovement(){
       
   }*/
}
