package pr_19;

public class Student implements Comparable<Student> {
    private final int IdNumber;
    private String FIO;
    private int gpa = 0;
    public Student(int idNumber) {
        IdNumber = idNumber;
    }
    public Student(int idNumber, String fio) {
        IdNumber = idNumber;
        FIO = fio;
    }
    public Student(int idNumber, String fio, int gpa) {
        IdNumber = idNumber;
        FIO = fio;
        this.gpa = gpa;
    }

    public int getGpa() {
        return gpa;
    }
    public void setGpa(String gpa) throws EmptyStringException {
        if (gpa.isEmpty())
            throw new EmptyStringException();
        this.gpa = Integer.parseInt(gpa);
    }

    public int getIdNumber() {
        return IdNumber;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) throws EmptyStringException{
        if (FIO.isEmpty())
            throw new EmptyStringException();
        this.FIO = FIO;
    }

    @Override
    public int compareTo(Student other) {
        return -Integer.compare(gpa, other.gpa);
    }
    @Override
    public String toString() {
        return "Student{" +
                "FIO'" + FIO + '\'' +
                ", gpa=" + gpa +
                "}\n";
    }
}
