public interface StoreFront {

    /**
     * Purchases Item
     * @param userID - ID of user
     * @param itemID - ID of item
     * @return if item has been purchased
     */
    boolean purchaseItem(int userID, int itemID);

    /**
     * Adds new Crowbar to items list
     * @param AgentID - ID of crowbar
     * @param price - price of crowbar in Euro
     * @param name  - Name of crowbar
     * @param weight - weight of crowbar in kilograms
     * @param type - type of crowbar
     * @return - If succesfully added
     */
    boolean addNewCrowbar(int price, String name, int weight, String type);


    void viewItemInfo(int AgentID);

}
