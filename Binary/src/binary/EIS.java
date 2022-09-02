/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binary;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author E.B.A.X. Company
 */
public class EIS {
    private static ArrayList<Engineer> arr = new ArrayList();
    private static DataOutputStream dataoutput;

    public static ArrayList<Engineer> getArr() {
        return arr;
    }
    public static String displayAll(){
        String result= "";
        for(Engineer e : arr){
           result += e.toString();
         }  
        return result;
        
    }
    public static void readTxtFile() throws FileNotFoundException, IOException{
         Scanner sc2 = null;
         sc2 = new Scanner(new File("engineer.txt"));
         int linecounter=0;
       
    while (sc2.hasNextLine()) {
        Scanner s2 = new Scanner(sc2.nextLine());
        int wordcounter=0;  
        Engineer e = new Engineer("",0,"","",0,"");  
        while (s2.hasNext()) {
           String s = s2.next();
           
            switch (wordcounter) {
                case 0:
                    {
                       
                        e.setCompany(s);
                        break;
                    }
                case 1:
                    {
                        int intS = Integer.parseInt(s);
                        e.setId(intS);
                        break;
                    }
                case 2:
                    {
                        
                        e.setName(s);
                        break;
                    }
                case 3:
                    {
                        
                        e.setSurname(s);
                        break;  
                    }
                case 4:
                    {
                        double doubleS = Double.parseDouble(s);
                        e.setSalary(doubleS);
                        break;
                    }
                case 5:
                    {
                        
                        e.setArea(s);
                        break;
                    }
                default:
                    break;
            }
                
                
            
            
          System.out.println(s);
            wordcounter++;
        }
        arr.add(e);
        linecounter++;
    }
        
   }
    public static void writetoBin() throws FileNotFoundException, IOException {
        FileOutputStream fout = new FileOutputStream("binary.dat");
        DataOutputStream dout=new DataOutputStream(fout);
        Scanner sc2 = null;
    
        sc2 = new Scanner(new File("engineer.txt"));
    
    
    while (sc2.hasNextLine()) {
            Scanner s2 = new Scanner(sc2.nextLine());
        while (s2.hasNext()) {
            String s = s2.next();
            dout.writeUTF(s);
        }
        
    }}
    
    
}
