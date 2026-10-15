package Collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateElements {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 20, 40, 10, 50);
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer number : numbers) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
