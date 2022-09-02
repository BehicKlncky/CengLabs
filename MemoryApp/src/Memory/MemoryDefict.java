/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Memory;

/**
 *
 * @author Behic
 */
public abstract class MemoryDefict {
    protected String deficitID;
    protected String memory_loss;
    protected static int totalDeficit;

    public MemoryDefict(String deficitID, String memory_loss) {
        this.deficitID = deficitID;
        this.memory_loss = memory_loss;
        totalDeficit++;
    }
    
    @Override
    public String toString(){
       return deficitID + "\n" + memory_loss + "\n" + totalDeficit;  
    }

    public String getDeficitID() {
        return deficitID;
    }

    public static int getTotalDeficit() {
        return totalDeficit;
    }
        
    
}
