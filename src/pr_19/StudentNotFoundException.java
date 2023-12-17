package pr_19;

public class StudentNotFoundException extends Exception{
    public StudentNotFoundException(){
        super("Student Not Found");
    }
    public StudentNotFoundException(String text) {
        super(text);
    }
    public StudentNotFoundException(String text, Throwable e){
        super(text, e);
    }
}