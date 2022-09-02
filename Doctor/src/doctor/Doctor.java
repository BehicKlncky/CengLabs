/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doctor;

import java.io.Serializable;

/**
 *
 * @author E.B.A.X. Company
 */
public class Doctor implements Serializable{
    private String ID;
    private String name;
    private String surname;
    private String department;

    public Doctor(String ID, String name, String surname, String department) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.department = department;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDepartment() {
        return department;
    }
     @Override
     public String toString(){
         return "Doctor[\ndoctor_id: "+ID+"\ndoctor_name: "+name+"\ndoctor_sur: "+surname+"\ndepartment: "+department+"]\n";
     }
  
   
    
}
