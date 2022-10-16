import java.util.Scanner;

public class ThermistorMachine{

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Please enter resistance: ");
        double resistance = read.nextDouble();
        Thermistor thermistor = new Thermistor(resistance);
        // print out
        System.out.printf("The temperature is: %.2f°C\n", thermistor.getTemperature());
    }
}