public class Order {
    //fields
    private final int orderID;
    private final int userID;
    private final int itemID;
    private boolean toLaunch;
    /**
     * 
     * @param orderID -ID of the order
     * @param userID - ID of user who ordered
     * @param itemID - ID of the item ordered
     * @param toLaunch - If the order is to be launched
     */
    public Order(int orderID, int userID, int itemID, boolean toLaunch){
        this.orderID = orderID;
        this.userID = userID;
        this.itemID = itemID;
        this.toLaunch = toLaunch;
    }

    /**
     * 
     * @return the order ID
     */
    public int getOrderID(){
        return this.orderID;
    }
    /**
     * 
     * @return the user ID
     */
    public int getUserID(){
        return this.userID;
    }
    /**
     * 
     * @return the item ID
     */
    public int getItemID(){
        return this.itemID;
    }
    /**
     * 
     * @return if the order is to be launched
     */
    public boolean getToLaunch(){
        return this.toLaunch;
    }

    /**
     * Overides tostring
     */
    public String toString(){
        String result;
        result = "" + this.orderID + "\t" + this.userID + "\t" + this.itemID + "\t" + this.toLaunch + "\n";
        return result;
    }
    
}
