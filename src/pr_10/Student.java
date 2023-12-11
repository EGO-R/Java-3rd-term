package pr_10;

public class Student {
    private String name, surname, specialization, group;
    private int year, gpa;

    public Student(String name, String surname, String specialization, String group, int year, int gpa) {
        this.name = name;
        this.surname = surname;
        this.specialization = specialization;
        this.group = group;
        this.year = year;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", specialization='" + specialization + '\'' +
                ", group='" + group + '\'' +
                ", year=" + year +
                ", gpa=" + gpa +
                '}';
    }
}
