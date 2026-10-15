package Java_08;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEmployeesByDepartment {

    public static void main(String[] args) {

        Map<String, String> employees = new HashMap<>();
        employees.put("John", "IT");
        employees.put("David", "HR");
        employees.put("Alex", "IT");
        employees.put("Sam", "Finance");
        employees.put("Mike", "HR");
        employees.put("Peter", "IT");

        Map<String, Long> departmentCount = employees.values()
                .stream()
                .collect(Collectors.groupingBy(department -> department,
                        Collectors.counting()
                ));
        departmentCount.forEach((department, count) ->
                System.out.println(department + " → " + count)
        );
    }
}
