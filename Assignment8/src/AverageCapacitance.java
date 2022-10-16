public class AverageCapacitance {

    private double Cmax;
    private double Cmin;
    public AverageCapacitance(double cmax , double cmin) {
        Cmax = cmax; Cmin = cmin;
    }
    public double getC(){
        return Math.sqrt(Cmax*Cmin);
    }
}
