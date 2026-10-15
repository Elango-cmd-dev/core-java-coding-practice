package BASIC_LOGIC;

import java.util.*;

public class FindDuplicate {

    private static List<Integer> findDuplicates(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 2, 4, 5, 1};
        System.out.print(findDuplicates(input));
    }
}
