import java.util.Scanner;

public class LeapYearRunner {

    public static void main(String[] args) {

        //declare an object for "Scanner" class

        Scanner x = new Scanner(System.in);

        //get the input from the user

        System.out.print("Please enter a year: ");
        int year = x.nextInt();
        Calculation calculation = new Calculation(year);
        calculation.getOutput();
    }
}
