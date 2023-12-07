import java.util.ArrayList;
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

    public int getReceiptID(){
        return this.recieptID;
    }

    public int getUserID(){
        return this.userID;
    }

    public int getItemID(){
        return this.itemID;
    }

    




}
