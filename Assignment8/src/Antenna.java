import java.util.Scanner;

public class Antenna {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Please input the frequency in Hz: ");
        double f = read.nextDouble();
        System.out.println("Please input Maximum Capacitance in F: ");
        double Cmax = read.nextDouble();
        System.out.println("Please input Minimum Capacitance int F: ");
        double Cmin = read.nextDouble();

        AverageCapacitance averageCapacitance = new AverageCapacitance(Cmax,Cmin);
        double C = averageCapacitance.getC();
        Inductance inductance = new Inductance(C,f);
        double L = inductance.getInductance();
        Frequency Fmax = new Frequency(Cmax,L);
        Frequency Fmin = new Frequency(Cmin,L);

        System.out.printf("Inductance  : " +"%f\n",L);
        System.out.printf("Maximum Frequency  : "+"%.2f\n",Fmax.getFrequency());
        System.out.printf("Minimum Frequency  : "+"%.2f\n",Fmin.getFrequency());
    }
}
