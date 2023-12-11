package pr_7;

public interface MathCalculable {
    double pi = Math.PI;
    public static double pow(double a, double b) {
        return Math.pow(a, b);
    }
    public static double complexModule(double a, double b) {
        return Math.sqrt(a*a + b*b);
    }
}
