public class AnglesOfCorners {
    private double a;
    private double b;
    private double c;
    public AnglesOfCorners(double A,double B, double C) {
        a = A; b = B; c = C;
    }
    public double getAngleA(){
        return Math.acos((((b*b) + (c*c) - (a*a))/(2*b*c)));
    }
    public double getAngleB(){
        return Math.acos((((a*a) + (c*c) - (b*b))/(2*a*c)));
    }
    public double getAngleC(){
        return Math.acos((((a*a) + (b*b) - (c*c))/(2*a*b)));
    }
}
