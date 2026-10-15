package BASIC_LOGIC;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

    private static char findFirstNonRepeated(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String input = "swiss";
        char result = findFirstNonRepeated(input);
        if (result != '\0') {
            System.out.println("First non-repeated character: " + result);
        } else {
            System.out.println("No non-repeated character found");
        }
    }
}