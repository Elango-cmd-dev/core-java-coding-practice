package Java_08;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindHighestSalary {

    public static void main(String[] args) {
        Map<String, Integer> employees = new HashMap<>();
        employees.put("John", 50000);
        employees.put("David", 30000);
        employees.put("Alex", 70000);
        employees.put("Sam", 40000);
        employees.put("Mike", 60000);
        employees.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(System.out::println);
    }
}
