package Collections;

import java.util.HashMap;
import java.util.Map;

public class FindSameEmployeeSalary {

    public static void main(String[] args) {
        Map<String, Integer> employees = new HashMap<>();
        employees.put("John", 50000);
        employees.put("David", 30000);
        employees.put("Alex", 50000);
        employees.put("Sam", 40000);
        employees.put("Mike", 30000);

        Map<Integer, Integer> countSalary = new HashMap<>();
        for (Integer salary : employees.values()) {
            countSalary.put(salary,countSalary.getOrDefault(salary,0)+1);
        }
        for (Map.Entry<String, Integer> entry : employees.entrySet()) {
            if (countSalary.get(entry.getValue()) > 1) {
                System.out.println(
                        entry.getKey() + " → " + entry.getValue()
                );
            }
        }
    }
}
