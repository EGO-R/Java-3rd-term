package pr_2.T4;

public class Shop implements ShopMethods {
    public static void main(String[] args) {

    }
}

interface ShopMethods{
    public static void add_computer(String name){}
    public static void delete_computer(String name){}
    public static Computer find_computer(String name){return new Computer();}
}
