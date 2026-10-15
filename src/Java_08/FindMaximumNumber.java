package Java_08;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindMaximumNumber {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 50, 30, 70, 20);
        Integer maximum = numbers.stream()
                .max(Integer::compareTo)
                .orElse(null);
        System.out.println(maximum);
    }
}
