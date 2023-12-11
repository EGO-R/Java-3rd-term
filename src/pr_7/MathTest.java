package pr_7;

public class MathTest {
    public static void main(String[] args) {
        MathFunc math = new MathFunc();
        System.out.println("Длина окружности радиуса 4: " + math.CircleLength(4));
        System.out.println("Площадь окружности радиуса 4: " + math.CircleSquare(4));
        System.out.println("23 в степени 3: " + math.pow(23, 3));
    }
}
