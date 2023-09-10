package pr_2.T9;

import java.util.ArrayList;
import java.util.Random;
import java.util.Comparator;
import java.util.Scanner;

public class Pocker {
    public static ArrayList<Card> deck = new ArrayList<Card>();
    public static void main(String[] args) {
        fill_deck();
        mix_deck();
        Scanner in = new Scanner(System.in);
        System.out.print("Количество игроков: ");
        int players = in.nextInt();
        distribute(players);
    }

    public static void fill_deck(){
        String[] Mast = {"Буби", "Черви", "Крести", "Пики"};
        String[] Value = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
        "Валет", "Дама", "Король", "Туз"};

        for (String mast : Mast){
            for (String value : Value)
                deck.add(new Card(mast, value));
        }
    }

    public static void mix_deck(){
        Random rand = new Random();
        for (int i = 0; i < 100; i++){
            int ri = rand.nextInt(52), rj = rand.nextInt(52);
            Card temp = deck.get(ri);
            deck.set(ri, deck.get(rj));
            deck.set(rj, temp);
        }
    }

    public static void distribute(int players){
        ArrayList<String> table = new ArrayList<String>();
        for (int i = 0; i < players; i++) table.add("");

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < table.size(); j++){
                table.set(j, table.get(j) + deck.get(0).toString() + " ");
                deck.remove(0);
            }
        }

        for (String player : table)
            System.out.println("\n" + player);
    }
}
