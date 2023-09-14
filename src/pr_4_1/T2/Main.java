package pr_4_1.T2;

public class Main {
    public static void main(String[] args) {
        Phone p1 = new Phone("1", "a", 5);
        Phone p2 = new Phone("2", "b", 5);
        Phone p3 = new Phone("3", "c", 5);

        System.out.println(p1.getModel() + " " + p1.getNumber() + " " + p1.getWeight());
        System.out.println(p2.getModel() + " " + p2.getNumber() + " " + p2.getWeight());
        System.out.println(p3.getModel() + " " + p3.getNumber() + " " + p3.getWeight());

        p1.recieveCall("Me", "1");
    }
}
