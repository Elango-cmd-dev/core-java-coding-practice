package Java_08;

import java.util.Arrays;
import java.util.List;

public class FindSumAllNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        Integer result = numbers.stream().mapToInt(n -> n).sum();
        System.out.println(result);
    }
}
