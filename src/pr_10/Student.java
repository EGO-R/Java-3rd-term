package pr_10;

public class Student {
    private String name, surname, specialization, group;
    private int year, gpa;

    public Student(String name, String group, int gpa) {
        this.name = name;
        this.group = group;
        this.gpa = gpa;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
