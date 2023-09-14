package pr_4_1.T4;

import java.util.ArrayList;
import java.util.Scanner;

public class Matrix {
    public ArrayList<ArrayList<Integer>> mas = new ArrayList<>();
    public int n;
    public int m;
    public Matrix(int n, int m){
        this.n = n;
        this.m = m;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++){
            ArrayList<Integer> temp = new ArrayList<>();

            for (int j = 0; j < m; j++)
                temp.add(scanner.nextInt());

            scanner.nextLine();
            mas.add(temp);
        }
    }

    public void print(){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++)
                System.out.print(mas.get(i).get(j) + " ");
            System.out.print("\n");
        }
    }


    public Matrix add(Matrix matrix){
        if (this.n != matrix.n || this.m != matrix.m)
            return null;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                this.mas.get(i).set(j, this.mas.get(i).get(j) + matrix.mas.get(i).get(j));
        }

        return this;
    }

}
