import java.util.Scanner;

public class Factorial {
    public static int fact(int num) {
        if(num==0)
            return 1;
        return num*fact(num-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("Factorial of "+num+" is "+fact(num));
        scan.close();
    }
}
