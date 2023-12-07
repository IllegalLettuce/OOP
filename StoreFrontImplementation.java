
import java.util.ArrayList;


public final class StoreFrontImplementation implements StoreFront {
    
    private ArrayList<Item> itemsList;
    private ArrayList<Receipt> receiptsList;
    private static int nextID;

    public boolean purchaseItem(int userID, int itemID) {
        boolean result;
        int recieptID = StoreFrontImplementation.nextID;
        StoreFrontImplementation.nextID++;
        int itemIndex = Item.isInItemList(itemID, itemsList);
        
        if (itemIndex != -1){
            Receipt newReceipt = new Receipt(recieptID, userID, itemID);
            this.receiptsList.add(newReceipt);
            result = true;
        }
        else{
            result = false;
        }
        return result;

    }

    public boolean addNewCrowbar(int price, String name, int weight, String type){
        boolean result;
        int crowbarID = StoreFrontImplementation.nextID;
        StoreFrontImplementation.nextID++;
        Crowbar newCrowbar = new Crowbar(crowbarID, price, name, weight, type);
        this.itemsList.add(newCrowbar);
        result = true;
        return result;
    }

    public void viewItemInfo(int AgentID){
        int index = Item.isInItemList(AgentID, itemsList);

        if (index != -1){
            Item _item = this.itemsList.get(index);
            String itemInfo = _item.toString();
            System.out.println(itemInfo);
        }
        else{
            System.out.println("Item ID: " + AgentID + " not found in Item List");
        }
    }
   











}
    

