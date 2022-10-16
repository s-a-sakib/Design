public class OceanNavigation {
    public double angle;
    public double distance;

    private double x;
    private double y;
    public void turn(double degrees){
        angle = degrees;
    }
    public void move(double distances){
        distance = distances;
    }
    public double getX(){
        x = distance*Math.cos(angle);
        return x;
    }
    public double getY(){
        y = distance*Math.sin(angle);
        return y;
    }
    public double getDirection(){
        if(x == 0 && y==0) System.out.println("Direction : Central Point");
        else if (x > 0 && y == 0) System.out.println("Direction : Positive X-Axis");
        else if (x > 0 && y > 0) System.out.println("Direction : First Quadrant");
        else if (x==0 && y > 0) System.out.println("Direction : Positive Y-Axis");
        else if (x < 0 && y > 0) System.out.println("Direction : Second Quadrant");
        else if(x < 0 && y == 0) System.out.println("Direction : Negative X-Axis");
        else if (x < 0 && y < 0) System.out.println("Direction : Third Quadrant");
        else if (x==0 && y < 0) System.out.println("Direction : Negative Y-Axis");
        else {
            System.out.println("Direction : Forth Quadrant");
        }
        return 0;
    }
}

