

public class User extends Agent{
    private String name;

    User(int AgentID, String name){
        super(AgentID);
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
}
