package pr_2.T9;

public class Card {
    private String mast;
    private String value;
    public Card (String mast, String value) {
        this.mast = mast;
        this.value = value;
    }

    public void setMast(String mast) {this.mast = mast;}

    public String getMast() {return mast;}

    public void setValue(String value) {this.value = value;}

    public String getValue() {return value;}

    @Override
    public String toString(){
        return "{" + value + " " + mast + "}";
    }
}
