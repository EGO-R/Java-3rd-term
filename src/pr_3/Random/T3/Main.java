package pr_3.Random.T3;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static ArrayList<Integer> mas = new ArrayList<Integer>();
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 4; i++)
            mas.add(rand.nextInt(90) + 10);

        System.out.println(mas.toString());

        if (mas.get(0) < mas.get(1) &&
                mas.get(1) < mas.get(2) &&
                mas.get(2) < mas.get(3))
            System.out.println("Возрастающая последовательность");
        else
            System.out.println("Невозрастающая последовательность");
    }
}
