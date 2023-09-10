package pr_3.Formatting;

public class Employee {
    private String fullname;
    private int salary;
    public Employee (String fullname, int salary){
        this.fullname = fullname;
        this.salary = salary;
    }

    public void setFullname(String fullname) {this.fullname = fullname;}

    public String getFullname() {return fullname;}

    public void setSalary(int salary) {this.salary = salary;}

    public int getSalary() {return salary;}
}
