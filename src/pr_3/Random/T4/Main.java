package pr_3.Random.T4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static ArrayList<Integer> arr = new ArrayList<Integer>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (n < 1){
            System.out.print("Size: ");
            if (scanner.hasNextInt())
                n = Integer.parseInt(scanner.nextLine());
            else
                scanner.nextLine();
        }

        boolean isChet = false;
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr.add(rand.nextInt(n + 1));
            if (arr.get(arr.size() - 1) % 2 == 0)
                isChet = true;
        }

        System.out.println(arr.toString());

        if (isChet){
            ArrayList<Integer> mas = new ArrayList<Integer>();

            for (int num : arr){
                if (num % 2 == 0)
                    mas.add(num);
            }
            System.out.println(mas.toString());

        }

    }
}
