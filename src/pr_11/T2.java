package pr_11;

import java.time.LocalDate;
import java.util.Scanner;
public class T2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        LocalDate local = LocalDate.now();
        LocalDate user = LocalDate.now();
        System.out.print("Введите год: ");
        user = user.withYear(sc.nextInt());
        System.out.print("Введите месяц: ");
        user = user.withMonth(sc.nextInt());
        System.out.print("Введите дату: ");
        user = user.withDayOfMonth(sc.nextInt());

        if (local.compareTo(user) < 0){
            System.out.print("Введённая дата позже");
        }
        else if (local.compareTo(user) == 0){
            System.out.print("Введённая дата сегодня");
        }
        else{
            System.out.print("Введённая дата раньше");
        }
    }
}
