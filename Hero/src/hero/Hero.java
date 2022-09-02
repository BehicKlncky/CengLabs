/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hero;

/**
 *
 * @author E.B.A.X. Company
 */
public class Hero extends ActionCharachter implements CanFly,CanSwim{

    @Override
    public void fight() {
        System.out.println("My hero fights as Donald Duck");; //To change body of generated methods, choose Tools | Templates.
    }

   
    
    @Override
    public void swim(){
        System.out.println("My hero swims so cool");
    }

    @Override
    public void fly() {
        System.out.println("My hero can fly");
    }
            
    
    
    
}
