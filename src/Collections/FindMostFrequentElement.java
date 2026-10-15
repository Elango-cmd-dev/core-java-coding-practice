package Collections;

import java.util.HashMap;
import java.util.Map;

public class FindMostFrequentElement {

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 2, 4, 2, 5, 3};
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : input) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int mostFrequent = 0;
        int maxFrequency = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        System.out.println("Most frequent element: " + mostFrequent);
        System.out.println("Frequency: " + maxFrequency);
    }
}