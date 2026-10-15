package BASIC_LOGIC;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateChar {

    private static void removeDuplicateChar(String input) {
        Set<Character> set = new HashSet<>();
        for (char c : input.toCharArray()) {
            if (set.add(c)) {
                System.out.print(c);
            }
        }
    }

    public static void main(String[] args) {
        String input = "programming";
        removeDuplicateChar(input);
    }
}