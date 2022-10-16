public class Thermistor {
    // declare permanent variables
    private double resistance;

    public Thermistor(double Resistance) {
        resistance = Resistance;
    }

    public double getTemperature() {
        return   ((Constand.β * Constand.TZERO) / ((Constand.TZERO * (Math.log(resistance / Constand.RZERO))) + Constand.β)) - Constand.KELVIN;
    }

}