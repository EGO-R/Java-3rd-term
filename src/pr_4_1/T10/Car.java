package pr_4_1.T10;

import pr_4_1.T8.Circle;

public class Car extends Transport {
    public Car(){}

    public Car(double fuel_price, double speed){
        this.fuel_price = fuel_price;
        this.speed = speed;
    }

    @Override
    public double computeTime(double distance, boolean isGoodWeather) {return distance / speed;}

    @Override
    public double computePrice(double distance, double additional_weight) {return distance * fuel_price;}


    @Override
    public String toString(){
        return "Car{fuel price = " + fuel_price +
                ", speed = " + speed + "}";
    }
}
