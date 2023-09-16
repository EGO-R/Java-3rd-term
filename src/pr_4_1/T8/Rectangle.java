package pr_4_1.T8;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {}

    public Rectangle(double width, double length){
        this.length = length;
        this.width = width;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        this(width, length);
        this.filled = filled;
        this.color = color;
    }

    public double getWidth() {return width;}

    public void setWidth(double width) {this.width = width;}

    public double getLength() {return length;}

    public void setLength(double length) {this.length = length;}

    @Override
    public double getArea(){
        if (!filled)
            return 0;
        else
            return length * width;
    }

    @Override
    public double getPerimeter(){
        return 2 * length + 2 * width;
    }

    @Override
    public String toString(){
        return "Rectangle{color = \"" + color +
                "\", filled = \"" + filled +
                "\", length = " + length +
                "\", width = " + width + "}";
    }
}
