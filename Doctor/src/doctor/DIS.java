/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doctor;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author E.B.A.X. Company
 */
public class DIS {
    public static ArrayList<Doctor> doctors = new ArrayList();
    
    
    public static void addToArrayList(Doctor d){
        doctors.add(d);
    }
    private static ObjectOutputStream objo;
    public static void writeTheArrayListtoBin(){
        try
        {
            objo = new ObjectOutputStream(new FileOutputStream("Doctor_bin"));
        }
        catch (IOException e)
        {
            System.err.println("Fiile Error!!");
        }
        
        
       
        try {
            //serileştirme işlemini başlat
            objo.writeObject(doctors);
        } catch (IOException ex) {
            Logger.getLogger(DIS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    } 
    
    private static  ObjectInputStream obji; 
    
    public static Object displayBin(){
      try
        {
             obji = new ObjectInputStream(new FileInputStream("Doctor_bin"));
        }
        catch (IOException e)
        {
            System.err.println("File Error!!");
        }
        Doctor d;
        try {
            ArrayList<Doctor> stemp = (ArrayList<Doctor>) (obji.readObject());
            return stemp;
        } catch (IOException ex) {
            Logger.getLogger(DIS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DIS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Error!";
    }
    
    
    }
    

