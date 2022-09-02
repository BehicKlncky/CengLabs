/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClinicalCase;

/**
 *
 * @author Behic
 */
public class ClinicalCase {
    private String patient_id;
    private String patient_name;
    private String patient_Surname;
    private int age;
    private String gender;

    public ClinicalCase(String patient_id, String patient_name, String patient_Surname, int age, String gender) {
        this.patient_id = patient_id;
        this.patient_name = patient_name;
        this.patient_Surname = patient_Surname;
        this.age = age;
        this.gender = gender;
    }
    @Override
    public String toString(){
       return   "Patient ID: " + patient_id + "\n" + "Patient name: "+patient_name + "\n" + "Patient Surname: " + patient_Surname + "\n" + "Age: "+age + "\n" + "Gender: " + gender+"\n";  
    }

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public void setPatient_Surname(String patient_Surname) {
        this.patient_Surname = patient_Surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
}
