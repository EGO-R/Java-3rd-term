package pr_9;

public class Student implements Comparable<Student> {
    public int idNumber;
    public String name, surname;

    public Student(int idNumber, String surname, String name) {
        this.idNumber = idNumber;
        this.surname = surname;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(idNumber, other.idNumber);
    }
    @Override
    public String toString() {
        return "Student{" +
                "idNumber=" + idNumber +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                "}\n";
    }
}
