package Java_08;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMinimumNumber {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 50, 30, 70, 20);
        Integer minimum = numbers.stream()
                .min(Comparator.naturalOrder())
                .orElse(null);
        System.out.println(minimum);
    }
}
