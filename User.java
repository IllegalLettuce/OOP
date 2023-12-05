import java.util.ArrayList;

public class User extends Agent{
    private final String name;
    private boolean isValuedCustomer;
    private final ArrayList<Order> activeOrders;

    /**
     * @param AgentID - ID of the customer
     * @param name - The name of the customer
     * @param isValuedCustomer - If the customer is valued.
     */
    public User(int AgentID, String name, boolean isValuedCustomer){
        super(AgentID);
        this.name = name;

        //new customer cannot be valued
        this.isValuedCustomer = false;
        this.activeOrders = new ArrayList<Order>();
    }
    /**
     * @return Name of the customer
     */
    public String getName(){
        return this.name;
    }

    /**
     * @return If the customer is valued
     */
    public boolean getIsValuedCustomer(){
        return this.isValuedCustomer;
    }
    /**
     * Sets if the customer is valued or not
     * @param isValuedCustomer
     */
    public void setIsValuedCustomer(boolean isValuedCustomer){
        this.isValuedCustomer = isValuedCustomer;
    }

    /**
     * Checks to see if the user is in the user list.
     * Core concept taken from example application
     * @param userID - Id of the user to check
     * @param userList - List of users
     * @return - the index of the user in the list, or (-1) if not found
     */
    public static int inUsersList(int userID, ArrayList<User> userList){
        int result = -1;
        Agent user = new Agent(userID);
        int listSize = userList.size();
        int index = 0;

        while ((result == -1) && (index < listSize)){
            if (user.equals(userList.get(index))){
                result = index;
            }
            else{
                index++;
            }
        }
        return result;
    }
}
