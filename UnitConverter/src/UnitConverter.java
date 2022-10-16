import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Convert from ?");
        String s1 = read.nextLine();
        System.out.println("Convert to ?");
        String s2 = read.nextLine();
        System.out.println("Value ?");
        double value = read.nextDouble();
        Converter converter = new Converter(s1,s2,value);
        System.out.println(value+" "+s1 +" = " + converter.getReturn() + s2);
    }
}
