package pr_6.T10;
import java.util.ArrayList;
import java.util.Objects;


public class Shop {
    private final ArrayList<Computer> computers = new ArrayList<>();

    public void AddComputer(String name) {
        if (FindInSystem(name) != null)
            computers.add(Computer.valueOf(name));
    }

    public void DelComputer(String name) {
        Computer Temp = FindComputer(name);
        if (Temp != null)
            computers.remove(Temp);
    }


    public Computer FindComputer(String name) {
        for (Computer computer : computers){
            if (Objects.equals(name, computer.toString()))
                return computer;
        }
        return null;
    }
    public Computer FindInSystem(String name) {
        for (Computer computer : Computer.values()){
            if (Objects.equals(name, computer.toString()))
                return computer;
        }
        return null;
    }
    public void ShopOut(){
        for (Computer computer : computers){
            System.out.println(computer.Information());
        }
    }
}
