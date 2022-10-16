import java.util.Scanner;

public class EasterSunday {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        //Let y be the year (such as 1800 or 2001).
        System.out.print("Please input the year:");
        int year = read.nextInt();

        Calculation calculation = new Calculation(year);
       // calculation.setYear(year);

        calculation.getOutput();
    }
}
