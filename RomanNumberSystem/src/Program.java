import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        blowing blowing = new blowing();
        for(int i = 0; i < 3 ; i++) {
            String name = read.nextLine();
            int point = read.nextInt();
            blowing.setValue(name,point);
        }
    }
}
