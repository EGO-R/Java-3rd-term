package pr_8;

public class T2 {
    public static void recursion(int a, int n){
        if (a == n+1)
            return;
        System.out.print(a + " ");
        recursion(a+1, n);
    }

    public static void main(String[] args) {
        int n = 10;
        recursion(1, n);
    }
}
