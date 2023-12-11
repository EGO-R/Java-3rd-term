package pr_11;

import java.util.GregorianCalendar;
import java.util.Scanner;
public class T2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        GregorianCalendar local = new GregorianCalendar();
        GregorianCalendar user = new GregorianCalendar();

        System.out.print("Введите год: ");
        user.set(GregorianCalendar.YEAR, sc.nextInt());
        System.out.print("Введите месяц: ");
        user.set(GregorianCalendar.MONTH, sc.nextInt() - 1);
        System.out.print("Введите дату: ");
        user.set(GregorianCalendar.DATE, sc.nextInt());

        if (local.compareTo(user) < 0){
            System.out.println("Введённая дата позже");
        }
        else if (local.compareTo(user) == 0){
            System.out.println("Введённая дата сегодня");
        }
        else{
            System.out.println("Введённая дата раньше");
        }
        System.out.println(local.getTime());
        System.out.println(user.getTime());
    }
}
