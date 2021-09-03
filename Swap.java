import java.util.Scanner;

public class Swap {
    public static int x;
    public static int y;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        sc.nextLine();
        y=sc.nextInt();
        System.out.println("Old Values are:- x = "+x+" and y = "+y);
        int temp=x;
        x=y;
        y=temp;
        System.out.println("New Values are:- x = "+x+" and y = "+y);
        sc.close();
    }
}
