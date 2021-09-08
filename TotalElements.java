//Given a list of integers, find the total number of elements present in the list using Stream functions.

import java.util.*;

public class TotalElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count of total numbers");
        int n= sc.nextInt();
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            int num=sc.nextInt();
            sc.nextLine();
            numbers.add(num);
        }
        int totalElements = (int)numbers.stream().count();
        System.out.println("The total elements present in the List are: "+ totalElements);
        sc.close();
    }
   
    
}
