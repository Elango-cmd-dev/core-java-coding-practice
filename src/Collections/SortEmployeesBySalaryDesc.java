package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortEmployeesBySalaryDesc {

    public static void main(String[] args) {
        Map<String, Integer> employees = new HashMap<>();
        employees.put("John", 50000);
        employees.put("David", 30000);
        employees.put("Alex", 70000);
        employees.put("Sam", 40000);
        List<Map.Entry<String, Integer>> list =
                new ArrayList<>(employees.entrySet());
        list.sort(
                Map.Entry.<String, Integer>comparingByValue().reversed()
        );
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}