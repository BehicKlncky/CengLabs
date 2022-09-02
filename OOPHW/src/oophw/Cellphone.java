/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oophw;

/**
 *
 * @author E.B.A.X. Company
 * 
 */
public class Cellphone extends Electronics{

    private String operator;
    public Cellphone(int ID, String brand, String type, double price, String operator) {
        super(ID, brand, type, price);
        this.operator = operator;
    }
    
     public String findPromotion(){
        if(operator.equals("Turkcell")){
            return "It is free in the mornings.";
        }
        if(operator.equals("Vodafone")){
            return "It is free at 11PM till 4AM.";
        }
        if(operator.equals("TTelekom")){
            return "No promotion.";
        }
        return null;
    }

    public String getOperator() {
        return operator;
    }
    @Override
     public String toString(){
        return "Brand "+brand+"\n"+"ID "+ ID+"\n"+ "price "+ price+"\n"+"type "+type+"\n"+"Operator "+operator+"\n";
    }
    
}
