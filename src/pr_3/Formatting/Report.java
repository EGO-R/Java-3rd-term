package pr_3.Formatting;

import java.util.ArrayList;

public class Report {
    public static ArrayList<Employee> mas = new ArrayList<Employee>();
    public static void main(String[] args) {
        mas.add(new Employee("Sam", 100));
        mas.add(new Employee("Dean", 150));
        mas.add(new Employee("Mary", 75));

        generateReport();
    }

    public static void generateReport(){
        for (Employee employee : mas)
            System.out.printf("%-10s %6.2f\n", employee.getFullname(), (float)employee.getSalary());
    }
}
