/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeapp;

import java.util.ArrayList;


/**
 *
 * @author E.B.A.X. Company
 */
public class Emp {
    public static ArrayList<Employee> empinfo= new ArrayList();;
    public static Employee getArrayList(int id){
        for(Employee e : empinfo){
            if(e.getId()==id){
                return e;
            }
        }
        Employee e = null;
        return e;
    }
    /*public static void setArrayList(){
        //Dont have to use this method according to empinfo Arraylist is public...
    }*/
    public static boolean checkEntry(int id){
        if (empinfo.stream().anyMatch(e -> (e.getId()==id))) {
            return true;
        }
        
        
        return false;
    }
    
}
