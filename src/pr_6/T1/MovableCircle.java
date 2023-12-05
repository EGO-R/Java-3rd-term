package pr_6.T1;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center.x = x;
        center.y = y;
        center.xSpeed = xSpeed;
        center.ySpeed = ySpeed;
        this.radius = radius;
    }


    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center: x= " + center.x +
                ", y= " + center.y +
                '}';
    }
    public void moveUp(){
        center.y += center.ySpeed;
    }
    public void moveDown(){
        center.y -= center.ySpeed;
    }
    public void moveRight(){
        center.x += center.xSpeed;
    }
    public void moveLeft(){
        center.x -= center.xSpeed;
    }
}
