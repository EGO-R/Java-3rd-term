package pr_4_1.T8;

public class Circle extends Shape{
    protected double radius;
    public Circle () {}

    public Circle(double radius, String color, boolean filled) {
        this.filled = filled;
        this.color = color;
        this.radius = radius;
    }

    public double getRadius() {return radius;}

    public void setRadius(double radius) {this.radius = radius;}

    @Override
    public double getArea(){
        if (!filled)
            return 0;
        else
            return 3.14 * Math.sqrt(radius);
    }

    @Override
    public double getPerimeter(){
        return 2 * 3.14 * radius;
    }

    @Override
    public String toString(){
        return "Circle{color = \"" + color +
                "\", filled = \"" + filled +
                "\", radius = " + radius + "}";
    }
}
