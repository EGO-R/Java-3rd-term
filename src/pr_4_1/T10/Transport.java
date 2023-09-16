package pr_4_1.T10;

public abstract class Transport {
    protected double fuel_price;
    protected double speed;

    public Transport() {};

    public Transport(double fuel_price, double speed){
        this.fuel_price = fuel_price;
        this.speed = speed;
    }

    public double getFuel_price() {return fuel_price;}

    public void setFuel_price(double fuel_price) {this.fuel_price = fuel_price;}

    public double getSpeed() {return speed;}

    public void setSpeed(double speed) {this.speed = speed;}

    public abstract double computeTime(double distance, boolean isGoodWeather);

    public abstract double computePrice(double distance, double additional_weight);


    @Override
    public abstract String toString();
}
