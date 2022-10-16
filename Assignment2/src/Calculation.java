public class Calculation {
    String []months = {"January","February","March","April","May","june","July","August","September"
            ,"October","November","December"};
    private int day , month;
    public Calculation(int year) {
        int a = year % 19;
        //Divide y by 100 to get a quotient b and a remainder c.
        int b = year / 100;
        int c = year % 100;
        //Divide b by 4 to get a quotient d and a remainder e.
        int d = b / 4;
        int e = b % 4;
        //Divide 8 * b + 13 by 25 to get a quotient g. Ignore the remainder.
        int g = (8 * b + 13) / 25;
        //Divide 19 * a + b - d - g + 15 by 30 to get a remainder h. Ignore the quotient.
        int h =  (19 * a + b - d - g + 15) % 30 ;
        // Divide c by 4 to get a quotient j and a remainder k.
        int j = c / 4; int k = c % 4;
        //Divide a + 11 * h by 319 to get a quotient m. Ignore the remainder.
        int m = (a + 11 * h) / 319;
        //Divide 2 * e + 2 * j - k - h + m + 32 by 7 to get a remainder r. Ignore the quotient.
        int r = (2 * e + 2 * j - k - h + m + 32) % 7;
        //Divide h - m + r + 90 by 25 to get a quotient n. Ignore the remainder.
        int n = (h - m + r + 90) / 25;
        //Divide h - m + r + n + 19 by 32 to get a remainder p. Ignore the quotient.
        int p = (h - m + r + n + 19) % 32;
        month = n - 1;
        day = p;
    }
    //Divide y by 19 and call the remainder a . Ignore the quotient.

    public void getOutput() {
        System.out.println("The Date is : " + months[month] + " " + day);
    }
}
