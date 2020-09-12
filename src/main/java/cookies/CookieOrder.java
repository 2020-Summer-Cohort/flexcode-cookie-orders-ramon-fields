package cookies;

public class CookieOrder {
    //Fields
    private int numBoxes;
    private String variety;
    //Constructor
    public CookieOrder(String localVariety, int localNumBoxes) {
        this.numBoxes = localNumBoxes;
        this.variety = localVariety;
    }
    //Accessors
    public int getNumBoxes() {
        return this.numBoxes;
    }
    public String getVariety() {
        return this.variety;
    }
}
