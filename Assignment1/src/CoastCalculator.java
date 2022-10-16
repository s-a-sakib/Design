public class CoastCalculator {
    private final double MilesDrivenParYear = 15_000;
    private double NewCarCoast;
    private double GasPrise;
    private double MilesParGallon;
    private double ResaleValue;
    public CoastCalculator(double NewCarCoast,double GasPrise,double MilesParGallon,double ResaleValue) {
        this.NewCarCoast = NewCarCoast;
        this.GasPrise = GasPrise;
        this.MilesParGallon = MilesParGallon;
        this.ResaleValue = ResaleValue;
    }
    public double getCoast(){
        return (NewCarCoast + (MilesDrivenParYear/MilesParGallon)*GasPrise*5 - ResaleValue);
    }
}
