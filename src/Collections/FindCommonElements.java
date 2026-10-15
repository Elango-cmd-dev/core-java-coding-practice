package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindCommonElements {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> list2 = Arrays.asList(30, 40, 50, 60, 70);
        Set<Integer> set = new HashSet<>(list1);
        for (Integer number : list2) {
            if (set.contains(number)) {
                System.out.print(number + " ");
            }
        }
    }
}