@FunctionalInterface
interface Add
{
    int result(int a,int b);
}
public class FunctionalInterfacewithoutlambda {
    public static void main(String[] args) {
        Add a = new Add(){
            @Override
            public int result(int a,int b)
            {
                return a+b;
            }
        };
        int ans = a.result(5, 8);
        System.out.println("The result of addition is "+ans);
    }
}
