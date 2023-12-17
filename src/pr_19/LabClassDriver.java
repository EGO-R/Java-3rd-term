package pr_19;

import java.util.Scanner;

public class LabClassDriver {
    private final Scanner scanner = new Scanner(System.in);
    private final LabClassUI ui = new LabClassUI(scanner);
    public LabClassDriver(){};
    public void start(){

        while (true){
            System.out.println("""
                0. End program.
                1. Fill class.
                2. Sort by GPA.
                3. Find student in class.
                4. Print data.""");

            switch (Integer.parseInt(scanner.nextLine())){
                case 0 -> {
                    return;
                }
                case 1 -> ui.fill();
                case 2 -> ui.sort();
                case 3 -> ui.find();
                case 4 -> ui.print();
            }
        }
    }

    public static void main(String[] args) {
        LabClassDriver driver = new LabClassDriver();
        driver.start();
    }
}
