package pr_2.T2;
import java.util.Scanner;

public class TestBall {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("x: ");
        double x = in.nextDouble();

        System.out.print("y: ");
        double y = in.nextDouble();

        Ball ball = new Ball(x, y);
        System.out.println(ball.toString());

    }

}
