import java.util.Scanner;

public class CarRunner {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        /*Assignment number one
          Name: Shahrear Al Sakib Id:2110976109 Session: 2020-21
        */

        System.out.println("A car drives 15000 Miles par year is fixed value\n\n");

        System.out.print("Gas Prise is common for each car.\nInput Gas Prise par gallon:");
        double GasPrise = read.nextDouble();
        System.out.print("\n");


        System.out.println("Please input new Hybrid Car Coast:");
        double NewHybridCarCoast = read.nextDouble();

        System.out.println("New Hybrid Car Goes miles par Gallon:");
        double NewHybridCarMilesParGallon = read.nextDouble();

        System.out.println("New hybrid Car resale value:");
        double NewHybridCarResaleValue = read.nextDouble();

        CoastCalculator NewHybridCar = new CoastCalculator(NewHybridCarCoast,GasPrise,NewHybridCarMilesParGallon,NewHybridCarResaleValue);

        System.out.println("Please input Old Hybrid Car Coast:");
        double OldHybridCarCoast = read.nextDouble();

        System.out.println("Old Hybrid Car Goes miles par Gallon:");
        double OldHybridCarMilesParGallon = read.nextDouble();

        System.out.println("Old Hybrid Car resale value:");
        double OldHybridCarResaleValue = read.nextDouble();
        CoastCalculator OldHybridCar = new CoastCalculator(OldHybridCarCoast,GasPrise,OldHybridCarMilesParGallon,OldHybridCarResaleValue);

        System.out.println("Please input NonHybrid Car Coast:");
        double NonHybridCarCoast = read.nextDouble();

        System.out.println("NonHybrid Car Goes miles par Gallon:");
        double NonHybridCarMilesParGallon = read.nextDouble();

        System.out.println("NonHybrid Car resale value:");
        double NonHybridCarResaleValue = read.nextDouble();
        CoastCalculator NonHybridCar = new CoastCalculator(NonHybridCarCoast,GasPrise,NonHybridCarMilesParGallon,NonHybridCarResaleValue);

        System.out.println("New Hybrid Car Coast in Five Years: " + NewHybridCar.getCoast() +" Dollars");
        System.out.println("Old Hybrid Car Coast in Five Years: " + OldHybridCar.getCoast() +" Dollars");
        System.out.println("Non Hybrid Car Coast in Five Years: " + NonHybridCar.getCoast() +" Dollars");

        if (NewHybridCar.getCoast() <= OldHybridCar.getCoast() && NewHybridCar.getCoast() <= NonHybridCar.getCoast())
                System.out.println("Buy New Hybrid Car") ;
        else System.out.println("Don't Buy");
    }
}