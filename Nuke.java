//Nuke

public class Nuke extends Agent {
    private String name;
    private int yield;
    private int price;

    Nuke(int AgentID, String name, int yield, int price){
        super(AgentID);
        this.name = name;
        this.yield = yield;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public int getYield(){
        return this.yield;
    }

    public int getPrice(){
        return this.price;
    }
    
}
