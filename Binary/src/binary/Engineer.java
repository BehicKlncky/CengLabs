/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binary;

/**
 *
 * @author E.B.A.X. Company
 */
public class Engineer {
    private String company;
    private int id;
    private String name;
    private String surname;
    private double salary;
    private String area;

    public Engineer(String company, int id, String name, String surname, double salary, String area) {
        this.company = company;
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.area = area;
    }

    public String getCompany() {
        return company;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public String getArea() {
        return area;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    @Override 
    public String toString(){
        return "Company: "+company+"\nID: "+id+"\nName: "+name+"\nSurname: "+ surname+"\nSalary: "+salary + "\nArea: "+area;
    }
}
