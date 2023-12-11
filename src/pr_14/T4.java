package pr_14;
import java.util.Scanner;
import java.util.regex.*;
public class T4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Pattern pattern = Pattern.compile("([0-9]+)\\s\\+"); //  6 / 5 – 2 * 9  :  (1 + 8) – 9 / 4
        Matcher matcher = pattern.matcher(input);
        if (matcher.find())
            System.out.print("есть числа c + после");
        else
            System.out.print("чисел с + после нет");
    }
}
