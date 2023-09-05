package pr_2.T1;
import pr_2.T1.Author;

import java.util.Scanner;


public class TestAuthor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Name: ");
        String name = in.nextLine();

        System.out.println("Email: ");
        String email = in.nextLine();

        System.out.println("Gender: ");
        char gender = in.nextLine().charAt(0);

        Author author = new Author(name, email, gender);

    }
}

