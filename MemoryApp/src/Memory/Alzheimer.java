/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Memory;

/**
 *
 * @author Behic
 */
import ClinicalCase.ClinicalCase;
public class Alzheimer extends MemoryDefict{
    private String declining_area;
    private static int totalAlzheimer=0;
    ClinicalCase clin = new ClinicalCase("","","",0,"");
    public Alzheimer(String declining_area, String deficitID, String memory_loss, String p_id, String p_name,String p_surname,int age,String gender) {
        super(deficitID, memory_loss);
        this.declining_area = declining_area;
        clin.setPatient_id(p_id);
        clin.setPatient_name(p_name);
        clin.setPatient_Surname(p_surname);
        clin.setAge(age);
        clin.setGender(gender);
        totalAlzheimer++;
    }
    
    
    @Override
    public String toString(){
        return "Deficit ID: "+Alzheimer.super.deficitID+"\n"+"Memory loss: "+Alzheimer.super.memory_loss+"\n"+ clin.toString()+ "Declining Area: "+declining_area + "\n"  ;
    }

    public static int getTotalAlzheimer() {
        return totalAlzheimer;
    }

   
    
}
