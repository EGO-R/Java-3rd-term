package pr_6;

public class Book implements Printable {
    private String name;
    private int chapters;

    public Book(String Name, int Chapters) {
        name = Name;
        chapters = Chapters;
    }

    public void print() {
        System.out.println("Book: " + name + " Chapters: " + chapters);
    }
}
