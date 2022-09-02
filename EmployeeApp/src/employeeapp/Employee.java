/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employeeapp;

/**
 *
 * @author E.B.A.X. Company
 */
public class Employee {
    private int id;
    private String name;
    private double hours_worked;

    public Employee(int id, String name, double hours_worked) {
        this.id = id;
        this.name = name;
        this.hours_worked = hours_worked;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getHours_worked() {
        return hours_worked;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHours_worked(double hours_worked) {
        this.hours_worked = hours_worked;
    }
    @Override
    public String toString(){
        return "ID: "+ id + "Name " + name + "Hours Worked: " + hours_worked;
    }
    
    
}
