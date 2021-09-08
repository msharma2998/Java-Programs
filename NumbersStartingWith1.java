//Given a list of integers, find out all the numbers starting with 1 using Stream functions.

import java.util.*;
import java.util.stream.Collectors;

public class NumbersStartingWith1 {
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
        List<Integer> result = numbers.stream().map(i -> i.toString()).filter(s -> s.startsWith("1")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
        System.out.println(result);
        sc.close();
    }
}
