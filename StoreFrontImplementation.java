//imports
import java.io.File;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;


public final class StoreFrontImplementation implements StoreFront {

    private final ArrayList<Item> itemsList;
    private final ArrayList<Receipt> receiptsList;
    private final ArrayList<User> usersList;
    private static int nextID = 1;

    public StoreFrontImplementation(){
        this.usersList = new ArrayList<User>();
        this.itemsList = new ArrayList<Item>();
        this.receiptsList = new ArrayList<Receipt>();
    }
    
    public boolean purchaseItem(int userID, int itemID) {
        boolean result = false;
        int recieptID = StoreFrontImplementation.nextID;
        StoreFrontImplementation.nextID++;

        int itemIndex = Item.isItemInList(itemID, itemsList);
        if (itemIndex == -1){
            System.out.println("No Item with ID: " + itemID );
        }
        int userIndex = User.isUserinList(userID, usersList);
        if (userIndex == -1){
            System.out.println("No user with ID: " + userID);
        }
        if ((itemIndex >= 0) && (userIndex >= 0)){
            Receipt newReceipt = new Receipt(recieptID, userID, itemID);
            this.receiptsList.add(newReceipt);
            result = true;
        }
        return result;
    }

    public boolean addNewCustomer(String name){
        boolean result;
        int userID = StoreFrontImplementation.nextID;
        StoreFrontImplementation.nextID++;
        User newUser = new User(userID, name);
        this.usersList.add(newUser);
        result = true;
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

    public boolean addNewCoffee(int price, String name, int sugarySpoons, boolean milk){
        boolean result;
        int coffeeID = StoreFrontImplementation.nextID;
        StoreFrontImplementation.nextID++;
        Coffee newCoffee = new Coffee(coffeeID, price, name, sugarySpoons, milk);
        this.itemsList.add(newCoffee);
        result = true;
        return result;
    }

    public void viewItemInfo(int AgentID){
        int index = Item.isItemInList(AgentID, itemsList);
        if (index != -1){
            Item _item = this.itemsList.get(index);
            String itemInfo = _item.toString();
            System.out.println(itemInfo);
        }
        else{
            System.out.println("Item ID: " + AgentID + " not found in Item List");
        }
    }

    public void viewSalesLog(){
        for (Receipt receipt : this.receiptsList){
            System.out.println(receipt.toString());
        }
    }

    public boolean saveToDisk(String receiptFileName, String itemFileName, String userFileName){
        boolean result = false;
        PrintWriter receiptsPrintWriter;
        PrintWriter itemPrintWriter;
        PrintWriter userPrintWriter;

        try {
            receiptsPrintWriter = new PrintWriter(receiptFileName, StandardCharsets.UTF_8);
            itemPrintWriter = new PrintWriter(itemFileName, StandardCharsets.UTF_8);
            userPrintWriter = new PrintWriter(userFileName, StandardCharsets.UTF_8);

            for (int index = 0; index < this.receiptsList.size(); index++){
                Receipt _receipt = this.receiptsList.get(index);
                String data = _receipt.toString();
                receiptsPrintWriter.print(data);
            }

            for (int index = 0; index < this.itemsList.size(); index++){
                Item _item = this.itemsList.get(index);
                String data = _item.toString();
                itemPrintWriter.print(data);
            }

            for (int index = 0; index < this.usersList.size(); index++){
                User _user = this.usersList.get(index);
                String data = _user.toString();
                userPrintWriter.print(data);
            }

            receiptsPrintWriter.close();
            itemPrintWriter.close();
            userPrintWriter.close();
            
            result = true;
        }
        catch (Exception e){
            System.out.println("Error when writing to file");
        }
        return result;
    }
    
   











}
    

