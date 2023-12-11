package pr_6.T10;

import  java.util.Scanner;
public class ShopTest {
    public static void main(String[] args) {
        System.out.println("Доступные модели:\n1. APPLE\n2. ASUS\n3. HONOR\n");

        Scanner sc = new Scanner(System.in);
        Shop Items = new Shop();
        int a = 1, num;
        boolean t = true;
        String name;
        System.out.println("Введите название 1 ПК:");
        for (int i = 0; i < a; i++) {
            name = sc.nextLine();
            Items.AddComputer(name);
        }
        System.out.println("Меню: \n1. Добавить компьютер\n2. Удалить компьютер\n3. Найти компьютер\n4. Вывести все имеющиеся ПК\n5. Закончить работу");
        while (t) {
            System.out.print("Выберите операцию: ");
            num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.print("Введите название нового ПК: ");
                    name = sc.next();
                    Items.AddComputer(name);
                    break;
                case 2:
                    System.out.print("Введите название ПК для удаления: ");
                    name = sc.next();
                    Items.DelComputer(name);
                    break;
                case 3:
                    System.out.print("Введите название Искомого ПК: ");
                    name = sc.next();
                    if (Items.FindComputer(name) != null)
                        System.out.println("Компьютер найден");
                    else
                        System.out.println("Компьютер НЕ найден");
                    break;
                case 4:
                    Items.ShopOut();
                    break;
                case 5:
                    t = false;
                    break;
            }
        }
    }
}
