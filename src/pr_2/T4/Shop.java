package pr_2.T4;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop implements ShopMethods {
    public static ArrayList<Computer> computers = new ArrayList<Computer>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество компьютеров: ");

        int amount = Integer.parseInt(in.nextLine());
        System.out.println("Вводите имена компьютеров: ");
        for (int i = 0; i < amount; i++)
        {
            add_computer(in.nextLine());
        }

        System.out.print("Введите имя компьютера на удаление: ");
        delete_computer(in.nextLine());

        System.out.print("Введите имя компьютера, который нужно найти: ");
        find_computer(in.nextLine());
    }


    public static void add_computer(String name) {
        computers.add(new Computer(name));
        System.out.println("Компьютер \"" + name + "\" добавлен");
    }


    static public void delete_computer(String name) {
        for (int i = 0; i < computers.size(); i++)
        {
            Computer computer = computers.get(i);
            if (computer.getName().equals(name))
            {
                computers.remove(computer);
                i--;
                System.out.println("Компьютер \"" + name + "\" удалён");
            }
        }

    }


    static public void find_computer(String name) {
        for (Computer computer : computers)
        {
            if (computer.getName().equals(name))
                System.out.println(computer.toString());
        }
    }

}

