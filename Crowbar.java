public class Crowbar extends Item{
    private int weight;
    private String type;
    
    public Crowbar(int AgentID, int price, String name, int weight, String type){
        super(AgentID, price, name);
        this.weight = weight;
        this.type = type;
    }

    public int getWeight(){
        return this.weight;
    }

    public String getType(){
        return this.type;
    }
}
