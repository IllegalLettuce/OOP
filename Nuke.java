public class Nuke extends Item {
    //fields
    private final int yield;
    private final String type;


    /**
     * @param AgentID - ID of the Nuke.
     * @param name - Name of the Nuke.
     * @param originCountry - Orgin country of the Nuke.
     * @param activeService - If the Nuke is in active service
     * @param price - Price of the Nuke in USD
     * @param yield - Yield of the nuke in kilotons
     * @param type - The type of Nuke 
     */
    public Nuke(int AgentID, String name, String originCountry, boolean activeService, int price, int yield, String type){
        super(AgentID, name, originCountry, activeService, price);
        this.yield = yield;
        this.type = type;
    };
    
    /**
     * 
     * @return the yield of the Nuke
     */
    public int getYield(){
        return this.yield;
    }

    /**
     * 
     * @return  the type of the Nuke.
     */
    public String getType(){
        return this.type;
    }

    /**
     * Overides toString() method
     */
    public String toString(){
        String result;
        result = "" + this.getID() + "\t" +
                this.getName() + "\t" +
                this.getOrignCountry() + "\t" +
                this.getActiveService() + "\t" +
                this.getPrice() + "\t" +
                this.getYield() + "\t" +
                this.getType() + "\t";

        return result;
    }
}
