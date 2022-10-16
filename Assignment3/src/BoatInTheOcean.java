import java.util.Scanner;

public class BoatInTheOcean {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Please input current distance:");
        double distance = read.nextDouble();
        System.out.print("Please input current angle:");
        double angle = read.nextDouble();
        OceanNavigation oceanNavigation = new OceanNavigation();
        oceanNavigation.move(distance);
        oceanNavigation.turn(angle);
        System.out.printf("X : " + "%.2f\n" , oceanNavigation.getX());
        System.out.printf("Y : " + "%.2f\n",oceanNavigation.getY());
        oceanNavigation.getDirection();
    }
}
