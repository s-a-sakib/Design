import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        double x1,x2,x3,y1,y2,y3;
        Scanner read = new Scanner(System.in);
        System.out.println("please input first corner X1 and Y1");
        x1 = read.nextDouble();
        y1 = read.nextDouble();
        System.out.println("please input first corner X2 and Y2");
        x2 = read.nextDouble();
        y2 = read.nextDouble();
        System.out.println("please input first corner X3 and Y3");
        x3 = read.nextDouble();
        y3 = read.nextDouble();

        if(x1 == x2 && x2 == x3 && y1 == y2 && y2 == y3){
            System.out.println("This is a point , not a triangle");
            return;
        }

        //Object for length
        LengthOfAllSides lengthOfAllSides = new LengthOfAllSides();
        lengthOfAllSides.getLengthOfAllSides(x1,y1,x2,y2,x3,y3);

        double a = lengthOfAllSides.getLength1();
        double b = lengthOfAllSides.getLength2();
        double c = lengthOfAllSides.getLength3();

        System.out.printf("Length of First Side :  " + "%.2f\n",a);
        System.out.printf("Length of Second Side :  " + "%.2f\n",b);
        System.out.printf("Length of Third Side :  " + "%.2f\n\n",c);

        System.out.printf("Perimeter of The Triangle : " +"%.2f\n",a+b+c);

        //object for length
        AnglesOfCorners anglesOfCorners = new AnglesOfCorners(a,b,c);
        double A = anglesOfCorners.getAngleA();
        double B = anglesOfCorners.getAngleB();
        double C = anglesOfCorners.getAngleC();

        System.out.printf("Angle A : " + "%.1f\n",Math.toDegrees(A));
        System.out.printf("Angle B : " + "%.1f\n",Math.toDegrees(B));
        System.out.printf("Angle C : " + "%.1f\n",Math.toDegrees(C));

        // Area of a triangle
        Area area = new Area(a,b,c);
        System.out.printf("Area : " + "%.1f\n" ,area.getArea());
    }
}
