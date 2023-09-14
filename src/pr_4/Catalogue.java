package pr_4;

import java.util.ArrayList;
import java.util.Scanner;

public enum Catalogue {
    ELECTRONICS("электроника"),
    TOYS("игрушки");
    private String title;
    private Catalogue(String title){
        this.title = title;
    }

    public String getTitle() {return title;}
    public String contents(){
        if (this == Catalogue.ELECTRONICS)
            System.out.print("\nТовары:\nсмартфон\nноутбук\n\nДобавить в корзину: ");
        else
            System.out.print("\nТовары:\nмашина\nсамолёт\n\nДобавить в корзину: ");

        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
