package pr_2.T7;

import java.util.ArrayList;
import java.util.Comparator;

public class BookShelf {
    public ArrayList<Book> books = new ArrayList<Book>();
    public int amount = 0;
    public String find_oldest(){
        Book book = books.get(0);

        for (Book value : books) {
            if (value.getYear() < book.getYear())
                book = value;
        }

        return book.toString();
    }

    public String find_newest(){
        Book book = books.get(0);

        for (Book value : books) {
            if (value.getYear() > book.getYear())
                book = value;
        }

        return book.toString();
    }

    public void sort(){
        books.sort(new Comparator<Book>() {
            @Override
            public int compare(Book book, Book t1) {
                return Integer.compare(book.getYear(), t1.getYear());
            }
        });
    }

    public void print_shelf(){
        for (Book book : books)
            System.out.println(book.toString());
    }
}
