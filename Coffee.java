public class Coffee extends Item{
    private int sugarySpoons;
    private boolean milk;
    /**
     * Creates new Coffee Object
     * @param AgentID - ID of Coffee
     * @param price - Price of Coffee in euros rounded to nearest Euro
     * @param name - Name of the Coffee
     * @param sugarySpoons - How many spoons of sugar in the Coffee
     * @param milk - IF the Coffee has milk
     */
    public Coffee(int AgentID, int price, String name, int sugarySpoons, boolean milk){
        super(AgentID, price, name);
        this.milk = milk;
        this.sugarySpoons = sugarySpoons;
    }
    
    public int getSugarySpoons(){
        return this.sugarySpoons;
    }

    public boolean getMilk(){
        return this.milk;
    }

    public String toString(){
        String result;
        result = "" + this.getID() + "\t" +
                    this.getName() + "\t" +
                    this.getPrice() + "\t" +
                    this.getMilk() + "\t" +
                    this.getSugarySpoons()+ "\t";
        return result;
    }
}
