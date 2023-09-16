package pr_4_1.T8;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2, "red", true);
        System.out.println(circle + " Area = " + circle.getArea());

        Square square = new Square(13, "blue", true);
        System.out.println(square + " Perimeter = " + square.getPerimeter());
    }
}
