package pr_2.T10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Scanner st = new Scanner(str);
        int counter = 0;
        while (st.hasNext()) {
            counter++;
            st.next();
        }
        System.out.println(counter + " words");

    }
}
