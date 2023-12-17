package pr_24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ChairFactory chairFactory = new ChairFactory();
        Chair chair = chairFactory.createMagicianChair();

        boolean flag = true;

        while (flag) {
            System.out.print("Enter type of chair: ");
            String type = scanner.next();

            switch (type.toLowerCase()){
                case("victorian"):
                    chair = chairFactory.createVictorianChair();
                    System.out.println("It's " + chair);
                    flag = false;
                    break;

                case("magic"):
                    chair = chairFactory.createMagicianChair();
                    ((MagicChair) chair).doMagic();
                    System.out.println("It's " + chair);
                    flag = false;
                    break;

                case("functional"):
                    chair = chairFactory.createFunctionalChair();
                    System.out.println(((FunctionalChair) chair).sum(10, 20));
                    System.out.println("It's " + chair);
                    flag = false;
                    break;

            }
        }


        Client client = new Client();
        client.setChair(chair);
        client.sit();
    }
}
