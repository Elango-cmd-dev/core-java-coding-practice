package Collections;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatElement {

    public static void main(String[] args) {
        int[] input = {4, 5, 1, 2, 1, 4, 5};
        Map<Integer, Integer> map = new HashMap<>();
        for (int number : input) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }
        for (int number : input) {
            if (map.get(number) == 1) {
                System.out.println("First Non-Repeated Element: " + number);
                break;
            }
        }
    }
}