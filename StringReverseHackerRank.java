import java.util.*;

public class StringReverseHackerRank {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A=sc.next();
        String s="";
        for(int i=A.length()-1;i>=0;i--)
        {
            s=s+A.charAt(i);
        }
        if(A.equals(s))
        {
            System.out.println("Yes");
        }
        else
            System.out.println("No");
        sc.close();
    }
}



