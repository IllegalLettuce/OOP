//----------IMPORTS--------------
import java.util.ArrayList;
/**
 * Superclass
 */
public class Agent {

    //Fields, agentID is final to prevent it from being overwritten 
    private final int agentID;

    /**Constructor
     * Creates one instance of the Agent object
     * @param AgentID - the ID of the object 
     */
    public Agent(int agentID){
        this.agentID = agentID;
    }

    /**Get method
     * Returns the ID of the Agent 
     * @return The ID of the Agent
     */
    public final int getID(){
        return this.agentID;
    }

    /** Other Methods
     * @param other
     * @return if 'this' and 'other' is equal
     */
    public boolean equals(Agent other) {
        return this.agentID == other.agentID;
    }
}
