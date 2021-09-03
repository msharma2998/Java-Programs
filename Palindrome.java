import java.util.Scanner;

public class Palindrome {
    public static void pali(String s)
    {
        int len=s.length();
        int n =len/2;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i) != s.charAt(len-1-i))
            {
                System.out.println("It is not a Palindrome.");
                return;
            }
            
        }
        System.out.println("It is a Palindrome.");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        pali(s.toLowerCase());
        scan.close();
}
}
    
