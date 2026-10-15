package Collections;

import java.util.HashMap;
import java.util.Map;

public class FindEmployeeGivenSalaryRange {

    public static void main(String[] args) {
        Map<String, Integer> employees = new HashMap<>();

        employees.put("John", 50000);
        employees.put("David", 30000);
        employees.put("Alex", 70000);
        employees.put("Sam", 40000);
        employees.put("Mike", 60000);

        int start = 40000;
        int end = 60000;

        for (Map.Entry<String, Integer> employee : employees.entrySet()) {
            if (employee.getValue() >= start && employee.getValue() <= end) {
                System.out.println(employee.getKey()+" -> "+employee.getValue());
            }
        }
    }
}
