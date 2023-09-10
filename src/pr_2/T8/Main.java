package pr_2.T8;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<String> mas = new ArrayList<String>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Actions:\nadd\nreverse\nprint\nend");

        System.out.println("\nInput actions: ");
        String action = in.next();
        while (!action.equals("end")){
            if (action.equals("add"))
                mas.add(in.next());

            else if (action.equals("reverse"))
                reverse();

            else if (action.equals("print"))
                print();

            action = in.next();
        }
    }

    public static void reverse(){
        if (mas.size() <= 1)
            return;

        int i = 0, j = mas.size() - 1;
        while (i < j){
            String temp = mas.get(i);
            mas.set(i, mas.get(j));
            mas.set(j, temp);
            i++;
            j--;
        }
    }

    public static void print(){
        for (String st : mas)
            System.out.println(st);
    }
}
