public class LengthOfAllSides{
    private double x1,x2,x3,y1,y2,y3;
    public double a,b,c;


    public void getLengthOfAllSides(double X1,double Y1,double X2,double Y2,double X3,double Y3){
        x1  = X1; y1 = Y1; x2 = X2; y2 = Y2; x3 = X3; y3 = Y3;
    }

    public double getLength1() {
        a = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        return a;
    }
    public double getLength2() {
        b = Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
        return b;
    }
    public double getLength3() {
        c = Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
        return c;
    }
}
