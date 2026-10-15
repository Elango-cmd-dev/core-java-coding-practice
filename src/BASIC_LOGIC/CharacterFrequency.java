package BASIC_LOGIC;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {

    public static void main(String[] args) {
        String input = "programming";
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : input.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}