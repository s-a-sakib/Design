import java.util.Scanner;

public class DewPoint {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Please input Temperature T :");
        double Temperature = read.nextDouble();
        System.out.println("Please input Humidity RH :");
        double HumidityRH = read.nextDouble();
        Function  function = new Function(Temperature,HumidityRH);
        double DewPoint = (Constant.b * function.getF())/ (Constant.a - function.getF());
        System.out.printf("The Dew Point is " + "%.1f" + " Degree\n",DewPoint);
    }
}
