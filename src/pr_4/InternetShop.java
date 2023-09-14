package pr_4;

import java.util.ArrayList;
import java.util.Scanner;

public class InternetShop {
    public static ArrayList<Integer> users = new ArrayList<Integer>();
    public static ArrayList<String> bin = new ArrayList<String>();

    public static void main(String[] args) {
        users.add("1 1".hashCode());

        boolean isLogin = false;
        Scanner scanner = new Scanner(System.in);
        while (!isLogin){
            System.out.print("Логин: ");
            String user = scanner.nextLine();
            System.out.print("Пароль: ");
            user += " " + scanner.nextLine();

            if (users.contains(user.hashCode())) isLogin = true;
        }

        String catalogue = "";
        while (!catalogue.equals("купить")) {

            System.out.println("\nкорзина/купить");
            System.out.println("Каталог:");
            for (Catalogue temp : Catalogue.values())
                System.out.println(temp.getTitle());

            System.out.print("\nВыбор: ");
            catalogue = scanner.nextLine();
            if (catalogue.equals("электроника")) {
                bin.add(Catalogue.ELECTRONICS.contents());
                System.out.println("-- " + bin.get(bin.size() - 1) + " добавлен(а) в корзину!");
            }
            else if (catalogue.equals("игрушки")) {
                bin.add(Catalogue.TOYS.contents());
                System.out.println("-- " + bin.get(bin.size() - 1) + " добавлен(а) в корзину!");
            }
            else if (catalogue.equals("корзина")) System.out.println(bin.toString());
        }
        /*
        Catalogue choose = new Cat;
        System.out.println(choose.getTitle());

        while (!catalogue.equals("электроника") && !catalogue.equals("игрушки"))
            catalogue = scanner.nextLine();
        if ()
        */
    }
}
