package pr_2.T7;

public class Book {
    private String author;
    private String name;
    private int year;
    public Book(String author, String name, int year) {
        this.name = name;
        this.year = year;
        this.author = author;
    }

    public void setAuthor(String author) {this.author = author;}

    public String getAuthor() {return author;}

    public void setName(String name) {this.name = name;}

    public String getName() {return name;}

    public void setYear(int year) {this.year = year;}

    public int getYear() {return year;}

    @Override
    public String toString(){
        return "Book{author = \"" + author +
                "\", name = \"" + name +
                "\", year = " + year + "}";
    }
}
