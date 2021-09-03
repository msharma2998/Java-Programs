import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int reverse = revNum(number);
        System.out.println("The reverse of " + number + " is " + reverse);
        scan.close();
    }

    public static int revNum(int number) {
        int newNum=number;
        int count = -1; 
        while(newNum>0)
        {
            count=count+1;
            newNum=newNum/10;
        }
        newNum=0;
        while(number>0)
        {
            newNum+=(number%10) * (int)Math.pow(10,count);
            count--;
            number=number/10;            
        }
        return newNum;
    }
}
