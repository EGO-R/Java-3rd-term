package pr_6.T10;

public class Processor {
    private String maker;
    private int cores;
    public Processor(String maker, int cores) {
        this.maker = maker;
        this.cores = cores;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }
}
