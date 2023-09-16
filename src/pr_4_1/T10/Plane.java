package pr_4_1.T10;

public class Plane extends Transport {
    protected double price_for_1kg;

    public Plane(){}

    public Plane (double price_for_1kg, double fuel_price, double speed){
        this.price_for_1kg = price_for_1kg;
        this.fuel_price = fuel_price;
        this.speed = speed;
    }

    public double getPrice_for_1kg() {return price_for_1kg;}

    public void setPrice_for_1kg(double price_for_1kg) {this.price_for_1kg = price_for_1kg;}

    @Override
    public double computeTime(double distance, boolean isGoodWeather){
        if(!isGoodWeather)
            return 0;

        return distance / speed;
    }

    @Override
    public double computePrice(double distance, double additional_weight){
        return distance * fuel_price * (1 + additional_weight / 75);
    }

    @Override
    public String toString(){
        return "Plane{fuel price = " + fuel_price +
                ", speed = " + speed +
                ", price for 1kg = " + price_for_1kg + "}";
    }
}
