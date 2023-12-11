package pr_7;

public class MathFunc implements MathCalculable{
    public double pow(double a, double b){
        return MathCalculable.pow(a, b);
    }
    public double complexModule(double a, double b){
        return MathCalculable.complexModule(a, b);
    }

    public double CircleLength(double r){
        return 2 * pi * r;
    }
    public double CircleSquare(double r){
        return pi * pow(r, 2);
    }
}
