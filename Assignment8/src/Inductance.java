public class Inductance {
    private double C;
    private double f;
    public Inductance(double c , double F) {
        C = c; f = F;
    }
    public double getInductance(){
        return (4 * Math.PI * Math.PI)/(f*f*C);
    }
}
