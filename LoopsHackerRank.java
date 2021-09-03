import java.util.*;
public class LoopsHackerRank {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int prev;
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            prev=a;
            for(int j=0;j<n;j++)
            {
                System.out.print(prev + (int)Math.pow(2,j)*b+" ");
                prev=prev + (int)Math.pow(2,j)*b;
            }
            System.out.print("\n");
        }
        in.close();
    }
}
