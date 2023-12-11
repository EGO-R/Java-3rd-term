package pr_6;

public class Main {
    public static void main(String[] args) {
        Printable book1 = new Book("Трое в лодке", 200);
        Printable book2 = new Book("One Piece", 1093);
        Printable shop1 = new Magazine("MIREA daily", 500);
        Printable shop2 = new Magazine("Racist world", 600);
        Printable[] printables = {book1, book2, shop1, shop2};
        for (Printable printable : printables){
            printable.print();
        }
    }
}
