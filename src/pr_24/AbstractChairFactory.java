package pr_24;

public interface AbstractChairFactory {
    public VictorianChair createVictorianChair();
    public MagicChair createMagicianChair();
    public FunctionalChair createFunctionalChair();
}
