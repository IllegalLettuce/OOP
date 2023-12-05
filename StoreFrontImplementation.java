//IMPORTS:
import java.util.ArrayList;



public final class StoreFrontImplementation implements StoreFront {
    private final ArrayList<User> usersList;
    private final ArrayList<Item> itemsList;
    private final ArrayList<Order> ordersList;
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
            User user = this.usersList.get(index);
            int orders = user.getOrders().size();
                if (orders == 0){
                    result = 0;
                    this.usersList.remove(index);
                }
                else{
                    result = -2;
                }
            }
        return result;
    }

    public int addNuke(String name, String originCountry, boolean activeService, int price, int yield, String type){
        int result = StoreFrontImplementation.nextID;
        Nuke newNuke = new Nuke(result, name, originCountry, activeService, price, yield, type);
        this.itemsList.add(newNuke);
        StoreFrontImplementation.nextID++;
        return result;
    }


    public int removeItem(int AgentID){

    }




}//end of full class
    

