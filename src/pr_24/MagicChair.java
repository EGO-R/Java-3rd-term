package pr_24;

public class MagicChair implements Chair {
    public void doMagic(){
        System.out.println("Magic...");
    }

    @Override
    public String toString() {
        return "magician chair";
    }
}
