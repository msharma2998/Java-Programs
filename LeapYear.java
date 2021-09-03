import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        check(year);
        scan.close();
    }

    public static void check(int year) {
        if(year%400 == 0 || (year%4==0 && year%100!=0))
            System.out.println("It is a Leap Year");
        else
            System.out.println("It is not a Leap Year");
        
    }
}
