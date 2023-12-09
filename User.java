import java.util.ArrayList;
/**
 * Models a customer
 */
public class User extends Agent{
    private String name;

    User(int AgentID, String name){
        super(AgentID);
        this.name = name;
    }
    
    /**
     * 
     * @return Name of customer
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * Checks to see if the user is in the list
     * @param userID - ID of user
     * @param list - List to check
     * @return index found otherise (-1)
     */
    public static int isUserinList(int userID, ArrayList<User> list){
        int result = -1;
        Agent newAgent = new Agent(userID);
        int listSize = list.size();
        int index = 0;
        while ((result == -1) && (index < listSize)){
            if (newAgent.equals(list.get(index))){
                result = index;
            }
            else{
                index++;
            }
        }
        return result;
    }

    /**
     * Overides toString
     */
    public String toString(){
        String result;
        result = "" + getName() + "\t" + getID();
        return result;
    }
}
