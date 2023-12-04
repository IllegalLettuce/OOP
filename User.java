public class User extends Agent{
    private final String name;
    private final String position;
    private boolean isValuedCustomer;

    /**
     * 
     * @param AgentID - ID of the customer
     * @param name - The name of the customer
     * @param position - The position of the customer (President, General, Mayor...)
     * @param isValuedCustomer - If the customer is valued.
     */
    public User(int AgentID, String name, String position, boolean isValuedCustomer){
        super(AgentID);
        this.name = name;
        this.position = position;
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
     * @return The position of the customer
     */
    public String getPosition(){
        return this.position;

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
