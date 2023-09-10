package pr_2.T7;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BookShelf shelf = new BookShelf();

        System.out.println("Actions:\nadd (author name year)\nprint\noldest\nnewest\nsort");
        System.out.println("\nInput actions: ");

        String action = in.next();
        while (!action.equals("end")){
            if (action.equals("add"))
                shelf.books.add(new Book(in.next(), in.next(), in.nextInt()));

            else if (action.equals("print"))
                shelf.print_shelf();

            else if (action.equals("oldest"))
                System.out.println(shelf.find_oldest());

            else if (action.equals("newest"))
                System.out.println(shelf.find_newest());

            else if (action.equals("sort"))
                shelf.sort();

            action = in.next();

        }

    }
}
