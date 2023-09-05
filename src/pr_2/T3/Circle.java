package pr_2.T3;

public class Circle {
    private Point center;
    private double radius;
    public Circle(double x, double y, double radius){this.center = new Point(x, y); this.radius = radius;}
    public void setCenter(double x, double y){
        this.center.setX(x);
        this.center.setY(y);
    }

    @Override
    public String toString(){return "Circle{x = " + center.getX() + ", y = " + center.getY() + ", radius = " + radius + "}";}

}
