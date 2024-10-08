public interface StoreFront {
    /**
     * Purchases Item
     * @param userID - ID of user
     * @param itemID - ID of item
     * @return if item has been purchased
     */
    boolean purchaseItem(int userID, int itemID);
    /**
     * Adds new customer/user
     * @param name - name of user
     * @return id of new customer 
     */
    int addNewCustomer(String name);
    /**
     * Adds new Crowbar to items list
     * @param price - price of crowbar in Euro
     * @param name  - Name of crowbar
     * @param weight - weight of crowbar in kilograms
     * @param type - type of crowbar
     * @return - If succesfully added
     */
    boolean addNewCrowbar(int price, String name, int weight, String type);

    /**
     * Adds new Coffee to items list
     * @param price - price of the coffee
     * @param name - name of the coffee
     * @param sugarySpoons - amount of sugars in coffee
     * @param milk - with or without milk
     * @return - IF succesfully added
     */
    boolean addNewCoffee(int price, String name, int sugarySpoons, boolean milk);

    /**
     * Attempts to print the Item info to screen
     * @param AgentID - ID of the item
     */
    void viewItemInfo(int AgentID);

    /**
     * Attempts to print the information in the receipts list
     */
    void viewSalesLog();

    /**
     * Attempts to print the product list
     * @return amount of products
     */
    public int viewProductList();

    /**
     * Loads data from disk
     * @param receiptFileName - file path for receipts
     * @param itemFileName - file path for item
     * @param userFileName - file path for users
     * @return if succesfull
     */
    boolean loadFromDisk(String receiptFileName, String itemFileName, String userFileName );

    /**
     * Save data to disk
     * @param receiptFileName - file path for receipts
     * @param itemFileName - file path for item
     * @param userFileName - file path for users
     * @return if succesfull
     */
    boolean saveToDisk(String receiptFileName, String itemFileName, String userFileName);
}
