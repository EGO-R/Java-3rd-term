package pr_2.T1;
import pr_2.T1.Author;

import java.util.Scanner;


public class TestAuthor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Name: ");
        String name = in.nextLine();

        System.out.print("Email: ");
        String email = in.nextLine();

        System.out.print("Gender: ");
        char gender = in.nextLine().charAt(0);

        Author author = new Author(name, email, gender);

        System.out.println(author.toString());

    }
}

