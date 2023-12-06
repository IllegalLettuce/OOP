import java.util.ArrayList;

public class Order {
    //fields
    private final int orderID;
    private final int userID;
    private final int itemID;
    /**
     * 
     * @param orderID -ID of the order
     * @param userID - ID of user who ordered
     * @param itemID - ID of the item ordered
     */
    public Order(int orderID, int userID, int itemID){
        this.orderID = orderID;
        this.userID = userID;
        this.itemID = itemID;
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
     * @param orderID - ID of the order to check
     * @param orderList - List of orders
     * @return the index of the order in the list, or (-1) if not found
     */
    // public static int inOrdersList(int itemID, ArrayList<Order> orderList){
    //     int result = -1;
    //     Agent item = new Agent(itemID);
    //     int listSize = orderList.size();
    //     int index = 0;

    //     while ((result == -1) && (index < listSize)){
    //         if (item.equals(orderList.get(index))){
    //             result = index;
    //         }
    //         else{
    //             index++;
    //         }
    //     }
    //     return result;
    // }


    /**
     * Overides tostring
     */
    public String toString(){
        String result;
        result = "" + this.orderID + "\t" + this.userID + "\t" + this.itemID + "\n";
        return result;
    }
    
}
