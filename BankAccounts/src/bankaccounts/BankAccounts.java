/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankaccounts;
import java.util.Scanner;
/**
 *
 * @author E.B.A.X. COMPANY
 */
public class BankAccounts {
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Please enter your account no and money...");
       Customers c1 = new Customers(scan.nextInt(),scan.nextInt()); 
       System.out.println("Enter the value that you want to deposit...");
       c1.deposit(scan.nextInt());
       System.out.println("Enter the value that you want to withdraw...");
       c1.withdraw(scan.nextInt());
        System.out.println("C1's process done!");
        
        
       System.out.println("Please enter your account no and money...");
       Customers c2 = new Customers(scan.nextInt(),scan.nextInt()); 
       System.out.println("Enter the value that you want to deposit...");
       c2.deposit(scan.nextInt());
       System.out.println("Enter the value that you want to withdraw...");
       c2.withdraw(scan.nextInt());
       System.out.println("C2's process done!");
       
       
       if(Customers.compare(c1, c2)==0){
           System.out.println("C1 have much money rather than C2...");
           
       }
       else if(Customers.compare(c1, c2)==1){
           System.out.println("C2 have much money rather than C1...");
           
       }
       else{
           System.out.println("They are same...");
       }
       
       Customers.displayInfos();
    }
    
}
