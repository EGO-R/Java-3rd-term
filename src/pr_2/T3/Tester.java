package pr_2.T3;
import java.util.Scanner;


import java.util.ArrayList;

public class Tester {
    public static ArrayList<Circle> circles = new ArrayList<Circle>();
    public static int amount = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x: ");
        double x = in.nextDouble();

        System.out.print("y: ");
        double y = in.nextDouble();

        System.out.print("radius: ");
        double radius = in.nextDouble();

        Circle circle = new Circle(x, y, radius);
        circles.add(circle);
        amount = circles.size();
        System.out.println(circle.toString());

    }
}
