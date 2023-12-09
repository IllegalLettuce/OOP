/**
 * Class to model a Coffee
 */
public class Coffee extends Item{
    private final int sugarySpoons;
    private final boolean milk;
    /**
     * Creates new Coffee Object
     * @param AgentID - ID of Coffee
     * @param price - Price of Coffee in euros rounded to nearest Euro
     * @param name - Name of the Coffee
     * @param sugarySpoons - How many spoons of sugar in the Coffee
     * @param milk - IF the Coffee has milk
     */
    public Coffee(int AgentID, int price, String name, boolean milk, int sugarySpoons){
        super(AgentID, name, price);
        this.milk = milk;
        this.sugarySpoons = sugarySpoons;
    }
    /**
     * 
     * @return amount of sugary spoons in the coffee
     */
    public int getSugarySpoons(){
        return this.sugarySpoons;
    }

    /**
     * 
     * @return if the coffee has milk in it
     */
    public boolean getMilk(){
        return this.milk;
    }

    /**
     * Overides toString method
     */
    public String toString(){
        String result;
        result = "\t" + this.getID() + "\t" +
                    this.getName() + "\t" +
                    this.getPrice() + "\t" +
                    this.getMilk() + "\t" +
                    this.getSugarySpoons()+ "\t";
        return result;
    }
}
