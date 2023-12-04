public abstract class Item extends Agent {
    //fields
    private final String name;
    private final String originCountry;
    private final boolean activeService;
    private final int price;

    /**
     * Creates one instance of the class Item
     * @param AgentID - the ID of the item.
     * @param name - the name of the item.
     * @param originCountry - the origin country of the item.
     * @param activeService - IF the item is in active service (yes == true, false == no).
     * @param price - the price of the item in USD.
     */
    public Item(int AgentID, String name, String originCountry, boolean activeService, int price){
        super(AgentID);
        this.name = name;
        this.originCountry = originCountry;
        this.activeService = activeService;
        this.price = price;
    }

    /**
     * 
     * @return The name of the Item.
     */
    public String getName(){
        return this.name;
    }
    /**
     * 
     * @return The origin country of the Item.
     */
    public String getOrignCountry(){
        return this.originCountry;
    }
    /**
     * 
     * @return if the Item is in active service.
     */
    public boolean getActiveService(){
        return this.activeService;
    }
    /**
     * 
     * @return the price of the Item in USD.
     */
    public int getPrice(){
        return this.price;
    }  
}
