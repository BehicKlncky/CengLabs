/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package games;

/**
 *
 * @author E.B.A.X. Company
 */
public class WebCamGame extends Game{
    private final int point;

    public WebCamGame( int player_no, int time, String age_group,int point) {
        super(player_no, time, age_group);
        this.point = point;
    }
    
    @Override
    public String toString(){
        return "WebCam Game\nNumber of Players: " + player_no + "\n"+ "Time: "+ time + "\nAge Group: " + age_group + "\nPoint: " + point + "\nScore:" + calcScore()+"\n\n";
    }
    
    
    
    @Override
    public int calcScore() {
      return (time/2)*point; 
    }
    
}
