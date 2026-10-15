package BASIC_LOGIC;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

    private static void findWordFrequency(String input) {
        Map<String, Integer> map = new HashMap<>();
        input = input.toLowerCase();
        String[] words = input.split(" ");
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String input = "java is easy and java is powerful";
        findWordFrequency(input);
    }
}