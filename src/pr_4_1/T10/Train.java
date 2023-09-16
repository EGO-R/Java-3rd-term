package pr_4_1.T10;

public class Train extends Transport {
    public Train(){}

    public Train(double price_for_1kg, double fuel_price, double speed){
        this.fuel_price = fuel_price;
        this.speed = speed;
    }

    @Override
    public double computeTime(double distance, boolean isGoodWeather) {return distance / speed;}

    @Override
    public double computePrice(double distance, double additional_weight) {return distance * fuel_price;}

    @Override
    public String toString() {
        return "Train{fuel price = " + fuel_price +
                ", speed = " + speed + "}";
    }


}
