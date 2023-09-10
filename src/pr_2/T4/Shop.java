package pr_2.T4;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop{
    public static ArrayList<Computer> computers = new ArrayList<Computer>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Actions:\nadd\nremove\nfind\nend");

        System.out.println("\nВыберите действие: ");
        String action = in.next();
        while (!action.equals("end")){
            if (action.equals("add"))
                add_computer(in.next());
            else if (action.equals("remove"))
                delete_computer(in.next());
            else if (action.equals("find"))
                find_computer(in.next());

            action = in.next();
        }

    }


    public static void add_computer(String name) {
        computers.add(new Computer(name));
        System.out.println("Computer \"" + name + "\" has been added");
    }


    static public void delete_computer(String name) {
        for (int i = 0; i < computers.size(); i++)
        {
            Computer computer = computers.get(i);
            if (computer.getName().equals(name))
            {
                computers.remove(computer);
                i--;
                System.out.println("Computer \"" + name + "\" has been removed");
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

