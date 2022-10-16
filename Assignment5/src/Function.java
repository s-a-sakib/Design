public class Function {
    private double t;
    private double rh;
    public Function(double T,double RH) {
        t = T;
        rh = RH;
    }
    public double getF(){
        return ((Constant.a * t) / (Constant.b + t)) + Math.log10(rh);
    }
}
