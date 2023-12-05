public interface StoreFront {
    /**
     * Adds new User
     * @param name - the name of the user to be added
     * @return whether the user could be addded or not
     */
    int addUser(String name);

    /**
     * Removes User
     * @param AgentID - the ID of the user to be removed
     * @return 
     */
    int removeUser(int AgentID);

    /**
     * Adds a new nuclear warhead to the item list
     * @param name - Name of the warhead
     * @param originCountry - Country of Orign of the warhead
     * @param activeService - If the warhead is in active service
     * @param price - The price of the warhead in USD
     * @param yield - The yield of the warhead in Kilotons
     * @param type - The type of the warhead
     * @return the ID of the new warhead
     */
    int addNuke(String name, String originCountry, boolean activeService, int price, int yield, String type);

    /**
     * Adds new delivery system to the item list
     * @param name - Name of the delivery system
     * @param originCountry - Country of Origin of the warhead
     * @param activeService - If the delivery system is in active service
     * @param price - Price of the delivery system in USD
     * @param range - Range of the delivery system in Kilometres
     * @return - The ID of the new delivery system
     */
    int addLaunch(String name, String originCountry, boolean activeService, int price, int range);

    int removeItem(int AgentID);

    int sellNuke();

    int launchNuke();

    int viewStockLevels();

    int addvaluedCustomer();

    int removeValuedCustomer();

    boolean saveData();

    boolean loadData();

    

}
