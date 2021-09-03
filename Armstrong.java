import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        armstr(number);
        scan.close();
    }

    public static void armstr(int number) {
        int newNum=number;
        int count = 0; 
        while(newNum>0)
        {
            count=count+1;
            newNum=newNum/10;
        }
        int sum = 0;
        newNum=number;
        while(number>0)
        {
            sum=sum+(int)Math.pow(number%10,count);
            number=number/10;            
        }
        if(sum==newNum)
         System.out.println("It is an Armstrong number.");
         else
         System.out.println("It is not an Armstrong number.");
    }
}
