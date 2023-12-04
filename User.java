public class User extends Agent{
    private final String name;
    private boolean isValuedCustomer;

    /**
     * 
     * @param AgentID - ID of the customer
     * @param name - The name of the customer
     * @param isValuedCustomer - If the customer is valued.
     */
    public User(int AgentID, String name, boolean isValuedCustomer){
        super(AgentID);
        this.name = name;

        //new customer cannot be valued
        this.isValuedCustomer = false;
    }
    /**
     * 
     * @return Name of the customer
     */
    public String getName(){
        return this.name;
    }

    /**
     * 
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

}
