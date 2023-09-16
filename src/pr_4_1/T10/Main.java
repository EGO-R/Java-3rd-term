package pr_4_1.T10;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(10, 60);
        System.out.println(car + "\nPrice for 10km = " + car.computePrice(10, 0) +
                "\nTime for 10km = " + car.computeTime(10, true) + "\n");

        Plane plane = new Plane(100, 1000, 350);
        System.out.println(plane + "\nPrice for 1000km = " + plane.computePrice(1000, 5) +
                "\nTime for 1000km = " + plane.computeTime(1000, true));
    }
}
