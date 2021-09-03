import java.util.Scanner;

public class ConditionHackerRank { 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        if(N%2!=0 || (N%2==0 && N<=20 && N>=6))
            System.out.println("Weird");
        else
            System.out.println("Not Weird");
        scan.close();
    }
}
