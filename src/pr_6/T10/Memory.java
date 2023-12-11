package pr_6.T10;

public class Memory {
    private int gigabyte;
    private int speed;

    public Memory(int gigabyte, int speed) {
        this.gigabyte = gigabyte;
        this.speed = speed;
    }

    public int getGigabyte() {
        return gigabyte;
    }

    public void setGigabyte(int gigabyte) {
        this.gigabyte = gigabyte;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
