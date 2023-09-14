package pr_1;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        T7();
    }

        public static void T3(){
            Scanner in = new Scanner(System.in);
            System.out.println("Введите количество элементов массива: ");
            int mas_size = in.nextInt();

            int[] mas = new int[mas_size];

            int sum = 0;
            for(int i = 0; i < mas.length; i++) {
                mas[i] = in.nextInt();
                sum += mas[i];
            }
            System.out.println("Сумма: " + sum + "\nСреднее арифметическое: " + sum / mas.length);
        }

        public static void T4(){
            Scanner in = new Scanner(System.in);
            System.out.println("Введите количество элементов массива: ");
            int mas_size = in.nextInt();
            int[] mas = new int[mas_size];

            int i = 0, sum = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
            while (i < mas_size) {
                mas[i] = in.nextInt();
                sum += mas[i];
                if (mas[i] > max) max = mas[i];
                if (mas[i] < min) min = mas[i];
                i++;
            }
            System.out.println("Сумма: " + sum + "\nМаксимальное число: " + max + "\nМинимальное число: " + min);
    }

    public static void T5(String[] args){
        for(String st : args)
            System.out.println(st);
    }

    public static void T6() {
        double res = 0;
        for(int i = 1; i < 11; i++){
            res += 1.0 / i;
            System.out.printf("%.2f\n", res);
        }
    }

    public static void T7(){
        Scanner in = new Scanner(System.in);
        BigInteger num = in.nextBigInteger();
        System.out.println(factorial(num));
    }

    public static BigInteger factorial(BigInteger num){
        BigInteger res = BigInteger.valueOf(1);
        for(BigInteger i = BigInteger.valueOf(1); i.compareTo(num) <= 0; i = i.add(BigInteger.valueOf(1)))
            res = res.multiply(i);
        return res;
    }
}