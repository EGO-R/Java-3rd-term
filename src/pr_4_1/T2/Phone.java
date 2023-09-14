package pr_4_1.T2;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(){}

    public String getNumber() {return number;}

    public void setNumber(String number) {this.number = number;}

    public String getModel() {return model;}

    public void setModel(String model) {this.model = model;}

    public int getWeight() {return weight;}

    public void setWeight(int weight) {this.weight = weight;}

    public void recieveCall(String name){
        System.out.println("Звонит " + name);
    }

    public void recieveCall(String name, String number){
        System.out.println("Звонит " + name);
    }

    public void sendMessage (String... nums){
        for (String num : nums)
            System.out.println(num);
    }
}
