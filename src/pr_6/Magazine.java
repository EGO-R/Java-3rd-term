package pr_6;

public class Magazine implements Printable{
    private String name;
    private int cost;
    public Magazine(String Name, int Cost){
        name = Name;
        cost = Cost;
    }
    public void print(){
        System.out.println("Shop: " + name + " Cost: " + cost);
    }
}
