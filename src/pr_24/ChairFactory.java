package pr_24;

import java.util.Scanner;

public class ChairFactory implements AbstractChairFactory {
    private Scanner scanner = new Scanner(System.in);
    @Override
    public VictorianChair createVictorianChair() {
        System.out.print("Enter age of chair: ");
        return new VictorianChair(scanner.nextInt());
    }

    @Override
    public MagicChair createMagicianChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
