public class Delivery extends Item {
    //fields
    private final int range;

    /**
     * 
     * @param AgentID - The ID of the delivery platform
     * @param name - The name of the delivery platform
     * @param originCountry - The country of orgin of the delivery platform
     * @param activeService IF the delivery platform is in active service
     * @param price - The price of the delivery platform in USD
     * @param range - The range of the delivery platform in kilometres
     */
    public Delivery(int AgentID, String name, String originCountry, boolean activeService, int price, int range){
        super(AgentID, name, originCountry, activeService, price);
        this.range = range;
    }

    /**
     * 
     * @return the range of the delivery platform in Kilometres
     */
    public int getRange(){
        return this.range;
    }
    
    /**
     * Overides toString methods
     */
    public String toString(){
        String result;
        result = "" + this.getID() + "\t" +
                this.getName() + "\t" +
                this.getOrignCountry() + "\t" +
                this.getActiveService() + "\t" +
                this.getPrice() + "\t" +
                this.getRange() + "\t";
        return result;
    }
}
