package pr_2.T4;

public class Computer {
    private String name;
    public Computer(String name){this.name = name;}
    public Computer(){}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){return "Computer{name = " + name + "}";}
}
