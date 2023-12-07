import java.util.ArrayList;

public class User extends Agent{
    private String name;

    User(int AgentID, String name){
        super(AgentID);
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
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
}
