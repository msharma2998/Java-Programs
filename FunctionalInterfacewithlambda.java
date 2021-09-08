@FunctionalInterface
interface Power{
    int square(int x);
}

public class FunctionalInterfacewithlambda {
    public static void main(String[] args) {
        Power p = x -> x*x;

        int result = p.square(4);
        System.out.println("Result: "+result);
    }
}
