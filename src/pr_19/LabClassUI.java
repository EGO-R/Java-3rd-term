package pr_19;

import java.util.Scanner;

public class LabClassUI {
    private final Scanner scanner;
    private LabClass labClass;
    private int id = 0;
    public LabClassUI(Scanner scanner){
        this.scanner = scanner;
    }
    public void fill(){
        System.out.print("Введите кол-во студентов: ");
        int count = Integer.parseInt(scanner.nextLine());
        labClass = new LabClass();
        Student student;
        for (int i = 0; i < count; ++i){
            try {
                student = new Student(id++);
                System.out.print("Введите имя студента: ");
                student.setFIO(scanner.nextLine());
                System.out.print("Введите баллы студента: ");
                student.setGpa(scanner.nextLine());
                labClass.add(student);
            } catch (EmptyStringException e){
                System.out.println(e.getMessage());
                --i;
                --id;
            }
        }
    }

    public void sort(){
        if (labClass != null)
            labClass.sort();
        else System.out.println("Пустой массив");
    }

    public void find(){
        if (labClass != null) {
            System.out.print("Введите ФИО: ");
            try {
                System.out.println(labClass.findStudent(scanner.nextLine().toString()));
            } catch (EmptyStringException | StudentNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
        else System.out.println("Пустой массив");
    }
    public void print(){
        System.out.println(labClass);
    }
}
