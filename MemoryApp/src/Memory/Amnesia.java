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
public class Amnesia  extends MemoryDefict{
    private String amnesia_type;
    private String cause;
    private String location;
    ClinicalCase clin = new ClinicalCase("","","",0,"");
    private static int totalAmnesia=0;

    public Amnesia(String amnesia_type, String cause, String location, String deficitID, String memory_loss,String p_id, String p_name,String p_surname,int age,String gender) {
        super(deficitID, memory_loss);
        this.amnesia_type = amnesia_type;
        this.cause = cause;
        this.location = location;
        clin.setPatient_id(p_id);
        clin.setPatient_name(p_name);
        clin.setPatient_Surname(p_surname);
        clin.setAge(age);
        clin.setGender(gender);
        totalAmnesia++;
    }
    
    
    
    @Override
    public String toString(){
        return "Deficit ID: "+Amnesia.super.deficitID+"\n"+"Memory loss: "+Amnesia.super.memory_loss+"\n"+ clin.toString()+ "Amnesia Type: "+ amnesia_type+ "\n"+ "Cause: "+ cause +"\n" + "Location: "+ location+ "\n";    
        
    }

    public static int getTotalAmnesia() {
        return totalAmnesia;
    }
    
}
