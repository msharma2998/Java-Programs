import java.util.*;
public class SubstringComparisonHackerRank {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = "";
        int len= s.length()-k+1;
        for(int i=0;i<len;i++)
        {
            String s1= s.substring(i,i+k);
            if(s1.compareTo(largest)>0)
                largest = s1;
            if(s1.compareTo(smallest)<0)
                smallest = s1;
        }
    
        return smallest + "\n" + largest;

}

//already given code by hackerrank
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    int k = scan.nextInt();
    scan.close();
  
    System.out.println(getSmallestAndLargest(s, k));
}
}
