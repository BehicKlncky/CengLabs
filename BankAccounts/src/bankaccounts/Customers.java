/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankaccounts;
import java.util.Scanner;
/**
 *
 * @author E.B.A.X. COMPANY
 */
public class Customers {
    private int accountNo;
    private int money;
    private static int allMoney=0;
    private static int numOfAccounts=0;
    private static int numOfDeposit=0;
    private static int numOfWithdraw=0;
    
    
    Customers(int accountNo, int money){
        this.accountNo=accountNo;
        this.money=money;
        numOfAccounts++;
        
    }
    
    public void deposit(int money){
        this.money+=money; 
        allMoney+=money;
        numOfDeposit++;
    }
    
    public void withdraw(int money){
        Scanner sc = new Scanner(System.in);
        
        
        while(this.money<money){
            System.out.println("Invalid value!!");
            money = sc.nextInt();
        }
        allMoney-=money;
        numOfWithdraw++;
        this.money-=money;
    }
    
    public static int compare(Customers c1, Customers c2){
        if(c1.money>c2.money){
          return 0;  
        }    
        else if(c1.money<c2.money){
          return 1;
        }
        else{
            return 2;
        }
    }
    
    public static void displayInfos(){
    System.out.println("Also number of deposit, withdraw , accounts and all money values are: " + numOfDeposit + " "+ numOfWithdraw+" " + numOfAccounts+ " " + allMoney );
    }
    
}
