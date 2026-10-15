package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindSecondHighestSalary {

    public static void main(String[] args) {
        Map<String, Integer> employees = new HashMap<>();
        employees.put("John", 50000);
        employees.put("David", 30000);
        employees.put("Alex", 70000);
        employees.put("Sam", 40000);
        employees.put("Mike", 60000);

        List<Map.Entry<String, Integer>> list =
                new ArrayList<Map.Entry<String, Integer>>(employees.entrySet());
        list.sort(Map.Entry.<String, Integer>comparingByValue().reversed());
        Map.Entry<String, Integer> secondHighest = list.get(1);
        System.out.println(secondHighest.getKey() + " → " + secondHighest.getValue());
    }
}
