package pr_19;


import java.util.ArrayList;
import java.util.Collections;

public class LabClass {
    private final ArrayList<Student> arrClass;
    public LabClass(){
        arrClass = new ArrayList<>();
    }
    public void add(Student student){
        arrClass.add(student);
    }
    public Student findStudent(String fio) throws StudentNotFoundException, EmptyStringException{
        if (fio.isEmpty())
            throw new EmptyStringException();
        for (Student student : arrClass){
            if (student.getFIO().equals(fio))
                return student;
        }
        throw new StudentNotFoundException();
    }
    public void sort(){
        Collections.sort(arrClass);
    }

    @Override
    public String toString() {
        return "LabClass{" +
                "arrClass=" + arrClass +
                '}';
    }
}
