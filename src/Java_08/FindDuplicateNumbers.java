package Java_08;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 20, 40, 10, 50);

        Map<Integer, Long> map = numbers.stream()
                .collect(Collectors.groupingBy(
                        number -> number,Collectors.counting()
                ));

        map.entrySet().stream()
                .filter(entry -> entry.getValue() > 1 )
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
