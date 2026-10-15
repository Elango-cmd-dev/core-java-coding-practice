package Java_08;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedCharacter {

    public static void main(String[] args) {
        String input = "swiss";
        Character result = input.chars()
                .mapToObj(c -> (char)c)
                .filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch))
                .findFirst()
                .orElse(null);
        System.out.println(result);
    }
}
