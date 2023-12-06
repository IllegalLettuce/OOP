//custom Nuke - differnet price and custome yield
public final class ArtisanalNuke extends Nuke {
    private int size;
    private String colour;

    ArtisanalNuke(int AgentID, String name, int yield, int price, int size, String colour){
        super(AgentID, name, yield, price);
        this.size = size;
        this.colour = colour;
    }

    public int getSize(){
        return this.size;
    }

    public String getColour(){
        return this.colour;
    }
          
}
