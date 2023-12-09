/**
 * Models receipt class
 */
public class Receipt {
    private int recieptID;
    private int userID;
    private int itemID;
    /**
     * 
     * @param recieptID - recieptID
     * @param userID - ID of customer
     * @param itemID - ID of item
     */
    public Receipt(int recieptID, int userID, int itemID){
        this.itemID = itemID;
        this.userID = userID;
        this.recieptID = recieptID;
    }

    /**
     * 
     * @return receipt ID
     */
    public int getReceiptID(){
        return this.recieptID;
    }

    /**
     * 
     * @return user ID
     */
    public int getUserID(){
        return this.userID;
    }

    /**
     * 
     * @return Item ID
     */
    public int getItemID(){
        return this.itemID;
    }

    /**
     * Overides to string methods
     */
    public String toString(){
        String result;
        result = "\t" + getReceiptID() + "\t" +
                        getUserID() + "\t" + 
                        getItemID()+ "\t";
        return result;
    }

}
