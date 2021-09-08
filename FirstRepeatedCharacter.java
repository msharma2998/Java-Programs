//Given a String, find the first repeated character in it using Sream functions.

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Map<Character,Long> mp = str.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
        Optional<Character> ch = mp.entrySet().stream().filter(s -> s.getValue() > 1).map(s-> s.getKey()).findFirst();
        if(ch.isPresent())
        {
            System.out.println("The First repeated Character is: " + ch.get());
        }
        else
        {
            System.out.println("No character is repeated!");
        }
        sc.close();
    }
}
