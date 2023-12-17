package pr_19;

public class EmptyStringException extends Exception{
    public EmptyStringException(){
        super("String is empty");
    }
    public EmptyStringException(String text) {
        super(text);
    }
    public EmptyStringException(String text, Throwable e){
        super(text, e);
    }
}
