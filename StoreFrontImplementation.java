//IMPORTS:
import java.util.ArrayList;



public final class StoreFrontImplementation implements StoreFront {
    private final ArrayList<User> usersList;
    private final ArrayList<Item> itemsList;

    private static int nextID;


    public StoreFrontImplementation(){
        this.usersList = new ArrayList<User>();
        this.itemsList = new ArrayList<Item>();
    }


    public int addUser(String name){
        int result = StoreFrontImplementation.nextID;

        User newUser = new User(result, name, false);

        this.usersList.add(newUser);

        StoreFrontImplementation.nextID++;

        return result;
    }


    public int removeUser(int AgentID){
        int result = -1;

        int index = User.inUsersList(AgentID, usersList);
        
        if (index != -1){
            
        }




        return result;
    }
    
}
