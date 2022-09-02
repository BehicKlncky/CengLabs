/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package games;

import java.util.ArrayList;

/**
 *
 * @author E.B.A.X. Company
 */
public class TestGame {
    public static void main(String[] args) {
    ArrayList<Object> a = new ArrayList();
    a.add(new VideoGame(2,10,"10-15",100,50));
    a.add(new WebCamGame(4,30,"20-30",200));
    
        System.out.println(a.get(0).toString()+a.get(1).toString());
    }
    
}
