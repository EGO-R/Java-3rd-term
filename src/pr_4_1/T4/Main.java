package pr_4_1.T4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()), m = Integer.parseInt(scanner.nextLine());
        Matrix matrix = new Matrix(n, m);
        matrix.print();
    }
}
