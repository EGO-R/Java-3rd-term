package pr_14;
import java.util.Scanner;
import java.util.regex.*;
public class T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine(); // 25.98 USD 44 ERR 0.004 EU 0.04 EU

        Pattern pattern = Pattern.compile("([0-9]*)\\.([0-9]{2}) (USD|RUB|EU)");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find())
            System.out.println(matcher.group());
    }
}
