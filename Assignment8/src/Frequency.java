public class Frequency {
    private double C;
    private double L;
    public Frequency(double c,double l) {
        C = c; L = l;
    }
    public double getFrequency(){
        return (2* Math.PI)/Math.sqrt(C * L);
    }

}
