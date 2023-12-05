public interface StoreFront {
    /**
     * Adds new user
     * @param name - the name of the user to be added
     * @return whether the user could be addded or not
     */
    int addUser(String name);

    /**
     * Removes user
     * @param AgentID - the ID of the user to be removed
     * @return 
     */
    int removeUser(int AgentID);

    int addNuke();

    int addLaunch();

    int removeItem(int AgentID);

    int sellNuke();

    int launchNuke();

    int viewStockLevels();

    int addvaluedCustomer();

    int removeValuedCustomer();

    boolean saveData();

    boolean loadData();

    

}
