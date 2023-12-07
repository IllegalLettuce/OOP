import java.util.ArrayList;
public class Item extends Agent {
    private String name;
    private int price;
    public Item(int AgentID,int price, String name){
        super(AgentID);
        this.price = price;
        this.name = name;
    }

    public int getPrice(){
        return this.price;
    }

    public String getName(){
        return this.name;
    }
    /**
     * Attempts to find item in the list - core concept take from example application
     * @param itemID - ID of the item
     * @param list - the list to search
     * @return - Index of found item or (-1) if not found
     */
    public static int isInItemList(int itemID, ArrayList<Item> list){
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
