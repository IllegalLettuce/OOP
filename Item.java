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
    
}
