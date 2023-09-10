package pr_3.Random.T1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static ArrayList<Double> mas = new ArrayList<Double>();
    public static void main(String[] args) {
        rand();
        math();
        System.out.println(mas.toString());
        mas.sort(new Comparator<Double>() {
            @Override
            public int compare(Double aDouble, Double t1) {
                return Double.compare(aDouble, t1);
            }
        });

        System.out.println(mas.toString());


    }
    public static void rand(){
        Random rand = new Random();
        for (int i = 0; i < 5; i++)
            mas.add(rand.nextDouble());
    }

    public static void math(){
        for (int i = 0; i < 5; i++)
            mas.add(Math.random());
    }
}
