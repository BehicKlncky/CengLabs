/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package games;

/**
 *
 * @author E.B.A.X. Company
 */
public class VideoGame extends Game{
    private int point;
    private int bonus;

    public VideoGame(int player_no, int time, String age_group,int point, int bonus) {
        super(player_no, time, age_group);
        this.point = point;
        this.bonus = bonus;
    }

    @Override
    public int calcScore() {
        return (time/2)*point+bonus;
    }
    
    @Override
    public String toString(){
        return "Video Game\nNumber of Players: " + player_no + "\n"+ "Time: "+ time + "\nAge Group: " + age_group + "\nPoint: " + point +"\nBonus: "+bonus+ "\nScore:" + calcScore()+"\n\n";
    }
    
    
}
