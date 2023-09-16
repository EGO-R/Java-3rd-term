package pr_4_1.T8;

public class Square extends Rectangle{
    protected double side;
    public Square() {}

    public Square (double side){
        this.length = side;
        this.width = side;
        this.side = side;
    }

    public Square (double side, String color, boolean filled){
        this(side);
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {return side;}

    public void setSide(double side) {this.side = side;}

    @Override
    public void setWidth(double side) {this.width = side;}

    @Override
    public void setLength(double side) {this.length = side;}

    @Override
    public String toString(){
        return "Square{color = \"" + color +
                "\", filled = \"" + filled +
                "\", side = " + side + "}";
    }
}
