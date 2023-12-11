package pr_11;

import java.util.*;

public class T4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату в виде DD-MM-YYYY: ");
        String date = scanner.next();
        System.out.print("Введите время в виде HH-MM-SS: ");
        String time = scanner.next();
        String[] mas1 = date.split("-");
        String[] mas2 = time.split("-");
        int year = Integer.parseInt(mas1[2]);
        int month = Integer.parseInt(mas1[1]) - 1;
        int day = Integer.parseInt(mas1[0]);
        int hour = Integer.parseInt(mas2[0]);
        int min = Integer.parseInt(mas2[1]);
        int sec = Integer.parseInt(mas2[2]);

        Date data = new Date(year - 1900, month, day, hour, min, sec);
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, hour, min, sec);

        System.out.println("Дата по Date: " + data);
        System.out.print("Дата по Calendar: " + calendar.getTime());
    }
}
