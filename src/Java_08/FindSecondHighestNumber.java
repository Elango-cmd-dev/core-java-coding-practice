package Java_08;

import java.util.Arrays;
import java.util.List;

public class FindSecondHighestNumber {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 50,    30, 70, 60, 70);
        Integer result = numbers.stream()
                .distinct()
                .sorted((a, b) -> b.compareTo(a))
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(result);
    }
}
