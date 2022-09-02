/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vacuumcleaner;


public class Main {
    public static void main(String[] args) {
        VacuumCleaner v1 = new VacuumCleaner();
        v1.displayAttributes();
        v1.setTemp(-90);
        v1.setSpeed(3);
        v1.displayAttributes();
        v1.controlTemp();
        v1.displayAttributes();
    }
}
