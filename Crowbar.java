public class Crowbar extends Item{
    private int weight;
    private String type;
    
    /**
     * Creates a new Crowbar Object
     * @param AgentID - ID of the Crowbar
     * @param price - Price of the Crowbar in euros, rounded to nearest euro
     * @param name - Name of the Crowbar
     * @param weight - Weight of Crowbar in grams
     * @param type - Type of Crowbar
     */
    public Crowbar(int AgentID, int price, String name, int weight, String type){
        super(AgentID, price, name);
        this.weight = weight;
        this.type = type;
    }
    /**
     * Get weight of Crowbar
     * @return Weight of Crowbar in Grams
     */
    public int getWeight(){
        return this.weight;
    }

    /**
     * Get type of Crowbar
     * @return type of Crowbar
     */
    public String getType(){
        return this.type;
    }
}
