import java.util.ArrayList;
/**
 * Models an item
 */
public abstract class Item extends Agent {
    private String name;
    private int price;
    public Item(int AgentID, String name, int price){
        super(AgentID);
        this.price = price;
        this.name = name;
    }

    /**
     * 
     * @return price of Item
     */
    public int getPrice(){
        return this.price;
    }

    /**
     * 
     * @return name of Item
     */
    public String getName(){
        return this.name;
    }

    /**
     * Overidse tostring
     */
    public String toString(){
        String result = "";
        result = "\t" + this.getID() + "\t" +
                    this.getName() + "\t" +
                    this.getPrice() + "\t";
        return result;
    }
    /**
     * Attempts to find item in the list - core concept take from example application
     * @param itemID - ID of the item
     * @param list - the list to search
     * @return - Index of found item or (-1) if not found
     */
    public static int isItemInList(int itemID, ArrayList<Item> list){
        int result = -1;
        Agent newAgent = new Agent(itemID);
        int listSize = list.size();
        int index = 0;
        while ((result == -1) && (index < listSize)){
            if (newAgent.equals(list.get(index))){
                result = index;
            }
            else{
                index++;
            }
        }
        return result;
    }
}
