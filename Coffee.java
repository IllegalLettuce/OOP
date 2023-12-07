public class Coffee extends Item{
    private int sugarySpoons;
    private boolean milk;

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
