package pr_14;
import java.util.Scanner;
import java.util.regex.*;
public class T6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        Pattern pattern = Pattern.compile("([a-zA-Z0-9]+)@([a-zA-Z0-9.-]+)\\.([a-zA-Z]+)");//  user@example.com  :  @my.ru
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.matches() ? "да" : "нет");
    }
}
