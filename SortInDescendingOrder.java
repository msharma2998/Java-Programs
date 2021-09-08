//Given a list of integers, sort all the values in it in descending order using Stream functions.

import java.util.*;
import java.util.stream.Collectors;

public class SortInDescendingOrder {
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
        List<Integer> result = numbers.stream().sorted((num1,num2) -> num2-num1).collect(Collectors.toList());
        System.out.println(result);
        sc.close();
    }
}
