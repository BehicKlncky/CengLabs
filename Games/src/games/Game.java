/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package games;

/**
 *
 * @author E.B.A.X. Company
 */
public abstract class Game {
    protected int player_no;
    protected int time;
    protected String age_group;

    public Game(int player_no, int time, String age_group) {
        this.player_no = player_no;
        this.time = time;
        this.age_group = age_group;
    }
    
    
    public abstract int calcScore();
    
    @Override
    public String toString(){
        return player_no+ " " + time + " " + age_group + "\n";
    }
    
    
    
    
}
