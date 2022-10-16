import java.util.Scanner;
class MyClass {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String []name = new String[3];
        int []point = new int[3];
        for(int i = 0 ; i < 3 ; i++){
            name[i] = read.next();
            point[i] = read.nextInt();
        }
        if(point[0] > point[1] && point[0] > point[2])
            System.out.println(name[0]);
        else if (point[1] > point[0] && point[1] > point[2]) {
            System.out.println(name[1]);
        }
        else System.out.println(name[2]);
    }
}
