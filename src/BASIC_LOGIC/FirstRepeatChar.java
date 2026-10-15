package BASIC_LOGIC;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatChar {

    private static char findFirstRepeated(String input) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : input.toCharArray()) {
            if (map.get(c) > 1) {
                return c;
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String input = "programming";
        char result = findFirstRepeated(input);
        if (result != '\0') {
            System.out.println("First repeated character: " + result);
        } else {
            System.out.println("No repeated character");
        }
    }
}