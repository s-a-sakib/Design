public class Area {
    private double A;
    private double B;
    private double C;
    private double s;
    public Area(double a,double b,double c) {
        A = a; B = b; C = c;
        s = (a+b+c)/2;
    }

    public double getArea() {
        return Math.sqrt(s*(s-A)*(s-B)*(s-C));
    }
}
