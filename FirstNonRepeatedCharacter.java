//Given a String, find the first non repeated character in it using Stream function.

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Map<Character,Long> mp = str.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
        Optional<Character> ch = mp.entrySet().stream().filter(s -> s.getValue() == 1).map(s-> s.getKey()).findFirst();
        if(ch.isPresent())
        {
            System.out.println("The First non-repeated Character is: " + ch.get());
        }
        else
        {
            System.out.println("Every character is repeated!");
        }
        sc.close();
    
 }   
}
