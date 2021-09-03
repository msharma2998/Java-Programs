import java.util.*;
public class Fibonacci {
    
    public static int fib(int number)
    {
        
        if(number==1 || number==0)
            return number;
        return fib(number-1) + fib(number-2);
        
    }
    public static void main(String[] args) {
        System.out.println("Which Fibonacci number you wanna know(>0)?");
        Scanner sc =  new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num+"-th fibonacci number is " + fib(num-1));
        sc.close();
    }
}
