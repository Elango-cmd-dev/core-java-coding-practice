package BASIC_LOGIC;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharFrequency {

    private static void findDuplicates(String input) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " → " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        String input = "programming";
        findDuplicates(input);
    }
}